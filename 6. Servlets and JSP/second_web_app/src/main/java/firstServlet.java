import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet{
    private static final long serialVersionUID=1L;

    public firstServlet(){
        System.out.println("servlet object created by the container");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String name = request.getParameter("uname"); 
        String city = request.getParameter("ucity");
        
        // allows to print locally
        PrintWriter write = response.getWriter();
    
        write.println("Hello " + name);
        write.println("from " + city);
        
        write.close();
    }
}
