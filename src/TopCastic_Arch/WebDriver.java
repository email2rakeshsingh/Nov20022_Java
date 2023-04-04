package TopCastic_Arch;

public interface WebDriver extends SearchContect {

	@Override
	public void findEliment(String element);

	@Override
	public void FindElements(String element);

	public void get(String url);

	public String getTitle();

	public String getUrl();

	public void click(String ele);

	public void sendKey(String ele, String values);

	public void quit();

}
