package StringManipulation;

public class StringManip {

	public static void main(String[] args) {
		String s = "Hi this is my java code";

		System.out.println("String	 Lenghth :" + s.length());
		System.out.println("Min Length :" + 0);
		System.out.println("Actual length of staring :" + (s.length() - 1));
		
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(22));
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.charAt(0));
		//System.out.println(s.charAt(-1));
		//System.out.println(s.charAt(23));
		
		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf('i'));
	    System.out.println(s.indexOf('i', 2));

	}

}
