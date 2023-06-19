package Phone_DB;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneUtilDB {
    private DataSource dataSource;

    public PhoneUtilDB(DataSource theDataSource) {
        dataSource = theDataSource;
    }

    public List<Phone> getlistphone() throws Exception {
        List<Phone> phones = new ArrayList<>();

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try{
            String url = "jdbc:mysql://localhost:3306/Phone_DB";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");

            myConn = DriverManager.getConnection(url,username,password);

            String sql = "select * from Phone";

            myStmt = myConn.createStatement();

            myRs = myStmt.executeQuery(sql);

            while (myRs.next()){
                int id = myRs.getInt("id");
                String name = myRs.getString("name");
                String trademark = myRs.getString("trademark");
                double price = myRs.getDouble("price");
                String painted = myRs.getString("painted");
                Phone phone = new Phone(id, name, trademark, price, painted);

                phones.add(phone);
            }
            return phones;
        }
        finally {
            close(myConn, myStmt, myRs);
        }
    }
    public void addPhone(Phone lPhone) throws Exception {
        Connection myConn = null;
        PreparedStatement myStmt = null;

        try{
            String url = "jdbc:mysql://localhost:3306/Phone_DB";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            myConn = DriverManager.getConnection(url, username, password);

            String sql = "insert into Phone" + "(name, trademark, price, painted)" + "values (?, ?, ?, ?)";

            myStmt = myConn.prepareStatement(sql);

            myStmt.setString(1, lPhone.getName());
            myStmt.setString(2, lPhone.getTrademark());
            myStmt.setString(3, String.valueOf((lPhone.getPrice())));
            myStmt.setString(4, lPhone.getPainted());

            myStmt.execute();
        }
        finally {
            close(myConn, myStmt, null);
        }
    }


    private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
        try {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }


}