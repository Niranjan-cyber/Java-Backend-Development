import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Register")
public class Register extends HttpServlet{

    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        System.out.println("Control in servlet");
        
        String uname = request.getParameter("uname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String city = request.getParameter("city");

        Model model = new Model();
        model.setUname(uname);
        model.setEmail(email);
        model.setPassword(password);
        model.setCity(city);

        
        int row;
        HttpSession session = request.getSession();
        session.setAttribute("uname", uname);
        row = model.register();
        if (row == 0){
            response.sendRedirect("failure.jsp");
        }
        else {
            response.sendRedirect("success.jsp");
        }
        
    }
}
