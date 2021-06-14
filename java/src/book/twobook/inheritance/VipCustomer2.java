package book.twobook.inheritance;

public class VipCustomer2 extends Customer{

	private int agentId;
	double saleRatio;
	
	public VipCustomer2() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("--- VIP 생성자 호출 ---");
	}
	public VipCustomer2(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;
		System.out.println("--- VIP(int, String) 생성자 호출 ---");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price  * saleRatio);	//할인율 적용
	}
	
	public int getAgentId() {
		return agentId;
	}
	
	public String showVipInfo() {
		return super.showCustomerInfo() + " 담당 상담원 아이디는 "+ agentId +"입니다.";
	}
}
