
package Project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon()
    {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hostel","root","2672");
                return con;
            }
            catch(Exception e)
            {
                return null;
            
            }
            
            
    }
    
}
