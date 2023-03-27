package ch05;

public class GoldCustomer extends Customer{

	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName){
		super(customerID, customerName);
	
		customerGrade = "GOLD";
		bounsRatio= 0.02;
		saleRatio = 0.1;
	
	}
	
	public int calcPrice(int price){
		bounsPoint += price * bounsRatio;
		
		return price - (int)(price * saleRatio);
	}
}

