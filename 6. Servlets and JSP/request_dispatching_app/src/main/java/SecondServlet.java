import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        System.out.println("control in second servlet");
        HttpSession session = request.getSession(false);

        String name = (String) session.getAttribute("name");

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Response from servlet2</h1>" + "<h1>" +name+ "</h1>");
        writer.close();
    }
}