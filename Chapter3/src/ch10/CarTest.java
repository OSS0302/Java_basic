package ch10;

public class CarTest {

	public static void main(String[] args) {
		Car car = new AICar();
		car.run();
		Car mCar = new ManualCar();
		mCar.run();
		}

}
