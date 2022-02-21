import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Comparator;

import javax.swing.*;
import javax.swing.table.*;
// import java.util.*;

class AppView {
	static int id2 = 0;
	static int id = 0;

	static void showMsg(JFrame f, String msg) {
		Dialog d = new Dialog(f, "Message", true);

		d.setLayout(new FlowLayout());
		Button b = new Button("OK");

		d.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				d.dispose();
			}
		});

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.dispose();
			}
		});
		d.add(new Label(msg));
		d.add(b);
		d.setSize(300, 200);
		d.setLocation(f.getX() + (f.getWidth() / 2) - d.getWidth() / 2, f.getY() + (f.getHeight() / 2) - d.getHeight() / 2);
		d.setVisible(true);
	}

	static void showAllData(Connection con, JFrame f1) throws Exception {
		String[][] data = DBController.getAllData(con);
		String column[] = { "ID", "NAME", "Email", "Address", "Mobile" };
		JFrame f2 = new JFrame("All Data");
		JTable jt = new JTable(data, column);
		jt.setRowHeight(30);
		jt.doLayout();
		jt.setEnabled(false);
		Font font3 = new Font("Arial", Font.PLAIN, 20);
		jt.setFont(font3);

		jt.setAutoCreateRowSorter(true);

		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		f2.add(sp);
		f2.setSize(650, 600);
		f2.setVisible(true);
	}

	static void showAddForm(Connection con, JFrame f, JPanel p, JButton b) {
		JPanel p1 = new JPanel();
		JLabel[] l1 = new JLabel[4];
		JTextField[] tf1 = new JTextField[4];
		String[] l1Text = { "Your Name", "Your Email", "Your Address", "Your Mobile No" };
		p.add(p1);

		p1.setLayout(null);
		int y = 150;
		for (int i = 0; i < 4; i++) {
			l1[i] = new JLabel(l1Text[i]);
			l1[i].setBounds(100, y, 150, 30);
			p1.add(l1[i]);
			tf1[i] = new JTextField();
			tf1[i].setBounds(300, y, 150, 30);
			tf1[i].setSize(100, 40);
			p1.add(tf1[i]);
			y += 40;
		}

		JButton b1 = new JButton("Submit");
		JButton b2 = new JButton("Exit");
		b1.setBounds(250, 330, 100, 40);
		b2.setBounds(350, 330, 100, 40);
		p1.add(b1);
		p1.add(b2);
		b1.addActionListener((ActionEvent e) -> {
			if (!(tf1[0].getText().equals("") || tf1[1].getText().equals("") || tf1[2].getText().equals("")
					|| tf1[3].getText().equals(""))) {
				System.out.println("Not empty");
				String name = tf1[0].getText();
				String email = tf1[1].getText();
				String address = tf1[2].getText();
				String mobile = tf1[3].getText();

				try {
					DBController.insertData(con, name, email, address, mobile);
					showMsg(f, "Data submitted Successfully");
					tf1[0].setText("");
					tf1[1].setText("");
					tf1[2].setText("");
					tf1[3].setText("");
				} catch (Exception ex) {
					System.out.println("Exception" + ex);
				}
			} else {
				System.out.println("Empty");
				showMsg(f, "Some data field is empty");
			}
		});

		b2.addActionListener((ActionEvent e) -> {
			b.setEnabled(true);
		});
	}

	static void findData(Connection con) {
		JFrame f4 = new JFrame("Find Data");

		JLabel l1 = new JLabel("Enter ID :");
		JTextField tf1 = new JTextField();
		JButton b1 = new JButton("Find");

		l1.setBounds(100, 100, 100, 30);
		tf1.setBounds(250, 100, 100, 30);
		b1.setBounds(400, 100, 80, 30);

		f4.add(l1);
		f4.add(tf1);
		f4.add(b1);

		JLabel[] l2 = new JLabel[4];
		JLabel[] l3 = new JLabel[4];
		String[] l2Text = { "Your Name", "Your Email", "Your Address", "Your MobileNo" };

		int y = 150;
		for (int i = 0; i < 4; i++) {
			l2[i] = new JLabel();
			l2[i].setBounds(100, y, 150, 30);
			f4.add(l2[i]);
			l2[i].setText(l2Text[i]);

			l3[i] = new JLabel();
			l3[i].setBounds(300, y, 150, 30);
			f4.add(l3[i]);
			y += 40;
		}

		b1.addActionListener((ActionEvent e) -> {
			if (!(tf1.getText().equals("") || Integer.parseInt(tf1.getText()) < 0)) {
				System.out.println("Valid");
				int id2 = Integer.parseInt(tf1.getText());
				try {
					String[] result = DBController.getData(con, id2);

					for (int i = 0; i < 4; i++) {
						l3[i].setText("");
						l3[i].setText(result[i + 1]);
					}
				} catch (Exception ex) {
					System.out.println("Exception find Data :" + ex);
				}
			} else {
				showMsg(f4, "Not Valid");
			}
		});

		f4.setResizable(false);
		f4.setLayout(null);
		f4.setVisible(true);
		f4.setSize(600, 600);
	}

	static void showSingleData(Connection con) {
		JFrame f5 = new JFrame("Single Data");

		JLabel[] l2 = new JLabel[4];
		JLabel[] l3 = new JLabel[4];
		JButton[] b1 = new JButton[4];
		String[] l2Text = { "Your Name", "Your Email", "Your Address", "Your Mobile No" };
		String[] btnText = { "First", "Previous", "Next", "Last" };

		int y = 150;
		int x = 50;
		for (int i = 0; i < 4; i++) {
			l2[i] = new JLabel();
			l2[i].setBounds(100, y, 150, 30);
			f5.add(l2[i]);
			l2[i].setText(l2Text[i]);

			l3[i] = new JLabel();
			l3[i].setBounds(300, y, 150, 30);
			f5.add(l3[i]);

			b1[i] = new JButton();
			b1[i].setBounds(x, 80, 100, 40);
			f5.add(b1[i]);
			b1[i].setText(btnText[i]);

			y += 40;
			x += 120;
		}

		try {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet res = st.executeQuery("select distinct id from student order by	id");
			res.first();

			id2 = Integer.parseInt(res.getString(1));
		} catch (Exception ex) {
			System.out.println("Exception 1 :" + ex);
		}

		try {
			String[] result = DBController.getData(con, id2);
			for (int i = 0; i < 4; i++) {
				l3[i].setText(result[i + 1]);
			}
		} catch (Exception ex) {
			System.out.println("Exception" + ex);
		}

		b1[0].addActionListener((ActionEvent e) -> {
			if (id2 >= 0) {
				try {
					String[] result = DBController.getData(con, id2);
					for (int i = 0; i < 4; i++) {
						l3[i].setText(result[i + 1]);
					}
				} catch (Exception ex) {
					System.out.println("Exception" + ex);
				}
			} else {
				showMsg(f5, "Not Valid");
			}
		});
		b1[1].addActionListener((ActionEvent e) -> {
			--id2;
			if (id2 >= 0) {
				try {
					String[] result = DBController.getData(con, id2);
					for (int i = 0; i < 4; i++) {
						l3[i].setText(result[i + 1]);
					}
				} catch (Exception ex) {
					System.out.println("Exception" + ex);
				}
			} else {
				showMsg(f5, "Not Valid");
			}
		});
		b1[2].addActionListener((ActionEvent e) -> {
			++id2;
			try {
				String[] result = DBController.getData(con, id2);
				if (result[0] != null) {
					for (int i = 0; i < 4; i++) {
						l3[i].setText(result[i + 1]);
					}
				} else {
					showMsg(f5, "Not Valid");
					--id2;
				}
			} catch (Exception ex) {
				System.out.println("Exception" + ex);
			}
		});
		b1[3].addActionListener((ActionEvent e) -> {
			try {
				Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet res = st.executeQuery("select distinct id from student order by id");

				res.last();

				id2 = Integer.parseInt(res.getString(1));
			} catch (Exception ex) {
				System.out.println("Exception 1 :" + ex);
			}

			try {
				String[] result = DBController.getData(con, id2);
				for (int i = 0; i < 4; i++) {
					l3[i].setText(result[i + 1]);
				}
			} catch (Exception ex) {
				System.out.println("Exception" + ex);
			}
		});

		f5.setResizable(false);
		f5.setLayout(null);
		f5.setVisible(true);
		f5.setSize(600, 600);
	}

	static void showDeleteOne(Connection con) {
		JFrame f1 = new JFrame("Delete One");

		JLabel l1 = new JLabel("Enter ID :");
		JTextField tf1 = new JTextField();
		JButton b1 = new JButton("Delete");

		l1.setBounds(100, 100, 100, 30);
		tf1.setBounds(250, 100, 100, 30);
		b1.setBounds(400, 100, 80, 30);

		f1.add(l1);
		f1.add(tf1);
		f1.add(b1);

		b1.addActionListener((ActionEvent e) -> {
			if (!(tf1.getText().equals("") || Integer.parseInt(tf1.getText()) < 0)) {
				System.out.println("Valid");
				int id2 = Integer.parseInt(tf1.getText());
				try {
					int result = DBController.deleteOne(con, id2);

					System.out.println(result);
					if (result > 0) {
						showMsg(f1, "Data Deleted Successfully");
					} else {
						showMsg(f1, "Data not Deleted");
					}
				} catch (Exception ex) {
					System.out.println("Exception find Data :" + ex);
				}
			} else {
				showMsg(f1, "Not Valid");
			}
		});

		f1.setResizable(false);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(600, 600);
	}

	static void showUpdateForm(Connection con) {
		JFrame f3 = new JFrame("Form");

		JLabel l2 = new JLabel("Enter your ID : ");
		JTextField tf2 = new JTextField();
		JButton b2 = new JButton("Find");

		JLabel[] l1 = new JLabel[4];
		JTextField[] tf1 = new JTextField[4];
		String[] l1Text = { "Your Name", "Your Email", "Your Address", "Your MobileNo" };

		l2.setBounds(50, 80, 150, 30);
		tf2.setBounds(250, 80, 100, 30);
		b2.setBounds(400, 80, 100, 30);
		f3.add(l2);
		f3.add(tf2);
		f3.add(b2);

		b2.addActionListener((ActionEvent e) -> {
			id = Integer.parseInt(tf2.getText().toString());
			if (id > 0) {
				String[] data = new String[5];
				try {
					data = DBController.getData(con, id);
				} catch (Exception ex) {
					System.out.println("Exception in update : " + ex);
				}
				int y = 150;
				for (int i = 0; i < 4; i++) {
					l1[i] = new JLabel(l1Text[i]);
					l1[i].setBounds(100, y, 150, 30);
					f3.add(l1[i]);

					tf1[i] = new JTextField();
					tf1[i].setBounds(300, y, 150, 30);
					tf1[i].setText(data[i + 1]);
					f3.add(tf1[i]);
					y += 40;
				}
			} else {
				showMsg(f3, "Not Valid");
			}
		});

		JButton b1 = new JButton("Update");
		b1.setBounds(250, 330, 100, 40);
		b1.addActionListener((ActionEvent e) -> {
			if (!(tf1[0].getText().equals("") || tf1[1].getText().equals("") || tf1[2].getText().equals("")
					|| tf1[3].getText().equals(""))) {
				System.out.println("Not empty");
				String name = tf1[0].getText();
				String email = tf1[1].getText();
				String address = tf1[2].getText();
				String mobile = tf1[3].getText();

				try {
					System.out.println("Test 2");
					System.out.println(
							"1.  Name " + name + "Email : " + email + "Address : " + address + "Mobile :" + mobile + " ID : " + id);
					int res2 = DBController.updateData(con, name, email, address, mobile, id);
					System.out.println("Result 2 : " + res2);
					if (res2 > 0) {
						showMsg(f3, "Data Updated Successfully");
						tf1[0].setText("");
						tf1[1].setText("");
						tf1[2].setText("");
						tf1[3].setText("");
						f3.dispose();
					} else {
						showMsg(f3, "Error Occured");
					}
				} catch (Exception ex) {
					System.out.println("Exception" + ex);
				}
			} else {
				System.out.println("Empty");
				showMsg(f3, "Some data field is empty");
			}
		});

		f3.add(b1);
		f3.setResizable(false);
		f3.setLayout(null);
		f3.setVisible(true);
		f3.setSize(600, 600);
	}

	static public void showUpdateOne(Connection con) {
		showUpdateForm(con);
	}

}
