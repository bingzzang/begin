package book.twobook.polymorphism;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		//김복수, 이곡길, 마우수, 박람지, 복대지, 김기린, 나왕눈
		Customer cusKim = new VipCustomer(10010, "김복수", 90001);
		Customer cusLee = new VipCustomer(10020, "이곡길", 90002);
		Customer cusMa = new GoldCustomer(10030, "마우수");
		Customer cusPark = new GoldCustomer(10040, "박람지");
		Customer cusBok = new Customer(10050, "복대지");
		Customer cusKim2 = new Customer(10060, "김기린");
		Customer cusNa = new Customer(10070, "나왕눈");
		
		customers.add(cusKim);
		customers.add(cusLee);
		customers.add(cusMa);
		customers.add(cusPark);
		customers.add(cusBok);
		customers.add(cusKim2);
		customers.add(cusNa);
		
		System.out.println("--- customer list ---");
		for(Customer cus : customers) {
			System.out.println(cus.showCustomerInfo());
		}
		System.out.println();
		System.out.println("--- 할인율/보너스 포인트 ---");
		
		int price = 10000;
		for(Customer cus : customers) {
			int cost = cus.calcPrice(price);
			System.out.println(cus.getCustomerName()+" 님이 "+cost+"원 지불하셨습니다.");
			System.out.println(cus.getCustomerName()+" 님의 현재 포인트는 "+cus.bonusPoint+"점입니다.");
			System.out.println();
		}
	}
}
