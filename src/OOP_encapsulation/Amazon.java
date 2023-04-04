package OOP_encapsulation;

public class Amazon {

	private String username;
	private String password;

	public Amazon(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void doLogin() {
		System.out.println("Login in with :" + username + " " + password);

	}

	public void logOut() {
		System.out.println("logout from the app : .....");
	}

	public String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
