package Nov2022JAVA;

public class User {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		User u1 = new User();
		u1.name = "Rakesh";
		u1.age = 40;
		u1.city = "Indore";

		User u2 = new User();
		u2.name = "neha";
		u2.age = 30;
		u2.city = "pratapgad";

		User u3 = new User();
		u3.name = "Aarush";
		u3.city = "indore";
		u3.age = 8;

		System.out.println(u1.name + " " + u1.city + " " + u1.age);
		System.out.println(u2.name + " " + u2.city + " " + u2.age);
		System.out.println(u3.name + " " + u3.city + " " + u2.age);

		System.out.println("************************");

		u1 = u2;
		System.out.println(u1.name + " " + u1.city + " " + u1.age);
		System.out.println(u2.name + " " + u2.city + " " + u2.age);
		System.out.println(u3.name + " " + u3.city + " " + u2.age);

		System.out.println("****************************");
		u2 = u3;
		System.out.println(u1.name + " " + u1.city + " " + u1.age);
		System.out.println(u2.name + " " + u2.city + " " + u2.age);
		System.out.println(u3.name + " " + u3.city + " " + u2.age);

		System.out.println("**********************");

		u3 = u1;

		System.out.println(u1.name + " " + u1.city + " " + u1.age);
		System.out.println(u2.name + " " + u2.city + " " + u2.age);
		System.out.println(u3.name + " " + u3.city + " " + u2.age);
	}

}
