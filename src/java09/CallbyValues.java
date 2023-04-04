package java09;

public class CallbyValues {

	int x;
	int y;

	public int sum(int a, int b) {

		int z = a + b;
		return z;
	}

	public void getInfo(CallbyValues p) {
		System.out.println(p.x);
		System.out.println(p.y);

		p.x = 60;
		p.y = 80;

	}

	public static void main(String[] args) {

		CallbyValues obj = new CallbyValues();
		int s = obj.sum(10, 20);
		System.out.println(s);

		obj.x = 30;
		obj.y = 50;

		obj.getInfo(obj);

		System.out.println(obj.x);
		System.out.println(obj.y);

	}

}
