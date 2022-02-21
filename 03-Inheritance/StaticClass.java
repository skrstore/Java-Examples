class StaticClass {
	static int outerStatic_a = 121212;
	int outerNonStatic_a = 123456789;

	public static void main(String[] args) {
		System.out.println("Static Class usage");

		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();

		System.out.println("Value of b : " + st1.b);

		StaticTest.a = 13; // Accessing a static method using his class name not the Object
		StaticTest.getValue();

		// st1.a = 123;
		// st1.getA();// 123

		// st2.a = 321;
		// st2.getA();// 321

		// st1.getA();// 321 Because there is only one instance of this varable for all
		// Objects of this class because it is declared as static

		st1.b = 123;
		st1.getB(); // 123

		st2.b = 321;
		st2.getB();// 321

		st1.getB();// 123 Because this variable is not static so it has different instance for
								// every different object of this class

		// NonStaticTest nst1 = new NonStaticTest(); // ERROR because NonStaticTest is
		// not a static class
		nst1.outerVariableTest();
	}

	static class StaticTest {
		static int a = 10;
		int b = 150;

		static void getValue() {
			System.out.println("Value of a : " + a);
		}

		void getB() {
			System.out.println("Value of b : " + b);
		}

		void outerVariableTest() {
			System.out.println(outerStatic_a);
			// System.out.println(outerNonStatic_a); // ERROR because nonstatic members can
			// only be access using the objct of that class inside a static class
		}
	}

}

// Static method can be declared inside a static nested class OR in the top
// level class
// Static variable can't be declared inside a method
