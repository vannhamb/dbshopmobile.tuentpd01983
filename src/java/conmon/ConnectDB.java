package conmon;



import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author WIN pl
 */
public class ConnectDB {
    private Connection con = null;
    public Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbshopmobile","root","");
             System.out.println("ok1");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
    } 
}
