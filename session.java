import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionExampleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        HttpSession session = request.getSession(); // Retrieve or create a session

        Integer visitCount = (Integer) session.getAttribute("visitCount"); // Get the visit count from session
        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }
        // same as in php, 
        // $_SESSION["visitCount"] = $visitcount;
        session.setAttribute("visitCount", visitCount); // Update the visit count in session

        printWriter.println("<html><head><title>Session Example</title></head><body>");
        printWriter.println("<h1>Session Example</h1>");
        printWriter.println("<p>Session ID: " + session.getId() + "</p>");
        printWriter.println("<p>Visit Count: " + visitCount + "</p>");
        printWriter.println("</body></html>");
    }
}
