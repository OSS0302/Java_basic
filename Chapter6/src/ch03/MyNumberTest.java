package ch03;

public class MyNumberTest {

	public static void main(String[] args) {
		MyNumber myNumber = (x,y)->x >y ? x:y;   // x:y  중 더 큰수를 보여주 는 람다식
		System.out.println("x와 y중 더큰수:"+myNumber.getMax(21, 20));
		
			
	
	}

} 
