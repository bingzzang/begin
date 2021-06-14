package book.twobook.inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerId(10010);
		customerLee.setCustomerName("이곡길");
		customerLee.bonusPoint=1000;
		
		System.out.println(customerLee.showCustomerInfo());
		int price1 = customerLee.calcPrice(300000);
		System.out.println(customerLee.getCustomerName()+"님 : "+price1+"원, 포인트 : "+customerLee.bonusPoint);
		System.out.println();
	
		VipCustomer2 vipKim = new VipCustomer2();
		vipKim.setCustomerId(10020);
		vipKim.setCustomerName("김복수");
		vipKim.bonusPoint=10000;
		
		System.out.println(vipKim.showCustomerInfo());
		int price2 = vipKim.calcPrice(300000);
		System.out.println(vipKim.getCustomerName()+"님 : "+price2+"원, 포인트 : "+vipKim.bonusPoint);
		System.out.println();
	
		VipCustomer2 vipHur = new VipCustomer2(10030, "허참새", 90002);
		vipHur.bonusPoint=13000;
		
//		System.out.println(vipHur.showCustomerInfo());
		System.out.println(vipHur.showVipInfo());
		int price3 = vipHur.calcPrice(300000);
		System.out.println(vipHur.getCustomerName()+"님 : "+price3+"원, 포인트 : "+vipHur.bonusPoint);
	}
}
