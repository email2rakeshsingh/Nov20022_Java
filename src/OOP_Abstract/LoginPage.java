package OOP_Abstract;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("Login Page Const.");
	}

	public LoginPage(int a) {
		super();

		System.out.println("Login page ...const.. " + a);

	}

	@Override
	public void pagetitle() {
		System.out.println("LP -- PAGE");

	}

	@Override
	public void pageUrl() {
		System.out.println("LP -- PageUrl");

	}

	@Override
	public void header() {
		System.out.println("LP ---- Hearder");

	}

	@Override
	public void timeout() {
		System.out.println("Page time out :20 sec");

	}

}
