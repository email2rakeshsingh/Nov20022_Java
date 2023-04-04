package BulderPattern;

public class AmazonShoping {

	public static void main(String[] args) {

		Ecomm e1 = new Ecomm();

		e1.login("rak@amazon.com", "Rak@123")
		   .addToCart("mobile")
		      .doPayment("123")
		         .doSearch("rakesh@gmail.com", 123)
				    .getOderID().logOut();
		
		e1.login("rak@gmail.com", "Rak@1223")
		   .addToCart("rakesh")
		     .doSearch("kul")
		       .logOut();
		
		e1.login("rak@1234", "Rak@123")
		    .doPayment("rakesh")
		      .logOut();

	}

}
