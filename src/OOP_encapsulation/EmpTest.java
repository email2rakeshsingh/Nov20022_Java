package OOP_encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("Rakesh");
		System.out.println(e1.getName());
		
		e1.setAge(30);
		System.out.println(e1.getAge());
		
		e1.setSalary(23.234);
		System.out.println(e1.getSalary());
		
	Employee1 e2 = new Employee1("Aarush", 20, 12.345);
	
	System.out.println(e2.getImpInfo());
//	e2.setName("Ravi");
//	System.out.println(e2.getName());

	}

}
