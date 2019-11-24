
import java.sql.*;
import javax.swing.JOptionPane;
public class DatabaseConnection {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/praktikumpbo";//nama database
    static final String USER = "root";
    static final String PASS = "";
    private static Connection connection;
    
    public static Connection getConnection(){
        if(connection == null){
            try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getStackTrace());
            System.out.println("Koneksi gagal");
        }
        }
            return connection;
    }
    
}
