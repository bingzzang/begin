package book.twobook.polymorphism;

public class VipCustomer extends Customer{

	private int agentId;
	double saleRatio;

//		public VipCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//	}
	public VipCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;
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
