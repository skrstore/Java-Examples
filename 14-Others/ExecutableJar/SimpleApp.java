import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;

public class SimpleApp {    
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("Simple App");
        JButton jb1 = new JButton("Click Here");
        Image icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
    
        jb1.setBounds(50, 50, 150, 50);
       
        jf1.add(jb1);    
        jf1.setIconImage(icon);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(400, 400);
        jf1.setLayout(null);
        jf1.setVisible(true);
    }
}