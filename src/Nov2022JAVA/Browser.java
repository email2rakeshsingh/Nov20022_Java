package Nov2022JAVA;

public class Browser {
	
	public boolean launchBrowser(String browserName) {
		
		System.out.println("Launching the browser :" +browserName);
		boolean flag=false;
		
		
		switch (browserName) {
		case "chrome":
			System.out.println("Launch the chrome browser");
			flag=true;
			break;
		case "ff":
			System.out.println("Launch the chrome browser");
			flag=true;
			break;
		case "safari":
			System.out.println("Launch the chrome browser");
			flag=true;
			break;
		default:
			System.out.println("please pass the correct browser name" +browserName);
			break;
		}
		return flag;
		
	}

	public static void main(String[] args) {
		
		Browser app = new Browser();
		boolean b=app.launchBrowser("chrome");
		System.out.println(b);

	}

}
