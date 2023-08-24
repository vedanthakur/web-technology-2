import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionExample extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get the session object
        HttpSession session = request.getSession();

        // Set the session attribute
        session.setAttribute("name", "John Doe");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Session Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Your name has been set to <b>" + session.getAttribute("name") + "</b>.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}