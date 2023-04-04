package OOP_encapsulation;

public class MethodChaining {

	public void m1() {
		System.out.println("m1 method is calling ...");
		m2();
		t3();

	}

	public void m2() {
		System.out.println("M2 methos is calling ...");
		m3();
		t1();
	}

	public void m3() {
		System.out.println("m3 methos is calling ....");
	}

	public static void t1() {
		System.out.println("t1 methos is calling ...");
		t2();
		MethodChaining app1 = new MethodChaining();
		app1.m1();
	}

	public static void t2() {
		System.out.println("t2 methos is calling ");
		t3();

	}

	public static void t3() {
		System.out.println("t3 method is calling ");
	}

	public static void main(String[] args) {
		
		MethodChaining app = new MethodChaining();
		app.m1();

		t3();
	}

}
