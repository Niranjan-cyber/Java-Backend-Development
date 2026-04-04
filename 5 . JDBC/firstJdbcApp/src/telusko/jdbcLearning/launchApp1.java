package telusko.jdbcLearning;
import java.sql.*;                 // 1. Import Packages

public class launchApp1 {
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
        String sql = "insert into studentInfo(id, sname, sage, scity) values(1, 'Rohan', 17, 'Bengaluru')";
        int rowAff = statement.executeUpdate(sql);  // for non select operations
        
        // 6. Process the result
        if (rowAff == 0) System.out.println("unable to insert data");
        else System.out.println("data inserted successfully");

        // 7. Close all the resources
        statement.close();
        connect.close();
    }
}
