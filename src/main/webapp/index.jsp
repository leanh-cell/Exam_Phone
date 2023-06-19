<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="PhoneDB">Hello Servlet</a>
</body>
<%--<head>--%>
<%--  <title>Title</title>--%>
<%--  <style>--%>
<%--    /* CSS cho bảng */--%>
<%--    table {--%>
<%--      width: 100%;--%>
<%--      border-collapse: collapse;--%>
<%--    }--%>

<%--    th, td {--%>
<%--      padding: 8px;--%>
<%--      text-align: left;--%>
<%--      border-bottom: 1px solid #ddd;--%>
<%--    }--%>

<%--    th {--%>
<%--      background-color: #f2f2f2;--%>
<%--    }--%>

<%--    /* CSS cho nút "Add Phone" */--%>
<%--    .add-phone-button {--%>
<%--      background-color: #9dbd58;--%>
<%--      color: white;--%>
<%--      border: none;--%>
<%--      padding: 10px 20px;--%>
<%--      text-align: center;--%>
<%--      text-decoration: none;--%>
<%--      display: inline-block;--%>
<%--      font-size: 14px;--%>
<%--      margin: 10px 0;--%>
<%--      cursor: pointer;--%>
<%--    }--%>
<%--  </style>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div id="container">--%>
<%--  <div id="content">--%>
<%--    <input type="button" value="Add Phone" onclick="window.location.href='add_phone.jsp'; return false;" class="add-phone-button" />--%>
<%--    <table>--%>
<%--      <tr>--%>
<%--        <th>Name:</th>--%>
<%--        <th>trademark</th>--%>
<%--        <th>painted:</th>--%>
<%--        <th>Price:</th>--%>
<%--      </tr>--%>
<%--      <c:forEach var="tempPhone" items="${PHONE_LIST}">--%>
<%--        <tr>--%>
<%--          <td>${tempPhone.name}</td>--%>
<%--          <td>${tempPhone.trademark}</td>--%>
<%--          <td>${tempPhone.painted}</td>--%>
<%--          <td>${tempPhone.price}</td>--%>
<%--        </tr>--%>
<%--      </c:forEach>--%>
<%--    </table>--%>
<%--  </div>--%>
<%--</div>--%>
<%--</body>--%>
</html>