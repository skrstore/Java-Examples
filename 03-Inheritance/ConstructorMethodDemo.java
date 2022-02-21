class Test {
	// Instance variable
	double l, w, h;

	Test() {
		System.out.println("Value not Set by constructor");
	}

	Test(int l) {
		this(l, l, l);
	}

	Test(double l, double w, double h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	// pass parameter
	public void setVal(double l) {
		this.setVal(l, l, l);
	}

	public void setVal(double l, double w, double h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	public void getVol() {
		System.out.println("Volume of the Box : " + this.l * this.h * this.w);
	}

	public double getVolVal() {
		return this.l * this.w * this.h;
	}

	public static void main(String[] args) {
		// This is creating a object using the class
		Test t; // declare reference to object
		t = new Test(); // allocate a object
		t.setVal(12, 13, 14);
		t.getVol();

		Test t1 = new Test(10);
		t1.getVol();

		Test t2 = new Test(12.5, 10.5, 5);
		t2.getVol();

		Test t3 = new Test();
		// pass arguments
		t3.setVal(15.43, 33.33, 34.12);
		t3.getVol();
		System.out.println(t3.getVolVal());
	}
}
