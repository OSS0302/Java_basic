package ch2;

public class FuntutionTest {
	public static int addsum(int num1, int num2) { //add sum 함수 선언 
		int result;
		result = num1+num2;
		return result;
	}
	public static void sayHello(String greeting) {// say Hello 선언하기 
		System.out.println("안녕하세요"); // 
	}
	public static int calcSum() //calcSum ()함수 선언 하기 
	{
		int sum =0;
		
		for (int i=0; i<=100; i++) {
			sum +=i;
			
		}
		return sum;
	}
	



public static void main(String[]args) {  // 함수 호출하
	 int n1 =10;
	 int n2 =20;
	 
	 int total = addsum(n1, n2);// add sum 함수 호출하
	 System.out.println(total);
	 
	 sayHello("greeting"); // sayHello 함수 호출하기 
	 
	 total = calcSum(); // calcSum ()함수 호출하기 
	 System.out.println(total); //출력문 
	 
	 
	 
	}
}
