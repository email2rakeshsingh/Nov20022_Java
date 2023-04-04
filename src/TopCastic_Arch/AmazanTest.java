package TopCastic_Arch;

public class AmazanTest {

	public static void main(String[] args) {
		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver= new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		String browser = "ie";
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Safari"))

		{
			driver = new SafariDriver();
		} else {
			System.out.println("Please enetr the right browser");
		}

		driver.get("https://amazon.com");

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getUrl();
		System.out.println(url);

		driver.FindElements("email-id");
		driver.sendKey("email -id", "email2rakesh@gmail.com");

		driver.FindElements("pwd");
		driver.sendKey("email-pwd", "Rak@1234");

	}
}
