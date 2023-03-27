package ch05;

public class GoldCustomer extends Customer {

	double saleRatio; // 할인율
	
	
	public GoldCustomer(int custmerID, String customerName) {
		super(custmerID, customerName);
		
		saleRatio = 0.1;// 할인율 0.1 프로
		bounsRatio = 0.02; // 포인트 적립
		customerGrade="Gold";
		
	}
	
	public int calcPrice(int price) { // 포인트 적립 계
		bounsPoint += price * bounsRatio;
		return price -(int)(price*saleRatio); 
	}

}
