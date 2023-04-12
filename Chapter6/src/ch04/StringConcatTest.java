package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 ="Chicken";
		
		StringConcatInpl strImpl = new StringConcatInpl();
		strImpl.makeString("Hello","Chicken "); // 호출하기 
		
		// 람다식 으로 테스트하기
		StringConcat concat = (s,v)->System.out.println(s+","+v);
		concat.makeString(s1, s2);
	}

}
