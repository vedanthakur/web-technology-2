// The program will get data from this url
// http://localhost:8080/HelloForm?name=Gazal
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloForm extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get the name parameter
        String name = request.getParameter("name");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Form</title>");
        out.println("</head>");
        out.println("<body>");
        if (name != null) {
            out.println("<p>Hello, <b>" + name + "</b>!</p>");
        }
        out.println("<p>Please specify your name.</p>");
        out.println("</body>");
        out.println("</html>");

    }
}
