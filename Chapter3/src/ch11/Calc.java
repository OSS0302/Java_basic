package ch11;

public interface Calc {
	double PI =3.14; //파이
	int ERROR =-999999999; // 에러일경우 -999라고한다.
	
	int add(int num1, int num2); // 더하기 
	int substract(int num1, int num2);// 빼기
	int times(int num1, int num2); // 곱하기 
	int divide(int num1, int num2);// 나누기 

	
	

}
