package java09;

public class Employee1 {
	String name;
	int age;
	String id;
	boolean isActive;
	double salary;

	public Employee1() {
		System.out.println("0 parm const");

	}

	public Employee1(int a) {
		System.out.println("1 pram const.....");

	}

	public Employee1(int a, String name) {
		System.out.println("2 pram const ....");
	}

	public static void main(String[] args) {

		Employee1 e = new Employee1();
		Employee1 e2 = new Employee1(20);
		Employee1 e3 = new Employee1(20, "Rakesh");
	}

}
