package OOP_encapsulation;

public class Employee1 {

	private String name;
	private int age;
	private double salary;

	public Employee1(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getImpInfo() {
		return name + " " + age + " " + salary;

	}
}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//
//	public static void main(String[] args) {
//
//	}
//
//}
