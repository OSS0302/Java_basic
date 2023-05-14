package problem10869;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int num1 =scanner.nextInt();  //num1 에대한 입력함수
		int  num2 =scanner.nextInt(); //num2에 대한입력함수 
		System.out.println(num1+num2);// 더하기 
		System.out.println(num1-num2);// 빼기
		System.out.println(num1*num2);// 곱하기 
		System.out.println(num1/num2); // 나누기 
		System.out.println(num1%num2); // 나누기 
		scanner.close(); //스캔함수 를 닫아야한다.
	}

}