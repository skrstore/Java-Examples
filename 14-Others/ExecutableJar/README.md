# Executable Java Example

## File Needed

 1. mf file
    - contain
    ```
    <!-- SimpleApp.mf -->
        Main-Class: SimpleApp
    ```
 2. Application file
    ```java
    // SimpleApp.java
    import javax.swing.*;

    public class SimpleApp {    
        public static void main(String[] args) {
            JFrame jf1 = new JFrame("Simple App");
            JButton jb1 = new JButton("Click Here");
        
            jb1.setBounds(50, 50, 150, 50);
        
            jf1.add(jb1);    
            jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf1.setSize(400, 400);
            jf1.setLayout(null);
            jf1.setVisible(true);
        }
    }
    ```

## Making jar file
```
    jar -cvmf SimpleApp.mf SimpleApp.jar SimpleApp.class 
```