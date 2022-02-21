interface Student {
	int getMarks(int a);
}

class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		Student s1 = (int a) -> {
			return a;
		};

		System.out.println(s1.getMarks(1234));
	}
}
