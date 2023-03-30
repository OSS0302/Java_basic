package ch14;

public interface Calc {
	double PI =3.14; //파이
	int ERROR =-999999999; // 에러일경우 -999라고한다.
	
	int add(int num1, int num2); // 더하기 
	int substract(int num1, int num2);// 빼기
	int times(int num1, int num2); // 곱하기 
	int divide(int num1, int num2);// 나누기 

	
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
	}
	
	
	
	static int total(int[] arr) {
		int total =0;
		for(int num :arr ) {
			total += num;
		}
		myStaticMethod();
		return total; // 합계값을 리턴하겠다.
	}
	private void myMethod() {
		System.out.println("myMethod");
	}
	private static void myStaticMethod() {
		System.out.println("myStaticMethod ");
	}

}
