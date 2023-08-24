// The program will get data from form submited via post method
// code is same as get method, only doPost() is used instead of doGet()

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DoPostExample extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        // Get the name parameter
        String name = request.getParameter("name");

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>DoPost Example</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<p>Hello, <b>" + name + "</b>!</p>");
        pw.println("</body>");
        pw.println("</html>");
    }
}