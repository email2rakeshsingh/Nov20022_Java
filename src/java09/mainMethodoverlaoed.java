package java09;

public class mainMethodoverlaoed {

	public static void main(int a) {
		System.out.println(a);

	}

	public static void main(int a, int b) {
		System.out.println(a + b);

	}

	public static void main(String[] args) {
		
		main(10);
		main(20,30);

	}

}
