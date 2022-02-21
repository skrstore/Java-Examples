class Parent1 {
	{
		System.out.println("p 1");
	}

	Parent1(int a) {
		System.out.println("p 2");
	}

	static {
		System.out.println("p 0");
	}
}

class Child1 extends Parent1 {
	{
		System.out.println("c 1");
	}

	Child1() {
		super(1);
		System.out.println("c 2");
	}

	static {
		System.out.println("c 0");
	}
}

class Test {
	{
		System.out.println("0"); // instance block
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Demo1");
		// Parent1 p1 = new Parent1();

		// Child1 c1 = new Child1();
		Child1 c12 = (Child1) Class.forName("Child1").newInstance();
	}
}
