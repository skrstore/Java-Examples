class Test {
	int a, b;

	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// return true if o is equal to the invoking object
	boolean equalTo(Test o) {
		if (o.a == a && o.b == b)
			return true;
		else
			return false;
	}

	void changeToThisValue(Test o) {
		a = o.a;
		b = o.b;
	}

	void getValue() {
		System.out.println("Value of a & b = " + a + " " + b);
	}

	public static void main(String[] args) {
		System.out.println("Object As Parameter");

		Test obj1 = new Test(100, 22);
		Test obj2 = new Test(100, 22);
		Test obj3 = new Test(-1, -1);

		System.out.println("ob1 == ob2: " + obj1.equalTo(obj2));
		System.out.println("ob1 == ob3: " + obj1.equalTo(obj3));

		obj1.getValue();
		obj1.changeToThisValue(obj3);
		obj1.getValue();
	}
}
