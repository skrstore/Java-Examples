class Variables {
	public static void main(String[] args) {
		// # 2. Variables

		///////////////////////////////////////////
		// ## 2.1 int Variable Usage
		int x; // Declaration
		x = 132; // Initialization
		// Concat the String with int variable
		System.out.println("The value of the int variable is : " + x);

		////////////////////////////////////////////
		// ## 2.2 Variable Scope
		{
			int y = 7456;
			System.out.println("Inside the block y : " + y + " Outside value of x : " + x);
		}
		// Variable y not declared in this scope.

		///////////////////////////////////////////
		// ## 2.3 Lifetime of a Variable
		int no = 10;
		if (no == 10) { // start new scope
			int test = 20; // known only to this block
			// no and test both known here.
			System.out.println("no and test: " + no + " " + test);
			no = test * 2;
		}
		// test = 100; // Error! test not known here because that lifetime of a variable
		// is till its scope is under working
		// no is still known here.

		/////////////////////////////////////////////
		// 2.4 Types of variables
		// Using the TypesOfVariable.java
		TypesOfVariables t1 = new TypesOfVariables();
		t1.a = 12;
		// We are here accessing the static variable using class name before the
		// variable name
		TypesOfVariables.b = 12;
		// we can't access 'c' because it is inside a method and its scope is inside a
		// method only
		t1.Test();
	}
}

class TypesOfVariables {
	// 1. Instance Variable
	public int a;

	// 2. Class Variable that are declared using the static keyword
	public static int b;

	public void Test() {
		// 3. Local Variable must be Initialized & can't use access modifiers except
		// final
		int c;
		c = 12;
		System.out.println(
				"Value of Instance Variable(a) : " + a + ", Class Variable(b) : " + b + ", Local Variable(c) : " + c);
	}
}
