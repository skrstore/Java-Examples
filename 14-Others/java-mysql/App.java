import java.sql.*;

class App {
	public static void main(String[] args) {
		try {
			// 1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");

			// 2. Create a statement
			Statement myStmt = myConn.createStatement();

			// 3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("Select * from users");

			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("name") + " ," + myRs.getString("id"));
			}
			System.out.println(myRs.next());
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
