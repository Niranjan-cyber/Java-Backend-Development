package telusko.jdbcLearning;

import java.sql.*;                 // 1. Import Packages

public class launchApp6 {
    public static void main(String[] args) {
        // method level so we can use them everywhere
        Connection connect = null;   
        Statement statement = null; 

        try {
            
             // 2. Load and Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 3. Establish the connection
            connect = JdbcUtil.getConnection();
            
            // 4. Create statement object
            statement = connect.createStatement();
    
            // 5. Execute the query
            String sql = "select * from students";
            boolean status = statement.execute(sql);
            
            // 6. Process the result
            if (status) System.out.println("fetch data operations");
            else System.out.println("all the other non select operations");
    
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        finally{
            // 7. Close all the resources
            try {
                JdbcUtil.closeConnection(connect, statement);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

