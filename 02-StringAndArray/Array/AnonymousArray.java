class AnonymousArray {
	public static void main(String[] args) {
		test1(new int[] { 1, 2, 4, 32, 12 });
		System.out.println("");
		for (int i : test2()) {
			System.out.print(i + " ");
		}
	}

	// Passing array as parameter
	public static void test1(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	// Returning array from a method
	public static int[] test2() {
		return new int[] { 12, 13, 14, 15 };
	}
}

// AnonymousArray
// new int[] { 1, 2, 3 }
