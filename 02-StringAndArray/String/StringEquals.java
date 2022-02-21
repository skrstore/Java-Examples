class StringEquals {
	String value;

	StringEquals(String value) {
		this.value = value;
	}

	public boolean equals(StringEquals se) {
		return this.value == se.value;
	}

	public static void main(String[] args) {
		StringEquals se1 = new StringEquals("Hello Sachin");
		StringEquals se2 = new StringEquals("Hello Sachin");

		System.out.println(se1.equals(se2));

		String s1 = new String("Hello String");
		String s2 = new String("Hello String");

		System.out.println(s1.equals(s2));
	}
}
