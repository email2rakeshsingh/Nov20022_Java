package OOP_Abstract;

public abstract class Page {

	public Page() {
		System.out.println("Page Const.");
	}

	public Page(int a) {
		System.out.println("Page class constr. " + a);

	}

	public abstract void pagetitle();

	public abstract void pageUrl();

	public abstract void header();

	public void timeout() {
		System.out.println("Page time out :20 sec");
	}
}
