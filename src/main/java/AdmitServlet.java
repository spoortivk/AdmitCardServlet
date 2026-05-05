import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/admit")
public class AdmitServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String usn = request.getParameter("usn");
        String branch = request.getParameter("branch");
        String sem = request.getParameter("sem");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Admit Card</title>");
        out.println("<style>");

        out.println("body { font-family: Arial; background:#f2f2f2; text-align:center; }");
        out.println(".card { background:white; padding:20px; margin:50px auto; width:500px; border-radius:10px; box-shadow:0 0 10px gray; }");
        out.println("table { width:100%; border-collapse:collapse; }");
        out.println("th, td { padding:8px; border:1px solid black; }");

        out.println("</style></head><body>");

        out.println("<div class='card'>");

        out.println("<h2>B.L.D.E.A's V.P. Dr. P.G. Halakatti College of Engineering and Technology</h2>");
        out.println("<h3>Admit Card</h3>");

        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>USN:</b> " + usn + "</p>");
        out.println("<p><b>Branch:</b> " + branch + "</p>");
        out.println("<p><b>Semester:</b> " + sem + "</p>");

        out.println("<h3>Exam Schedule</h3>");
        out.println("<table>");
        out.println("<tr><th>Subject</th><th>Date</th><th>Time</th></tr>");
        out.println("<tr><td>Maths</td><td>10 May</td><td>10 AM</td></tr>");
        out.println("<tr><td>Physics</td><td>12 May</td><td>10 AM</td></tr>");
        out.println("<tr><td>Java</td><td>15 May</td><td>2 PM</td></tr>");
        out.println("<tr><td>DBMS</td><td>18 May</td><td>2 PM</td></tr>");
        out.println("</table>");

        out.println("<h3>Instructions</h3>");
        out.println("<ul>");
        out.println("<li>Carry ID card</li>");
        out.println("<li>Reach 30 minutes early</li>");
        out.println("<li>No electronic devices allowed</li>");
        out.println("</ul>");

        out.println("</div></body></html>");
    }
}