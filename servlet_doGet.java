// The program will get data from this url
// http://localhost:8080/HelloForm?name=Gazal
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloForm extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        // Get the name parameter
        String name = request.getParameter("name");

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Hello Form</title>");
        pw.println("</head>");
        pw.println("<body>");
        if (name != null) {
            pw.println("<p>Hello, <b>" + name + "</b>!</p>");
        }
        pw.println("<p>Please specify your name.</p>");
        pw.println("</body>");
        pw.println("</html>");

    }
}
