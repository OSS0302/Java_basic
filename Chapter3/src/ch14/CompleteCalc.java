package ch14;

public class CompleteCalc extends Calculator {

	@Override // 곱하기 메서드
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override // 나누기 메서드 
	public int divide(int num1, int num2) {
		if(num2 ==0) {
			return ERROR;
		}
		return num1/num2 ;
	}
	public void showInfo() { // 보여주기
		System.out.println("모두 구현했습니다. ");
		
	}

	@Override
	public void description() { // 정적 메서드 
		System.out.println("CompleteCalc ovrriding");
	}
	
	

}
