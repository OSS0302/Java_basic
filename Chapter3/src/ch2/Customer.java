package ch2;

public class Customer {

	protected int  custmerID;// 고객아이디
	protected String customerName; //고객이름
	protected String customerGrade; // 고객 등급 
	int bounsPoint ; // 보너스 포인트 
	double bounsRatio; // 포인트적립 
	
//	public Customer() 
//	{
//		customerGrade ="SILVER"; // 실버등급
//		bounsRatio = 0.01; //0.01포인트 적립
//	System.out.println("Customer()call");
//	}
	
	public Customer(int custmerID, String customerName) {
	this.custmerID = custmerID;
	this.customerName = customerName;
	
	customerGrade ="SILVER"; // 실버등급
	bounsRatio = 0.01; //0.01포인트 적립
	System.out.println("Customer(int, String) call ");
	}
	

	


	public int calPrice(int price) {
		bounsPoint += price *bounsRatio;
		return price;
		
	}

	public int getCustmerID() {
		return custmerID;
	}
	public void setCustmerID(int customerID) {
		this.custmerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public String showCustomer() {
		return customerName+"님의 등급은"+customerGrade+"이며, 보너스포인트는"+bounsPoint+"입니다.";
	}
}	
