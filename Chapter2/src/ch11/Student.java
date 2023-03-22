package ch11;

public class Student {
	String studentName; // 학생이
	int money; // 돈
	
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takebus(Bus bus) {
		bus.take(1000);
		this.money-= 1000;
	} 
	public void takesubway(Subway subway) {
		subway.take(1200);
		this.money-= 1200;
	} 
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은돈은 "+ money +"은 돈입니다.");
	}
	
	
}
