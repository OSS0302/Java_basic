package problem25314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String data ="long ";
	
		Scanner sc =new Scanner(System.in);
		int count =sc.nextInt();
		
		 
		String repeat = data.repeat(count/4);
		System.out.println(repeat+ "int");
	
		
	}

}
