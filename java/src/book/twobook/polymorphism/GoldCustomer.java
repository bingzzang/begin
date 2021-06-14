package book.twobook.polymorphism;

public class GoldCustomer extends Customer {

	double saleRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price  * saleRatio);	//할인율 적용
	}
	
}
