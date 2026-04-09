import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("control in first servlet");

        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServlet");

        HttpSession session = request.getSession();
        //session.setMaxInactiveInterval(10000);

        session.setAttribute("name", name);
        session.setAttribute("city", city);

        reqDispatch.forward(request, response);
        //reqDispatch.include(request, response);

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Response from servlet1<h1>");
        writer.close();
    }
}
