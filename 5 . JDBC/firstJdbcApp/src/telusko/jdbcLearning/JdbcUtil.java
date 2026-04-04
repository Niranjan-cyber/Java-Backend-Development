package telusko.jdbcLearning;

import java.sql.*;

// all the common operations

public class JdbcUtil {
    static {
        // Load and Register the Driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String user = "root";
            String password = "root123";
            return DriverManager.getConnection(url, user, password);
    }

    public static void closeConnection(Connection connect, Statement statement) throws SQLException{
        statement.close();
        connect.close();
    }
}
