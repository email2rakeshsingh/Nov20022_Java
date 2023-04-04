package Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.Start();
		b.Stop();
		b.Refuel();
		b.Autoparking();

		System.out.println("*********************");

		Car c = new Car();
		c.Start();
		c.Stop();
		c.Refuel();

		System.out.println("*********************");

		Car C1 = new BMW();
		C1.Start();
		C1.Stop();

	}

}
