package book.twobook.inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerId(10010);
		customerLee.setCustomerName("이곡길");
		customerLee.bonusPoint=1000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
	
		VipCustomer2 vipKim = new VipCustomer2();
		vipKim.setCustomerId(10020);
		vipKim.setCustomerName("김복수");
		vipKim.bonusPoint=10000;
		
		System.out.println(vipKim.showCustomerInfo());
		System.out.println();
	
		VipCustomer2 vipHur = new VipCustomer2(10030, "허참새", 90002);
		vipHur.bonusPoint=13000;
		
//		System.out.println(vipHur.showCustomerInfo());
		System.out.println(vipHur.showVipInfo());
	}
}
