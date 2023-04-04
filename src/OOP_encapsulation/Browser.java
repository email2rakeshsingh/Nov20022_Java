package OOP_encapsulation;

public class Browser {

	public void LaunchBrowser() {

		System.out.println("Launch the chrome browser ..");
		CheckRam();
		CheckOsvirsion();
		ChromeService();
		System.out.println("Chrome is launched ..");
		

	}

	private void CheckRam() {
		System.out.println("Check Ram");

	}

	private void CheckOsvirsion() {
		System.out.println("Check OS version...");

	}

	private void ChromeService() {
		System.out.println("Check Chromeservice ...");

	}

}
