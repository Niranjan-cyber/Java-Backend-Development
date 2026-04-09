import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil { 
    // runs once class is loaded automatically loads the driver
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Driver is registered");
    }
    
    public static Connection getDBConnection() throws SQLException{
        String url="jdbc:mysql://localhost:3306/registerdb";
        String user="root";
        String pass = "Niru__0308#";
        return DriverManager.getConnection(url, user, pass);

    }
    public static void closeResource(Connection connect, PreparedStatement pstmt) throws SQLException{
        connect.close();
        pstmt.close();
    }
}
