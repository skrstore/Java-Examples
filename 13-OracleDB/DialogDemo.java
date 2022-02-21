import java.awt.*;
import java.awt.event.*;

public class DialogDemo {
	// private static Dialog d;

	public static void main(String args[]) {
		Frame f = new Frame();
		showMsg(f, "Click button to continue.");
	}

	static void showMsg(Frame f, String msg) {
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
		d.setVisible(true);
	}
}
