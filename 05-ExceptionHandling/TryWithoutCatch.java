class TryWithoutCatch {
	public static void main(String[] args) {
		System.out.println("This is a Try without Catch");

		try {
			System.out.println("test : " + (10 / 0));
		} finally {
			System.out.println("This is after the test");
		}
		System.out.println("This is out of the try block");
	}
}
