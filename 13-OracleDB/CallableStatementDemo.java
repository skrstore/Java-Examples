import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

class CallableStatementDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

		// CallableStatement cst = con.prepareCall("{ call insertStd(?,?,?)}");

		// cst.setInt(1, 102);
		// cst.setString(2, "Sachin");
		// cst.setString(3, "sachin@123");
		// int res = cst.executeUpdate();
		// if (res > 0) {
		// System.out.println("Query executed");
		// } else {
		// System.out.println("Not Executed");
		// }

		CallableStatement cst1 = con.prepareCall("{?= call selectStd(?)}");
		cst1.setInt(2, 102);
		cst1.registerOutParameter(1, Types.INTEGER);
		cst1.execute();

		System.out.println(cst1.getString(1));
	}
}
