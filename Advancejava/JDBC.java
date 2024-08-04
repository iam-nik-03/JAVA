import java.sql.*;

public class JDBC{
    public static void main(String[] args) {
        String url = "jdbc:your_database_url"; // Replace with your database URL
        String username = "your_username"; // Replace with your database username
        String password = "your_password"; // Replace with your database password   


        try {
            // Establish database connection
            Connection con = DriverManager.getConnection(url, username, password);

            // SQL statement to insert a student record
            String sql = "INSERT INTO student (id, name, email) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            // Set values for the prepared statement
            ps.setInt(1, 12);
            ps.setString(2, "Riya");
            ps.setString(3, "Riya@gmail.com");

            // Execute the update
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("One row inserted.");
            } else {
                System.out.println("Error inserting row.");
            }

            // Close resources
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}