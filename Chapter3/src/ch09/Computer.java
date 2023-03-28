package ch09;

public abstract class Computer {
	 abstract void display();// 디스플레
	 abstract void typing(); // 타이핑
	
	void turnOn() { // 전원을 켜는 메서드 
		System.out.println("전원을 컵니다.");
		
	}
	void turOff() {// 전원을 끄는 메서드 
		System.out.println("전원을 끕니다.");
	}
}
