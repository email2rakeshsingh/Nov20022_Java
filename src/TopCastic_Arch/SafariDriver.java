package TopCastic_Arch;

public class SafariDriver implements WebDriver{
	public SafariDriver() {
		System.out.println("Please enetr the Safari browser");
	}

	@Override
	public void findEliment(String element) {
		System.out.println("Find the element " + element);

	}

	@Override
	public void FindElements(String element) {
		System.out.println("Find the elements :" + element);

	}

	@Override
	public void get(String url) {
		System.out.println("enter the url " + url);

	}

	@Override
	public String getTitle() {

		return "Amazon";
	}

	@Override
	public String getUrl() {

		return "Https://amazon.com";
	}

	@Override
	public void click(String ele) {
		System.out.println("enter ele " + ele);

	}

	@Override
	public void sendKey(String ele, String values) {
		System.out.println("enter values in ele " + ele + "vlues is " + values);

	}

	@Override
	public void quit() {
		System.out.println("Quit the browser");

	}

}
