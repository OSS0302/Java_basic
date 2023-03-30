package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 =10; //num1 =10변수입력
		int num2 =2; // num2 =2 변수입력 
		CompleteCalc calc =new CompleteCalc();
		System.out.println(calc.add(num1, num2)); // 더하기 
		System.out.println(calc.substract(num1, num2)); // 빼기
		System.out.println(calc.times(num1, num2));// 곱하기
		System.out.println(calc.divide(num1, num2));// 나누기
		
		calc.showInfo(); // 출력 
		
		calc.description(); // 호출되는지확인 
		// 인터페이스 생성 필요없이 사용가능하다.
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
		}

}
