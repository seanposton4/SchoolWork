import java.sql.*;
class Homework10 Q2.java {
    public static void main (String args[]) throws SQLException, IOException {
    try { Class.forName("oracle.jdbc.driver.OracleDriver")}
        catch (ClassNotFoundException e) {
            System.out.println("Driver not located");
        }

        String user, password;
        Connection conn = DriverManager.getConnection("jdbc:oracle:oci8:" + user + "/" + password);
        
        String date = readentry("Enter date: ");
        long branch = readentry("Enter branch id: ");
        String author = readentry("Enter author name: ");

        String stmt = "SELECT b.Title FROM BOOK b WHERE :branch = BOOK_LOANS.Branch.id AND :author = BOOK_AUTHORS.Author_name AND bl.Date_out = :date";

        PreparedStatement p = conn.prepareStatement(stmt);
        ResultSet r = p.executeQuery();
        while (r.next()) {

        }
    }
}