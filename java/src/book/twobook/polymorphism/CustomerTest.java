package book.twobook.polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cusLee = new Customer();
		cusLee.setCustomerId(10010);
		cusLee.setCustomerName("이곡길");
		cusLee.bonusPoint = 1000;
		
		System.out.println(cusLee.showCustomerInfo());
		
		Customer cusKim = new VipCustomer(10020, "김복수", 90001);
		cusKim.bonusPoint = 1000;
		
		System.out.println(cusKim.showCustomerInfo());
		System.out.println();
		
		Customer cusBok = new GoldCustomer(10030, "복대지");
		cusBok.bonusPoint = 1000;
		
		System.out.println(cusBok.showCustomerInfo());
		System.out.println();
		System.out.println("=== 할인율, 보너스 포인트 계산 ===");
		
		int price = 100000;
		int leePrice = cusLee.calcPrice(price);
		int kimPrice = cusKim.calcPrice(price);
		int bokPrice = cusBok.calcPrice(price);
		
		System.out.println(cusLee.customerName+" 님이 "+leePrice+"원 지불하셨습니다.");
		System.out.println(cusLee.showCustomerInfo());
		
		System.out.println();
		
		System.out.println(cusKim.customerName+" 님이 "+kimPrice+"원 지불하셨습니다.");
		System.out.println(cusKim.showCustomerInfo());
		
		System.out.println();
		
		System.out.println(cusBok.customerName+" 님이 "+bokPrice+"원 지불하셨습니다.");
		System.out.println(cusBok.showCustomerInfo());
	}
}
