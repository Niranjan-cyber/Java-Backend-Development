import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
    private String uname;
    private String email;
    private String password;
    private String city;
    private Connection connect = null;
    private PreparedStatement pstmnt = null;
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int register() {
        try{
            connect = JdbcUtil.getDBConnection();
            String sql = "Insert into personalinfo (uname, email, password, city) values(?, ?, ?, ?)";
            pstmnt = connect.prepareStatement(sql);

            pstmnt.setString(1, uname);
            pstmnt.setString(2, email);
            pstmnt.setString(3, password);
            pstmnt.setString(4, city);

            int row = pstmnt.executeUpdate();
            return row;
        }
        catch (SQLException e){
            e.getStackTrace();
        }
        finally{
            try {
                JdbcUtil.closeResource(connect, pstmnt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }    
}
