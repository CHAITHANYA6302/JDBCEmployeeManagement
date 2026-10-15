
package COM.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCconnection {

    private static final String URL = 
            "jdbc:mysql://localhost:3306/company_db";

    private static final String USER = 
            "root";

    private static final String PASSWORD = 
            "NewPassword123!";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }
}