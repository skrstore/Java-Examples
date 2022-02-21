import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class test2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url, "syste", "root");
			System.out.println("Connection Established Successfuly");
		} catch (Exception e) {
			System.out.println("Connection could not be established" + e.getMessage());
		}

		// Statement st = con.createStatement();
		// ResultSet res = st.executeQuery("select * from student");

		// while (res.next()) {
		// // System.out.println(res.next());
		// System.out.println(res.getString(2));
		// }

	}
}
