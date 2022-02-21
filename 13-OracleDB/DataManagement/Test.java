import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class Test {
	public static void main(String[] args) throws Exception, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "system", "root");

		JFrame f1 = new JFrame("Data management");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		// f1.setComponentZOrder(p2, 1);

		p1.setBounds(0, 0, 250, 1000);
		p1.setBackground(Color.gray);
		p2.setBounds(250, 0, 800, 1000);
		p2.setBackground(Color.cyan);

		// p1.setLayout(new FlowLayout());
		// p2.setLayout(new FlowLayout());

		f1.add(p1);
		f1.add(p2);

		Label l0 = new Label("Data Management");
		l0.setFont(new Font("Arial", Font.PLAIN, 30));
		JButton b1 = new JButton("Add Data");
		JButton b2 = new JButton("Find Data");
		JButton b3 = new JButton("Show One By One");
		JButton b4 = new JButton("Delete One");
		JButton b5 = new JButton("Update One");
		JButton b7 = new JButton("Show All Data");

		l0.setBounds(200, 50, 300, 100);

		Font font1 = new Font("Arial", Font.PLAIN, 25);

		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		b4.setFont(font1);
		b5.setFont(font1);
		b7.setFont(font1);
		// p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		GridLayout gl1 = new GridLayout(2, 1);
		p2.setLayout(gl1);

		p2.add(l0);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b7);

		b1.addActionListener((ActionEvent e) -> {
			AppView.showAddForm(con, f1, p2, b1);
			b1.setEnabled(false);
			p2.validate();
		});

		b2.addActionListener((ActionEvent e) -> {
			AppView.findData(con);
		});

		b3.addActionListener((ActionEvent e) -> {
			AppView.showSingleData(con);
		});

		b4.addActionListener((ActionEvent e) -> {
			AppView.showDeleteOne(con);
		});

		b5.addActionListener((ActionEvent e) -> {
			AppView.showUpdateOne(con);
		});

		b7.addActionListener((ActionEvent e) -> {
			try {
				AppView.showAllData(con, f1);
			} catch (Exception ex) {
				System.out.println("GetAllData Exception : " + ex);
			}
		});

		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f1.setLayout(null);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setSize(1000, 1000);
	}
}
