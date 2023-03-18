package ch14;

import java.util.Scanner;

public class ifEsleIfEsle_test {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("나이를 입력해주세");
		
		int age = scanner.nextInt();
		
		int charge; 
	   	if(age < 8){
	   		charge = 1000; 
	   		System.out.println("미 취학 아동입니다.");
	   	}
	   	else if(age < 14){
	   		charge = 2000;
	   		System.out.println("초등학생 입니다.");
	   	}
	   	else if(age < 20){
	   		charge = 2500;
	   		System.out.println("중, 고등학생 입니다.");
	   	}
	   	else{
	   		charge = 3000;
	   		System.out.println("일반인 입니다.");
	   	} 
	   	
	   	System.out.println("입장료는 " + charge + "원입니다.");
	   }
	}

	


