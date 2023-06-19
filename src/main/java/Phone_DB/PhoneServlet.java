package Phone_DB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;

@WebServlet("/PhoneDB")
public class PhoneServlet extends HttpServlet {
    private PhoneUtilDB phoneDb;
    private DataSource dataSource;


    @Override
    public void init() throws ServletException {
        super.init();
        try {
            phoneDb = new PhoneUtilDB(dataSource);
        } catch (Exception exc) {
            throw new ServletException(exc);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String theCommand = request.getParameter("command");
            if (theCommand == null) {
                listPhone(request, response);
            } else {
                switch (theCommand) {
                    case "ADD":
                        addPhone(request, response);
                        break;
                    case "LOAD":
                        loadPhone(request, response);
                        break;
                    default:
                        listPhone(request, response);
                }
            }
        } catch (Exception exc) {
            throw new ServletException(exc);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public void addPhone(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.printf("========>>>>>>>>>");
        String name = request.getParameter("name");
        String trademark = request.getParameter("trademark");
        double price = Double.parseDouble(request.getParameter("price"));
        String painted = request.getParameter("painted");
        Phone phone = new Phone(name, trademark, price, painted);
        phoneDb.addPhone(phone);

        // Chuyển hướng về trang chủ sau khi thêm thành công
        response.sendRedirect(request.getContextPath() + "/PhoneDB");
    }


    public void loadPhone(HttpServletRequest request, HttpServletResponse response) throws Exception {
    }
    private void listPhone(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.printf("========>>>>>>>>>jfjfjjfjfjfjff");
        List<Phone> p = phoneDb.getlistphone();
        request.setAttribute("PHONE_LIST", p);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list-phone.jsp");
        dispatcher.forward(request, response);
    }
}
