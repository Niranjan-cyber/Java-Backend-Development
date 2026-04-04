package telusko.jdbcLearning;

import java.sql.*;                 // 1. Import Packages
import java.util.Scanner;

public class launchApp7 {
    public static void main(String[] args) {
        // method level so we can use them everywhere
        Connection connect = null;   
        PreparedStatement pstmt = null;
        Scanner scan = null;

        try {
            
             // 2. Load and Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 3. Establish the connection
            connect = JdbcUtil.getConnection();
            
            // 4. Create statement object
            //statement = connect.createStatement();
            String query = "insert into studentinfo(id, sname, sage, scity) values(?,?,?,?)";
            pstmt= connect.prepareStatement(query);

            scan = new Scanner(System.in);
            Integer id = scan.nextInt();
            String name = scan.next();
            Integer age = scan.nextInt();
            String city = scan.next();
            
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(4, city);
            pstmt.setInt(3, age);


            // 5. Execute the query
            int rowAff = pstmt.executeUpdate();
            //  = statement.execute(sql);
            
            // 6. Process the result
            if (rowAff == 0) System.out.println("insert unsuccessful");
            else System.out.println("insert successful");
    
            
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
                scan.close();
                connect.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

