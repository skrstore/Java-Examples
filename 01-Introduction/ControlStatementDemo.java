class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			if (i == 4) {
				break;
			}

			if (i == 2) {
				continue;
			}
		}

		// for each loop
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i : arr) {
			System.out.print("arr = " + i + " ");
		}

		// comma inside for loop
		int a, b;
		for (a = 1, b = 4; a < b; a++, b--) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}

		// Do while loop
		int j = 0;
		do {
			System.out.print(j + " ");
			if (j == 4)
				// return;
				j++;
		} while (j < 5);

		// while loop
		int k = 0;
		while (k < 5) {
			System.out.print(k + " ");
			k++;
		}

		// Labeled statement
		first: {
			for (int i = 0; i < 5; i++) {
				System.out.println("This is first lable " + i);
				if (i == 3)
					break first;
			}
		}

		// If else Statement
		int num = 10;
		if (num < 10) {
			System.out.println("a is smaller then 10");
		} else if (num == 10) {
			System.out.println("a is equal to 10");
		} else {
			System.out.println("a is greater then 10");
		}

		// Switch Statement
		int count = 3;
		System.out.println("Value of a : " + a);

		switch (count) {
		case 1:
			System.out.println("a value is 1");
			break;
		case 2:
		case 3:
			System.out.println("a value is 2 OR 3");
			break;
		case 4:
			System.out.println("a value is 4");
			break;
		case 5:
			System.out.println("a value is 5");
			break;
		default:
			System.out.println("a value is greater then 5");
		}
	}
}
