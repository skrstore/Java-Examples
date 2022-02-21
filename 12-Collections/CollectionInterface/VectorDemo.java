import java.util.*;

class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement("rajat");
		System.out.println(v);
		v.removeElement(0);
		System.out.println(v);
		v.clear();
		System.out.println(v);
	}
}
