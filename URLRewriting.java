import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewriting extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String name = request.getParameter("name");

        // Rewrite the URL
        String rewrittenURL = response.encodeURL("/HelloForm?name=" + name);

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>URL Rewriting</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<p>The rewritten URL is <a href=\"" + rewrittenURL + "\">" + rewrittenURL + "</a>.</p>");
        pw.println("</body>");
        pw.println("</html>");
    }
}