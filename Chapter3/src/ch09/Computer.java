package ch09;

public abstract class Computer {
	 abstract void display();// 디스플레
	 abstract void typing(); // 타이핑
	// 추상메서드로 놓고 그다음에 하위클래스에게 책임을 넘긴다.
	 
	void turnOn() { // 전원을 켜는 메서드 
		System.out.println("전원을 컵니다.");
		
	}
	void turOff() {// 전원을 끄는 메서드 
		System.out.println("전원을 끕니다.");
	}
	//추상클래스 안에 공통으로 사용할 메서드들을 선언한다.
}
