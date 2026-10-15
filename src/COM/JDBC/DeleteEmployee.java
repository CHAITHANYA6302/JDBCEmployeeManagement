package COM.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEmployee {

    public static void main(String[] args) {

        String sql = """
                DELETE FROM employees
                WHERE employee_id = ?
                """;

        try {
            Connection connection = DBCconnection.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            // Set employee_id
            ps.setInt(1, 2);

            int rows = ps.executeUpdate();

            System.out.println(
                    rows + " employee deleted."
            );

            ps.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}