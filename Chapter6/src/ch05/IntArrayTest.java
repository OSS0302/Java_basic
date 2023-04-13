package ch05;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5}; // 배열 선언하기 
	int sumVal = Arrays.stream(arr).sum();
	long count = Arrays.stream(arr).count();
	
	// 출력하기
	System.out.println("sum:"+sumVal); // 더하기 
	System.out.println("count:"+count); // 카운트
	
	
	}

}
