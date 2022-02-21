import java.sql.*;
import java.util.Scanner;

class Test1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String pass = (System.getenv("dbpass") != null ? System.getenv("dbpass") : "root");

		Connection con = DriverManager.getConnection(url, "system", pass);
		Statement st = con.createStatement();

		printOperation(input, st);

		input.close();
		con.close();
	}

	public static void printOperation(Scanner input, Statement st) throws SQLException {
		System.out.println("Choose Operation");
		System.out.println(
				"(I) for Insert \n(U) for Update \n(D) for Delete \n(R) for Reading data\n(P) to Print operations\n(E) to Exit");
		askOperation(input, st);
	}

	public static void askOperation(Scanner input, Statement st) throws SQLException {
		char[] choice = (input.nextLine()).toCharArray();

		switch (choice[0]) {
		case 'I':
		case 'i': {
			System.out.println("Insert");
			insertToDB(input, st);
			break;
		}
		case 'U':
		case 'u': {
			System.out.println("Update");
			updateData(input, st);
			break;
		}
		case 'D':
		case 'd': {
			System.out.println("Delete");
			deleteData(input, st);
			break;
		}
		case 'R':
		case 'r': {
			System.out.println("Read");
			getAllData(input, st);
			break;
		}
		case 'P':
		case 'p': {
			System.out.println("Print");
			printOperation(input, st);
			break;
		}
		case 'E':
		case 'e': {
			System.out.println("Exit");
		}
		default: {
			System.exit(0);
		}
		}
	}

	public static void deleteData(Scanner input, Statement st) throws SQLException {
		System.out.print("Enter ID to delete : ");
		String id = input.nextLine();

		String query = "delete from student where id = " + id;
		int res = st.executeUpdate(query);

		if (res != 0) {
			System.out.println("Query Executed");
		} else {
			System.out.println("Not Executed");
		}

		printOperation(input, st);
	}

	public static void updateData(Scanner input, Statement st) throws SQLException {
		System.out.print("Enter your Id  to update : ");
		String id = input.nextLine();

		ResultSet res2 = st.executeQuery("select id from student where id = " + id);

		if (res2.next()) {
			System.out.println("Type (N) for Name OR (E) for Email to change");
			String ch1 = input.nextLine();

			String query = "";

			if (ch1.equals("N")) {
				System.out.print("Enter new Name : ");
				String name = input.nextLine();
				query = "update student set name = '" + name + "' where id = " + id;

			} else if (ch1.equals("E")) {
				System.out.print("Enter new Email : ");
				String email = input.nextLine();
				query = "update student set email = '" + email + "' where id = " + id;
			}

			int res = st.executeUpdate(query);

			if (res != 0) {
				System.out.println("Query Executed");
			} else {
				System.out.println("Not executed");
			}
		} else {
			System.out.println("Not a valid ID");
		}

		printOperation(input, st);
	}

	public static void insertToDB(Scanner input, Statement st) throws SQLException {
		while (true) {
			System.out.print("Enter Your ID : ");
			String id = input.nextLine();

			System.out.print("\nEnter your Name : ");
			String name = input.nextLine();

			System.out.print("\nEnter Your EmailId : ");
			String email = input.nextLine();

			String query = "insert into student values (" + id + ",'" + name + "','" + email + "')";

			int a = st.executeUpdate(query);

			if (a > 0) {
				System.out.println("Query Executed");
			} else {
				System.out.println("Query Not Executed");
			}

			System.out.println("Do you want to insert more Type Y or N");
			String ch = input.nextLine();

			if (ch.equals("N")) {
				// System.out.println("Bye");
				break;
			}
		}
		printOperation(input, st);
	}

	public static void getAllData(Scanner input, Statement st) throws SQLException {
		String query = "select * from student order by id";
		ResultSet resset1 = st.executeQuery(query);

		System.out.printf("%13sID %16sName %15sEmail%n", "", "", "");
		while (resset1.next()) {
			String f1, f2, f3;
			f1 = resset1.getString(1);
			f2 = resset1.getString(2);
			f3 = resset1.getString(3);
			System.out.printf("%15s %20s %20s%n", f1, f2, f3);
		}
		printOperation(input, st);
	}

}

// Set the classpath
// set classpath=D:\Java\learning-java\21-OracleDB\ojdbc14.jar;.
// echo %CLASSPATH%

// Set dbpass
// set dbpass=root
// echo %dbpass%
