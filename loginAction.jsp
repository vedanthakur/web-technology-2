<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Action</title>
</head>
<body>
    <%
        String dbUrl = "jdbc:mysql://192.168.10.20:3306/dbname";
        String dbUsername = "admin";
        String dbPassword = "pass";
        
        String inputUsername = request.getParameter("username");
        String inputPassword = request.getParameter("password");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM users WHERE username='" + inputUsername + "' AND password='" + inputPassword + "'";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                // Successful login
                out.println("Login successful!");
            } else {
                // Invalid login
                out.println("Invalid username or password.");
            }
            
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    %>
</body>
</html>
