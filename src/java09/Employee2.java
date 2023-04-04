package java09;

public class Employee2 {
	String name;
	int age;
	String id;
	boolean isActive;
	int salary;

	public Employee2(String name) {

		this.name = name;

	}

	public Employee2(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Employee2(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;

	}

	public Employee2(String name, int age, String id, boolean isActive, int salary) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.isActive = isActive;
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee2 e = new Employee2("Tom");
		System.out.println(e.name);

		Employee2 e1 = new Employee2("Rakesh", 30);
		System.out.println(e1.name + " " + e1.age);

		Employee2 e2 = new Employee2("Ram", 30, "raj");
		System.out.println(e2.name + " " + e2.age + " " + "101");

		Employee2 e3 = new Employee2("Rajesh", 30, "102", true, 1200);
		System.out.println(e3.name + " " + e3.age + " " + e3.id + " " + e3.isActive + " " + e3.salary);

	}

}
