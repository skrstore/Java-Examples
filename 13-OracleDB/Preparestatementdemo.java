import java.sql.*;
import java.util.Scanner;

class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");

		// insertData(input, cn);
		// updateData(input, cn);
		// deleteData(input, cn);
		getAllData(input, cn);

		input.close();
	}

	public static void name() {

	}

	public static void getAllData(Scanner input, Connection cn) throws SQLException {
		PreparedStatement pst = cn.prepareStatement("select * from student");
		ResultSet res = pst.executeQuery();
		while (res.next()) {
			System.out.print(res.getString(1) + " ");
			System.out.print(res.getString(2) + " ");
			System.out.print(res.getString(3) + " \n");
		}
	}

	public static void deleteData(Scanner input, Connection cn) throws SQLException {
		PreparedStatement pst = cn.prepareStatement("delete from student where id = ?");

		while (true) {
			System.out.println("Enter ID to delete : ");
			int id = Integer.parseInt(input.nextLine());
			pst.setInt(1, id);
			int res = pst.executeUpdate();
			if (res > 0) {
				System.out.println("Query executed");
			} else {
				System.out.println("Not executed");
			}
			System.out.println("Type (Y) to delete more or (N) ");
			char[] cho5 = input.nextLine().toCharArray();
			char cho = cho5.length == 1 ? cho5[0] : 'a';
			if (!(cho == 'Y' || cho == 'y')) {
				break;
			}
		}
	}

	public static void updateData(Scanner input, Connection cn) throws SQLException {
		PreparedStatement pst;
		while (true) {
			System.out.print("Enter your ID : ");
			int id = Integer.parseInt(input.nextLine());
			// = cn.prepareStatement("update student set name = ? where id = " + id);

			System.out.print("Type (N) for Name OR (E) for Email : ");
			char[] cho2 = input.nextLine().toCharArray();

			char cho4 = cho2.length == 1 ? cho2[0] : 'a';

			int res = 0;
			switch (cho4) {
			case 'N':
			case 'n': {
				pst = cn.prepareStatement("update student set name = ? where id = " + id);
				System.out.print("Enter your name : ");
				String name = input.nextLine();
				pst.setString(1, name);
				res = pst.executeUpdate();
				break;
			}

			case 'E':
			case 'e': {
				pst = cn.prepareStatement("update student set email = ? where id = " + id);
				System.out.print("Enter your Email : ");
				String email = input.nextLine();
				pst.setString(1, email);
				res = pst.executeUpdate();
				break;
			}
			default: {
				System.out.println("incorrect input");
			}
			}

			if (res > 0) {
				System.out.println("Query Executed");
			} else {
				System.out.println("Not Executed");
			}

			System.out.println("Do u want to update more type (Y) or (N)");
			char[] cho1 = input.nextLine().toCharArray();
			char cho3 = cho1.length == 1 ? cho1[0] : 'N';

			if (!(cho3 == 'Y' || cho3 == 'y')) {
				break;
			}
		}
	}

	public static void insertData(Scanner input, Connection cn) throws SQLException {
		PreparedStatement pst = cn.prepareStatement("insert into student values(?,?,?)");

		while (true) {
			System.out.println("Enter new ID : ");
			int id = Integer.parseInt(input.nextLine());
			System.out.println("Enter new Name : ");
			String name = (input.nextLine());
			System.out.println("Enter new Email :");
			String email = (input.nextLine());

			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			int i = pst.executeUpdate();

			if (i > 0) {
				System.out.println("data inserted");
			} else {
				System.out.println("not inserted");
			}
			System.out.println("Want to insert more type (Y) or (N)");
			String cho = input.nextLine();

			if (cho.equals("N")) {
				break;
			}
		}
	}
}
