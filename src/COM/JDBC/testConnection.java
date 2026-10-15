package COM.JDBC;
import java.sql.Connection;

public class testConnection {

    public static void main(String[] args) {
        
        try {
            Connection connection = DBCconnection.getConnection();
            
            System.out.println("Database connected successfully!");
            
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}