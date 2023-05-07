package problem25314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		String data ="long ";
//	
//		
//		int count =sc.nextInt();
//		
//		 
//		String repeat = data.repeat(count/4);
//		System.out.println(repeat+ "int");
//	

			
		Scanner sc =new Scanner(System.in);
				int n = sc.nextInt();
				String str = "";
				sc.close();
				
				for(int i=1; i<=n/4; i++) {
					str += "long ";
				}
				System.out.println(str + "int");

			}
		
	}


