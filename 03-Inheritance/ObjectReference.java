class Test {
	int id;
	String name;

	void setDetail(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void getDetail() {
		System.out.println("ID : " + id + " Name : " + name);
	}

	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2;

		test1.setDetail(1001, "Sachin");
		test1.getDetail();

		test2 = test1;

		System.out.println("Accessing 'user1' using 'user2'"); // Because both are refering to the same memory space
		test2.getDetail();
	}
}
