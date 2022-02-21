import java.lang.reflect.Method;

public class usingMList {
    public static void main(String[] args) {
        MList mlist = new MList();
        Class c1 = mlist.getClass();
        // Class c1 = Class.forName("MList");
        Method[] m1 = c1.getMethods();

        // System.out.println(mlist.getClass().getName());
        System.out.println(m1.length);

        for (int i = 0; i < m1.length; i++) {
            System.out.println(m1[i]);
        }
    }
}