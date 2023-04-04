package Nov2022JAVA;

public class EmpClass {

	String name;
	int age;
	double sal;
	boolean isActive;

	public static void main(String[] args) {

		EmpClass rws = new EmpClass();
		rws.name = "rakesh";
		rws.age = 20;
		rws.sal = 45.68;
		rws.isActive = false;

		System.out.println(rws.name + " " + rws.age + " " + rws.sal + " " + rws.isActive);

		EmpClass dias = new EmpClass();
		System.out.println(dias.age);
		System.out.println(dias.name);
		System.out.println(dias.sal);
		System.out.println(dias.isActive);
		dias.name = "raja";
		System.out.println(dias.name);

		EmpClass boolen = new EmpClass();
		System.out.println(boolen.isActive);

//		EmpClass NPE = new EmpClass();
////		NPE = null;
////		NPE.name = "Rakesh";
////		System.out.println(NPE.name);

		// object create without reference
		new EmpClass().name = "neha";
		new EmpClass().age = 40;

	}

}
