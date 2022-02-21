import java.util.*;

class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("initial size of the arraylist:" + al.size());
		al.add("a");
		al.add("A");
		al.add("a");
		al.add(null);
		al.add(10);
		al.add(1, "rajat");
		System.out.println(al);
		System.out.println("ArrayList size:" + al.size());
		al.remove("a");
		System.out.println("ArrayList size:" + al.size());
		System.out.println(al);

		// al.add(1);
		// al.add(3);
		// al.add(4);
		// al.add(2);
		// System.out.println(al);
		// System.out.println(al.size());
		// al.remove(new Integer(2));
		// System.out.println(al.size());
		// System.out.println(al);
	}
}
