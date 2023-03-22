package ch12;

public class Human {
	String name; //사람이름
	int money;// 
	
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money-=10000;
	}
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은"+ money +"원 입니다.");
		
	}
}
