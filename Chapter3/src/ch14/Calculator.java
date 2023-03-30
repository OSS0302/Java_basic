package ch14;

public abstract class Calculator implements Calc{

	@Override // 더하기메서드
	public int add(int num1, int num2) {
		return num1 +num2 ;
	}

	@Override // 뺴기 메서드 
	public int substract(int num1, int num2) {
		return  num1 -num2 ;
	}

}
