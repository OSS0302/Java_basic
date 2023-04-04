package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");
		//java.lang에 많은 생성자들을 알수있다.
		Constructor[] cons =   c.getConstructors();
		for(Constructor co :cons ) {
			//System.out.println(co);
		
		}
		
		// 메서드 확인하기
		Method[] m = c.getMethods();
		for(Method method: m ) {
			System.out.println(method);
		}
		
		
	} 

}
