package ch10;

public abstract class Car {
	
	public abstract void drive(); //주행 
	public abstract void stop(); //브레이크
	public abstract void wiper(); // 와이퍼추가하
	
	public void startCar(){
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} //구현된 메서드 이지만 구현 내용이 없는것이다. 
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		
	}
}
