import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieExample extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        // Create a cookie
        Cookie cookie = new Cookie("name", "John Doe");

        // Set the maximum age of the cookie
        cookie.setMaxAge(60 * 60 * 24); // 24 hours

        // Add the cookie to the response
        response.addCookie(cookie);

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Cookie Example</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<p>Your name has been set to <b>" + cookie.getName() + "</b>. This cookie will expire in 24 hours.</p>");
        pw.println("</body>");
        pw.println("</html>");
    }
}