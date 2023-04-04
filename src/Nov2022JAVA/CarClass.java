package Nov2022JAVA;

import javax.swing.plaf.basic.BasicTextAreaUI;

public class CarClass {

	String name;
	String color;
	int price;
	static int wheel = 4 ;

	public static void main(String[] args) {
		
		CarClass bmw = new CarClass();
		
		String name ="remo";
		System.out.println(bmw.name);
		bmw.name="bmwe270";
		bmw.color="Red";
		bmw.price=345;
		//bmw.wheel=4;
		
		System.out.println(bmw.name +" "+ bmw.color +" "+bmw.price+" "+bmw.wheel);
		
		CarClass audi =new CarClass ();
		audi.name="audi";
		audi.color="blue";
		audi.price=900000;
		//audi.wheel=4;
		
		System.out.println(audi.name+" "+audi.color+" "+audi.price+" "+audi.wheel);
		
		CarClass maruti= new CarClass();
		maruti.name="alto";
		maruti.color="black";
		maruti.price=89000;
		//maruti.wheel=4;
		
		System.out.println(maruti.name+" "+maruti.color+" "+maruti.price+" "+maruti.wheel);
		
		

	}

}
