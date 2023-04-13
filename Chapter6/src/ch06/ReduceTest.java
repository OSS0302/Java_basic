package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length  >=s2.getBytes().length)return s1;
		else return s2;
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String greeting[] = {" 안녕하세요 ~~~","hello","Good morning","반갑습니다."};
		// 한글은 1바이트 고 영어는 2바이트 다
		System.out.println(Arrays.stream(greeting).reduce("", (s1,s2)->
		{if (s1.getBytes().length  >=s2.getBytes().length)return s1;
		else return s2;}
				));
		//호출하기
		String str =Arrays.stream(greeting).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
