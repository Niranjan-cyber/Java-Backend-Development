package telusko.jdbcLearning;

import java.sql.*;                 // 1. Import Packages

public class launchApp2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // 2. Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 3. Establish the connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "";
        Connection connect = DriverManager.getConnection(url, user, password);
        
        // 4. Create statement object
        Statement statement = connect.createStatement();

        // 5. Execute the query
        String sql = "update studentinfo set sage = 24 where id=1";
        int rowAff = statement.executeUpdate(sql);
        
        // 6. Process the result
        if (rowAff == 0) System.out.println("update failed");
        else System.out.println("success");

        // 7. Close all the resources
        statement.close();
        connect.close();
    }
}
