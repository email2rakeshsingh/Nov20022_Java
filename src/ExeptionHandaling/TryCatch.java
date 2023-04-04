package ExeptionHandaling;

public class TryCatch {
	
	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		
		TryCatch obj = null;

		try {
			int i = 9 / 3;
			obj.name="Rakesh";
		} catch (ArithmeticException e) {
			System.out.println("AE exeption is comming..");
			e.printStackTrace();

		}catch (NullPointerException ee) {
			System.out.println("AE exeption is comming..");
			ee.printStackTrace();

		}

		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
