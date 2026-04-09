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

@WebServlet("/Register")
public class Register extends HttpServlet{

    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        System.out.println("Control in servlet");
        
        String uname = request.getParameter("uname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String city = request.getParameter("city");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/registerdb";
            String user="root";
            String pass = "Niru__0308#";
            Connection connect = DriverManager.getConnection(url, user, pass);

            PreparedStatement pstmnt = connect.prepareStatement("Insert into personalinfo (uname, email, password, city) values(?, ?, ?, ?)");
            pstmnt.setString(1, uname);
            pstmnt.setString(2, email);
            pstmnt.setString(3, password);
            pstmnt.setString(4, city);

            int rows = pstmnt.executeUpdate();

            PrintWriter pw = response.getWriter();
            if (rows != 0){
                pw.println("<h1>Registeration Success</h1>");
            }
            else{
                pw.println("<h1>Registeration Fail</h1>");
            }
            pstmnt.close();
            pw.close();
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
