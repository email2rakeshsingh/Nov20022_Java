package BulderPattern;

public class Ecomm {

	public Ecomm login() {
		System.out.println("Login in the system....");
		return this;

	}

	public Ecomm login(String Un, String PWD) {

		System.out.println("Login with un and pwd :" + Un + " " + PWD);
		return this;
	}

	public Ecomm doSearch(String name) {
		System.out.println("searching ..." + name);
		return this;

	}

	public Ecomm doSearch(String name, int price) {
		System.out.println("search ..." + name + " " + 123);
		return this;
	}

	public Ecomm addToCart(String name) {
		System.out.println("Searching ...:" + name);
		return this;
	}

	public Ecomm doPayment(String upi) {
		System.out.println("make payment using :" + upi);
		return this;
	}

	public Ecomm doPayment(String cc, String otp) {
		System.out.println("Make a payment :+" + cc + " " + otp);
		return this;
	}

	public Ecomm getOderID() {
		System.out.println("genrate orderid :" + 1234);
		return this;

	}

	public Ecomm logOut() {
		System.out.println("Logout the code ...");
		return this;
	}

}
