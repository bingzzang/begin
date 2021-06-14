package book.twobook.inheritance;

public class CustomerTest3 {

	public static void main(String[] args) {
		
		Customer vc1 = new VipCustomer2();
		
		//멤버변수와 메서드는 선언한 클래스형에 따라 호출
		vc1.setCustomerId(10002);
		vc1.setCustomerName("복대지");
		
		vc1.bonusPoint = 10000;
		
		//재정의 된 메소드(VipCustomer2의 calcPrice) 호출
		int price = vc1.calcPrice(10000);
		
		System.out.println("복대지 : "+price +"원");
		System.out.println("복대지("+vc1.getCustomerGrade()+")");
		
	}
}
