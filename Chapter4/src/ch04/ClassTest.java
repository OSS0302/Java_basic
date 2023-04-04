package ch04;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c1 = Class.forName("ch04.Person");
		
		// 인스턴스생성
	Person person  =(Person)c1.newInstance();
		
	}

}
