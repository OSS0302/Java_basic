package ch12;

public class Taxi {
	String TaxiNumber; // 택시번호
	String companyName; //회사이름
	int money;  // 수입

	
	public Taxi(String companyName,String TaxiNumber) {
		this.companyName = companyName;
		this.TaxiNumber = TaxiNumber;
		
	}
	
	public void take(int money) {
		this.money += money;
	} 
	
	public void showInfo() {
		System.out.println(TaxiNumber+"택시 넘버이 "+companyName+"수입은 "+money+"원입니다.");
	
		
	}

}
