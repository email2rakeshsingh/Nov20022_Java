package WebDriver_Arch;

public interface Webdriver extends SearchContext {

	@Override
	public void findelement(String element);

	@Override
	public void findelements(String element);

	public void get(String url);

	public String getTitle();

	public String getUrl();

	public void click(String ele);

	public void sendKey(String ele, String values);

	public void quit();

}
