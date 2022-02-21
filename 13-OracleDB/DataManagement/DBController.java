import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class DBController {
	public static void insertData(Connection con, String name, String email, String address, String mobile)
			throws SQLException {

		int id = 0;
		try {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet res = st.executeQuery("select distinct id from student order by id");

			res.last();
			id = Integer.parseInt(res.getString(1)) + 1;
		} catch (Exception ex) {
			System.out.println("Exception 1 :" + ex);
		}

		PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?,?)");

		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, email);
		pst.setString(4, address);
		pst.setString(5, mobile);
		int i = pst.executeUpdate();

		if (i > 0) {
			System.out.println("data inserted");
		} else {
			System.out.println("not inserted");
		}
	}

	public static String[] getData(Connection con, int id2) throws SQLException {
		PreparedStatement pst = con.prepareStatement("select * from student where id = " + id2);

		ResultSet res = pst.executeQuery();
		String[] result = new String[5];

		while (res.next()) {
			for (int i = 0; i < 5; i++) {
				result[i] = res.getString(i + 1);
				System.out.print(res.getString(i + 1) + " ");
			}
		}
		return result;
	}

	public static String[][] getAllData(Connection con) throws SQLException {
		PreparedStatement pst = con.prepareStatement("select * from student", ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);

		ResultSet res = pst.executeQuery();
		res.last();
		int count = res.getRow();
		String[][] result = new String[count][5];

		res.beforeFirst();

		while (res.next()) {
			System.out.println(res.getRow());
			result[res.getRow() - 1][0] = res.getString(1);
			result[res.getRow() - 1][1] = res.getString(2);
			result[res.getRow() - 1][2] = res.getString(3);
			result[res.getRow() - 1][3] = res.getString(4);
			result[res.getRow() - 1][4] = res.getString(5);
		}
		return result;
	}

	public static int deleteOne(Connection con, int id) throws SQLException {
		PreparedStatement pst = con.prepareStatement("delete from student where id =" + id);
		int result = pst.executeUpdate();

		return result;
	}

	public static int updateData(Connection con, String name, String email, String address, String mobile, int id)
			throws SQLException {
		System.out.println("Test 1");
		System.out
				.println("Name " + name + "Email : " + email + "Address : " + address + "Mobile :" + mobile + " ID : " + id);
		PreparedStatement pst = con.prepareStatement("update student set name = '" + name + "', email = '" + email
				+ "', address =  '" + address + "', mobile = '" + mobile + "'  where id =" + id);
		int result = pst.executeUpdate();

		return result;
	}
}
