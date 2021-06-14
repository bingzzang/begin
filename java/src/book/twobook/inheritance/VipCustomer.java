package book.twobook.inheritance;

public class VipCustomer {

	private int customerId;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//vip일때만 필요한 변수
	private int agentId;
	double saleRatio;
	
	public VipCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price  * saleRatio);	//할인율 적용
	}
	
	public int getAgentId() {
		return agentId;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
