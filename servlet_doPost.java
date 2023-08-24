// The program will get data from form submited via post method
// code is same as get method, only doPost() is used instead of doGet()

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloForm extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType = "<html><head><title>Names</title></head><body>";
        try {
            out.println(docType + "<p>First Name: " + request.getParameter("first_name") + "<br>Second Name: " + request.getParameter("last_name") + "</p></body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
