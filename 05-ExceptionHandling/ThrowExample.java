class ThrowExample {
	static void testMethod() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("Exception Catached");
			throw e;
		}
	}

	static void newTest() {
		int a = 12;

		if (a == 12) {
			throw new ArithmeticException("Mathematical Error");
		} else {
			System.out.println("No Exception found");
		}
	}

	public static void main(String[] args) {
		try {
			// testMethod();
			newTest();
		} catch (Exception e) {
			System.out.println("Re catched the exception : " + e);
		}
	}
}
