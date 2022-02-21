import java.util.*;

class Test1 {
	public static void main(String[] args) {
		ArrayList<T1Child1> al1 = new ArrayList<>();

		al1.add(new T1Child1(101, "Sachin"));
		al1.add(new T1Child1(102, "Kumar"));

		for (T1Child1 ob : al1) {
			System.out.print(ob.getRollno());
			System.out.print(" " + ob.getName() + "\n");
		}
	}
}

class T1Child1 {
	private int rollno;
	private String name;

	T1Child1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
