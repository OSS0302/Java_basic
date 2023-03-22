package ch12;

public class Taxi {
	
	String companyName; //회사이름 
	int money;  // 수입

	
	public Taxi(String companyName) {
		this.companyName = companyName;
		
	}
	
	public void take(int money) {
		this.money += money;
	} 
	
	public void showInfo() {
		System.out.println(companyName+"수입은 "+money+"원입니다.");
	
		
	}

}
