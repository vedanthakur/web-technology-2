import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewriting extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        // Rewrite the URL
        String rewrittenURL = response.encodeURL("/HelloForm?name=" + name);

        out.println("<html>");
        out.println("<head>");
        out.println("<title>URL Rewriting</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>The rewritten URL is <a href=\"" + rewrittenURL + "\">" + rewrittenURL + "</a>.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}