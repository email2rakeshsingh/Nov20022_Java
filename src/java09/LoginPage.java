package java09;

public class LoginPage {

	String username;
	String password;

	public LoginPage(String username, String password) {

		this.username = username;
		this.password = password;

	}

	public LoginPage() {
		System.out.println("Default const......");
	}

	public void doLogin() {
		System.out.println("Please enter cread :" + username + " " + password);
		System.out.println("Login successfully done.....");

	}

	public static void main(String[] args) {
		LoginPage login = new LoginPage("email2rakesh@gmail.com", "Rak@1234");
		login.doLogin();

		LoginPage def = new LoginPage();
		def.doLogin();

	}

}
