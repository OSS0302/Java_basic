package ch04;

public class Binary {

	public static void main(String[] args) {
		// 2진수 0과 1로데이터를 저장한다.
		//bit(비트) 컴퓨터가표현하는데이터 최소 단위로 2진수 하나의길을 저장 할 수있는 메모리의 크기
		// byte(바이트) : 1byte -8bit
		int num =10; //정수형 integer 
		int bNum = 0B1010; //2진수
		int oNum  = 012;  //8진수
		int xNum = 0XA; // 16진수
		
	
		System.out.printf("Num:"+num);//정수형 integer 출력문
		System.out.printf("bNum:"+bNum);//정수형 2진 출력문
		System.out.printf("oNum:"+oNum);//정수형 8진수 출력문
		System.out.printf("xNum:"+xNum);//정수형 16진수 출력문
	}

}
