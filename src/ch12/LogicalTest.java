package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		int num1 =10;
		int i =2;
		boolean value = ( (num1 = num1+10)<10)&&((i=i+2)<10);
		
		System.out.println(value);
		System.out.println(i);
		System.out.println(num1);
	
		int num2 =10;
		int j =2;
		boolean value1 = ( (num1 = num1+10)>10)||((i=i+2)<10);
		
		System.out.println(value1);
		System.out.println(j);
		System.out.println(num2);
	
	}
	

}
