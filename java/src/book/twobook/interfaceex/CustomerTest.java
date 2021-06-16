package book.twobook.interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cus = new Customer();
		
		Buy buyer = cus;
		buyer.buy();
		
		Sell seller = cus;
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer cus2 = (Customer)seller;
			cus2.buy();
			cus2.sell();
		}
	}
}
