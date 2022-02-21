class Test {
	public static void main(String[] args) {
		System.out.println("Non Static Class Usage");
		// *********** Non static class Accessing
		// ERROR because this is a Nonstatic class inside same class
		// NonStatic ns1 = new NonStatic();
		// ns1.detail();

		// Test t = new Test();
		// Test.NonStatic t1 = t.new NonStatic();

		// Test.NonStatic t1 = (new Test()).new NonStatic();
		// t1.detail();

		// ************** Static class member accessing
		// Accessing a nonstatic method from a static class
		StaticClass sc1 = new StaticClass();
		sc1.detail();
		System.out.println(sc1.a);

		// accessing a static method from a static class
		StaticClass.StaticDetail();

		// Both have the same things
		Test.test();
		test();
	}

	static void test() {
		System.out.println("Hello test");
	}

	class NonStatic {
		void detail() {
			System.out.println("This is a Non static Class");
		}

		// **** we can not declare a static method inside the non-static class */
		// static void staticDetail() {
		// System.out.println("This is a non statis class static");
		// }
	}

	static class StaticClass {
		int a = 10;
		static int b = 1202;

		static void StaticDetail() {
			System.out.println("This is inner static Class with stataic method");
		}

		void detail() {
			System.out.println("This is a inner static Class with non static method");
		}
	}
}
