package ch03;

public class VIPCustomer extends Customer {

	double saleRatio; // 할인 율 적용
	private String agentID; // 개인 상담 에이전트
	
//	public VIPCustomer() {
//		super(0, "no-name");// 자바 클래스는모든object로 상속받는다.
//		bounsRatio =0.05; // 포인트 적립 0.05 이고
//		saleRatio= 0.1; // 할인율 적용
//		customerGrade ="VIP";
//		System.out.println("VIPCustomer()call");
//		
//	}
	public VIPCustomer(int custmerID, String customerName) {
		super(custmerID, customerName);
		customerGrade ="VIP"; //등급 
		bounsRatio =0.05; // 포인트 적립 0.05 이고
		saleRatio= 0.1; // 할인율 적용
	}
	
	
	//재정의하기
	@Override
	public int calPrice(int price) { //오버라이딩 돤것은 함수이름이 변경되면 안된다.
		bounsPoint += price *bounsRatio;
		price -=(int)(price*saleRatio );
		return super.calPrice(price);
	}



	public String getAgentID() {
		
		return agentID;
	} 
	
	

}
