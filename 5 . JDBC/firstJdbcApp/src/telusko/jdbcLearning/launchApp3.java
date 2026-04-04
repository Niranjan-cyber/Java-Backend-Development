package telusko.jdbcLearning;

import java.sql.*;                 // 1. Import Packages

public class launchApp3 {
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
        String sql = "select * from studentinfo";
        ResultSet rs = statement.executeQuery(sql);
        
        // 6. Process the result
        while(rs.next()){
            System.out.println(rs.getInt(1) + ' ' + rs.getString(2)
        + ' ' + rs.getInt("sage") + ' ' + rs.getString(4));
        }

        // 7. Close all the resources
        rs.close();
        statement.close();
        connect.close();
    }
}

