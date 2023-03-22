package ch11;

public class Subway {
	
	int lineNumber; // 지하철 라인 넘버
	int passengerCount; // 승객수
	int money; //지하철 비용
	
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money +=money;
		this.passengerCount++;
		
		
	}
	public void showInfo() {
		System.out.println(lineNumber+"번의 승객수는 "+passengerCount+"명 이고 "+money +"원입니다.");
	}
	
	
	

}
