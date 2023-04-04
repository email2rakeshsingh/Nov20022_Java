package java09;

public class Ecomm {

	public void test() {
		System.out.println("This is rakesh");

	}

	public void test(int a) {
		System.out.println("Hi" + a);

	}

	public void test(String name) {
		System.out.println("This is my name :" + name);

	}

	public void test(double d) {
		System.out.println("Double values" + d);

	}

	public void test(int a, String b) {
		System.out.println("Hello" + a);

	}

	public void test(String a, int b) {
		System.out.println("Hello " + b);
	}

	public void login() {

	}

	public void login(String UN, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(int number, String lastname, String Rollnumber) {

	}

	public void doSearch() {

	}

	public void doSearch(String name, int code) {

	}

	public void doSearch(int productcode, String name, double code) {

	}

	public void doPayment() {

	}

	public void doPayment(int ccv, int vcc) {

	}

	public void doPayment(String name, int ccv, int otp) {

	}

	public void doPayment(String UPI) {

	}

	public void uber() {

	}

	public void booking(String name, int bookingId) {

	}

	public void booking(String Start, String end) {

	}

	public void booking(String start, String end, String cartype) {

	}

	public static void main(String[] args) {

		Ecomm test = new Ecomm();
		test.test();

		test.test(20, "Rakesh");

		test.booking( "Rewa", "Indore", "volvo");
	}

}
