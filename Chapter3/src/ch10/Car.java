package ch10;

public abstract class Car {
	
	public abstract void drive(); //주행 
	public abstract void stop(); //브레이크
	
	public void startCar(){
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		
	}
}
