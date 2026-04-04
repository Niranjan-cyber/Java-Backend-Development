package defaultPack;

import java.sql.DriverManager;
import java.sql.SQLException;

public class launchClass {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    }
}

class Demo{
    static{
        System.out.println("in static");
    }
    {
        System.out.println("out static");
    }
}
