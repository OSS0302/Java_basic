package ch09;

public  class Desktop extends Computer {// 추상메서드를포함한 추상 클래스다

	@Override
	void display() {
		System.out.println("Desktop display");
	}

	@Override
	void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	void turnOff() {
		System.out.println("Desktop turn off");
	}
	
	  

}
