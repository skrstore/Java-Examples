class Test {
	public static void main(String[] args) {
		// Syntax - I
		int[] values;
		values = new int[3];

		System.out.println(values[2]);

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}

		System.out.println("");

		// Syntax - II
		int[] numbers = { 5, 6, 7 };

		for (int i : numbers) {
			System.out.print(i + " ");
		}

		// String Array
		String[] fruits = { "apple", "banana", "pear", "kiwi" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
