package java09;

public class StaticNonStatic {

	String name;
	int age;
	static String url = "https://www.amazon.in/";

	public static void shareInfo() {
		System.out.println("share info....");

	}

	public void sendEmail() {
		System.out.println("send email ....");

	}

	public static void main(String[] args) {
		StaticNonStatic obj = new StaticNonStatic();
	obj.age=20;
	obj.name="Rakesh";
	System.out.println(obj.age);
	System.out.println(obj.name);
	
	
	System.out.println(StaticNonStatic.url);
	StaticNonStatic.shareInfo();
	
		
	}

}
