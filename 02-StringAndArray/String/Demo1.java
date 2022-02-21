class Demo1 {
	String value = "";

	Demo1(String value) {
		this.value = value;
	}

	public String toString() {
		return this.value;
	}

	public static void main(String[] args) {
		Demo1 demo1 = new Demo1("Hello World");
		System.out.println(demo1);
		String s = new String("Hello World");
		System.out.println(s);
	}
}
