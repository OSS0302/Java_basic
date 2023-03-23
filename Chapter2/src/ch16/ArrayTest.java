package ch16;

public class ArrayTest {
	

	public static void main(String[] args) {
		
		int[]arr= new int[10]; //new라는 키워드를 쓰면 초기화가 된다.
		int total =0;
		
		for(int i =0, num=1; i<arr.length; i++) {
			arr[i]= num++;
		}
		for(int num :arr) { //향상된 포문 
			total += num;
		}
		System.out.println(total);
	}

}
