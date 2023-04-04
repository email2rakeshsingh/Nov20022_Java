package OOP_encapsulation;

public class AmazonTest {

	public static void main(String[] args) {

		Amazon seller = new Amazon("email2rakesh@gmail.com", "Rak@1234");

		seller.doLogin();
		
		seller.setPassword("Ram@123456");
		seller.doLogin();
		
		seller.logOut();
	

	}

}
