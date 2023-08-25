import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieExample extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create a cookie
        Cookie cookie = new Cookie("name", "John Doe");

        // Set the maximum age of the cookie
        cookie.setMaxAge(60 * 60 * 24); // 24 hours

        // Add the cookie to the response
        response.addCookie(cookie);

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cookie Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Your name has been set to <b>" + cookie.getName() + "</b>. This cookie will expire in 24 hours.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}