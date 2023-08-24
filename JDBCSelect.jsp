<!-- 2019 Spring
   5 a) Define JDBC. Write a JSP program using JDBC to display name, age, phone and address
        (in tabular format) of those customers who lives in “kshetrapur” and age is less than
        30 years (make your own assumptions for table and database). -->

<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Information</title>
</head>
<body>

<%
    // JDBC connection parameters
    String jdbcUrl = "jdbc:mysql://localhost:3306/customer_db";
    String username = "your_db_username";
    String password = "your_db_password";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

        String sql = "SELECT name, age, phone, address FROM customer WHERE address = 'kshetrapur' AND age < 30";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
%>

    <h1>Customer Information</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Phone</th>
            <th>Address</th>
        </tr>
<%
        while (rs.next()) {
%>
        <tr>
            <td><%= rs.getString("name") %></td>
            <td><%= rs.getInt("age") %></td>
            <td><%= rs.getString("phone") %></td>
            <td><%= rs.getString("address") %></td>
        </tr>
<%
        }
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
    </table>

</body>
</html>
