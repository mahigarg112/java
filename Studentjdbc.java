import java.sql.*;

public class Studentjdbc {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "root"; // change if needed

        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            Statement stmt = con.createStatement();

            // 1. Print all student details
            System.out.println("\n--- All Student Details ---");
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                int sapId = rs.getInt("sap_id");
                String name = rs.getString("name");
                String batch = rs.getString("batch");
                String specialization = rs.getString("specialization");
                String email = rs.getString("email");

                System.out.println(sapId + " | " + name + " | " + batch +
                        " | " + specialization + " | " + email);
            }

            // 2. Count students by specialization
            System.out.println("\n--- Total Students by Specialization ---");
            rs = stmt.executeQuery(
                "SELECT specialization, COUNT(*) AS total FROM students GROUP BY specialization"
            );

            while (rs.next()) {
                String spec = rs.getString("specialization");
                int count = rs.getInt("total");
                System.out.println(spec + " : " + count);
            }

            // 3. Print SAP ID and Names
            System.out.println("\n--- SAP ID and Names ---");
            rs = stmt.executeQuery("SELECT sap_id, name FROM students");

            while (rs.next()) {
                System.out.println(rs.getInt("sap_id") + " - " + rs.getString("name"));
            }

            // Close connection
            con.close();

        } catch (java.lang.Exception e) {   // ✅ FIXED HERE
            e.printStackTrace();
        }
    }
}