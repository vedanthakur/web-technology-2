// The program will get data from form submited via post method
// code is same as get method, only doPost() is used instead of doGet()

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DoPostExample extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get the name parameter
        String name = request.getParameter("name");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>DoPost Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Hello, <b>" + name + "</b>!</p>");
        out.println("</body>");
        out.println("</html>");
    }
}