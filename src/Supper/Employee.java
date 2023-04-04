package Supper;

public class Employee extends Company {

	public Employee() {
		super();
		System.out.println("emp ....cons...");
	}

	public Employee(int a) {
		super(a);
		System.out.println("emp ..." +a);

	}

	public Employee(int a, int b) {
		super(a, b);
		System.out.println("emp ..." +a+b);
	}
}
