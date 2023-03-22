package ch11;

public class Bus {
	int busNumber; // 버스 번호
	int passengerCount;// 승객수 
	int money; //버스비용 
	
	public Bus(int busNumber) {
		this.busNumber =busNumber;
		
	}
	public void take(int money) {
		this.money+= money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(busNumber+"번의 승객수는 "+passengerCount+"명 이고 "+money +"원입니다.");
	}
}
