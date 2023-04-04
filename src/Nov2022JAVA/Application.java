package Nov2022JAVA;

public class Application {

	public void test() {
		System.out.println("Test method..");

	}

	public void addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}

	public String getName() {
		System.out.println("get name methods..");
		String name = "Tom";
		return name;

	}

	public int getSum() {
		System.out.println("get sum methos....");
		int a = 10;
		int b = 20;
		int sum = a + b;
		return sum;

	}

	public int add(int x, int y) {
		System.out.println("add methos");
		int z = x + y;
		return z;

	}

	// WAF : input --> StudentName (String)
	// return: marks of the student (int)

	public int getMarks(String studentName) {
		System.out.println("getting marks of student " + studentName);

		if (studentName.equals("aarush")) {
			return 90;

		} else if (studentName.equals("mohit")) {
			return 80;

		} else if (studentName.equals("Rakesh")) {
			return 70;

		}

		else {
			System.out.println("Student is not found " + studentName);
			return -1;
		}

	}

	public int  getstMarks(String StudentName) {

		System.out.println("Getting student marks :" + StudentName);

		int  marks= -1;
		if (StudentName.equals("Ramesh")) {
			marks = 90;

		} else if (StudentName.equals("Rakesh")) {
			marks = 80;

		} else if (StudentName.equals("neha")) {
			marks = 70;

		}
		else {
			System.out.println("Student is not found :" +StudentName);
		}
		return marks;

	}

	public static void main(String[] args) {

		Application app = new Application();
		app.test();
		app.addition();

		String name = app.getName();
		System.out.println(name);

		int sum = app.getSum();
		System.out.println(sum);

		int add = app.add(10, 20);
		System.out.println(add);

		int mark = app.getMarks("Rakesh");
		System.out.println(mark);
	}

}
