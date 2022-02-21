class Person {
	String name, address;
	int age;

	public Person(int age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}
}

class Employee2 extends Person {
	float salary;

	public Employee2(int age, String name, String address, float salary) {
		super(age, name, address);
		this.salary = salary;
	}
}

public class Test {
	public static void main(String args[]) {
		Employee2 e = new Employee2(22, "Mukesh", "Delhi", 90000);
		System.out.println("Name: " + e.name + " Salary: " + e.salary + " Age: " + e.age + " Address: " + e.address);
	}
}
