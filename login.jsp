<%@ page import="java.sql.*" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

<h1>Login</h1>

<form action="login.jsp" method="post">
    <input type="text" name="username" placeholder="Username">
    <input type="password" name="password" placeholder="Password">
    <input type="submit" value="Login">
</form>

<%
    // JDBC connection parameters
    String jdbcUrl = "jdbc:mysql://192.168.10.20/mydb";
    String username = "admin";
    String password = "pass";

    try {
        // Load the JDBC driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the database
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

        // Create a statement
        Statement stmt = conn.createStatement();

        // Check if the username and password exist in the database
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()) {
            // Username and password exist
            // Redirect the user to the home page
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            // Username and password do not exist
            // Display an error message
            %>
            <p>Username or password is incorrect.</p>
            <%
        }

        // Close the database resources
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>
