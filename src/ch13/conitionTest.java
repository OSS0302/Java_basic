package ch13;

import java.util.Scanner;

public class conitionTest {

	public static void main(String[] args) {
	
	// 두 수의 숫자비교하기 
	
	int max;
	System.out.println("두수를 입력 받아서 더큰 수를 출력하세요 ");
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("입력1");
	int num1 =scanner.nextInt();
	System.out.println("입력2");
	int num2 =scanner.nextInt();
	
	max =(num1>num2)? num1 :num2;
	System.out.println(max);
	}

}
