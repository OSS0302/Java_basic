package ch15;

public class Car {
	private static int serialNum= 10000;// 차량 시리얼넘버 10000기준
	private int CarNum;		//차량아이디
	
	public Car () {
		serialNum++;
		CarNum= serialNum;
	}

	public int getCarNum() {
		return CarNum;
	}

	public void setCarNum(int carNum) {
		CarNum = carNum;
	}

	
	
	
	











	
	
}
