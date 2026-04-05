import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet{
    public RegisterServlet(){
        System.out.println("servlet object is creatd internally by container");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        PrintWriter writer = response.getWriter();

        response.sendRedirect("success.jsp");
    }
}
