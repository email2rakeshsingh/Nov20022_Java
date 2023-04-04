package StringManipulation;

public class StringReverse {

	public static void main(String[] args) {

		System.out.println(reverseString("Rakesh"));
		System.out.println(reverseString("m"));
		System.out.println("101");

	}

	public static String reverseString(String str) {

		int len = str.length();

		if (len == 1) {
			return str;

		}
		String rev = " ";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		// System.out.println(rev);
		return rev;
	}

}
