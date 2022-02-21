class MergeTwoArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 15, 16, 17, 18, 19, 20 };

		int[] result = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}

// RESOURCE:
// https://www.programiz.com/java-programming/examples/concatenate-two-arrays
