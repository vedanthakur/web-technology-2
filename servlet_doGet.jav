import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloForm extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\"> \n";
        try {
            out.println(docType + "<p>First Name: " + request.getParameter("first_name") + "<br>Second Name: " + request.getParameter("last_name") + "</p>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
