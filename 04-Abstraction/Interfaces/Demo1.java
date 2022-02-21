interface a {
	default void test1() {
		System.out.println("This is a method 1");
	};
}

interface b {
	default void test1() {
		System.out.println("This is a method 2");
	};
}

class Demo1 implements a, b {
	public void test1() {
		System.out.println("1");
	}

	public void test2() {
		System.out.println("2");
	}

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();

		d1.test1();
		d1.test2();
	}
}
