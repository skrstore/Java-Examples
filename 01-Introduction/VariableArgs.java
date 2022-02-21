class VariableArgs {
	public static void main(String[] args) {

		student("SAchin", "CSE", 123, "a", "b");
	}

	static public void student(int a, String... s) {
		System.out.println("No data Entered");
	}

	static public void student(String name, String branch, int rollno, String... hobbies) {
		System.out.println("Name : " + name);
		System.out.println("Rollno : " + rollno);
		System.out.println("Hobbies : " + hobbies.length);
		printHobbies(hobbies);
	}

	static public void student(String name, int rollno, String branch, String college, String... hobbies) {
		System.out.println("Name : " + name);
		System.out.println("Rollno : " + rollno);
		System.out.println("Branch : " + branch);
		System.out.println("College : " + college);
		System.out.println("Hobbies : " + hobbies.length);
		printHobbies(hobbies);
	}

	static public void student(String name, int rollno, String branch, int year, String... hobbies) {
		System.out.println("Name : " + name);
		System.out.println("Rollno : " + rollno);
		System.out.println("Branch : " + branch);
		System.out.println("Year : " + year);
		System.out.println("Hobbies : ");
		printHobbies(hobbies);
	}

	static public void printHobbies(String... hobbies) {
		for (String s : hobbies) {
			System.out.print(" " + s);
		}
	}
}
