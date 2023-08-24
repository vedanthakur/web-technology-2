<!-- 2019 Spring
   5 a) Define JDBC. Write a JSP program using JDBC to display name, age, phone and address
        (in tabular format) of those customers who lives in “kshetrapur” and age is less than
        30 years (make your own assumptions for table and database). -->
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.*" %>
<%
// Get the connection to the database
Connection conn = null;
try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
} catch (SQLException e) {
    e.printStackTrace();
}

// Prepare the statement
Statement stmt = conn.createStatement();

// Get the list of customers
String sql = "SELECT name, age, phone, address FROM customers WHERE address = 'kshetrapur' AND age < 30";
ResultSet rs = stmt.executeQuery(sql);

// Create a table to display the results
out.println("<table>");
out.println("<tr>");
out.println("<th>Name</th>");
out.println("<th>Age</th>");
out.println("<th>Phone</th>");
out.println("<th>Address</th>");
out.println("</tr>");

// Iterate through the results and display each customer
while (rs.next()) {
    String name = rs.getString("name");
    int age = rs.getInt("age");
    String phone = rs.getString("phone");
    String address = rs.getString("address");

    out.println("<tr>");
    out.println("<td>" + name + "</td>");
    out.println("<td>" + age + "</td>");
    out.println("<td>" + phone + "</td>");
    out.println("<td>" + address + "</td>");
    out.println("</tr>");
}

// Close the statement and connection
stmt.close();
conn.close();

// Close the output stream
out.close();
%>