package ch1;

public class VIPCustomer extends Customer {
	
	
	
	double saleRatio; // 할인 율 적용
	private int  agentID; // 개인 상담 에이전트
	
	public VIPCustomer() {
		
		bounsRatio =0.05; // 포인트 적립 0.05 이고
		saleRatio= 0.1; // 할인율 적용
		customerGrade ="VIP";
		
	}
	public int getAgentID() {
		return agentID;
	}

}
