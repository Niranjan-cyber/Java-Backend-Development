import java.io.Exception;

@WebServlet("/ServletLifecyle")
public class ServletLifecycle extends HttpServlet{
    static{
        System.out.println("servlet is loaded");
    }

    public ServletLife(){
        System.out.println("Servlet object is created");
    }

    public void init(ServletConfig config){
        System.out.println("servlet initialized");
    }

    protected void service(HttpServletRequest request){
        
    }
}
