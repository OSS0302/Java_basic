package ch15;

public class MyClassTest {

		public static void main(String[] args) {

			MyClass mClass = new MyClass();
			
			X xClass = mClass;
			xClass.x();
			
			
			Y yClass = mClass;
			yClass.y();
			
			MyClass iClass = mClass;
			iClass.x();
			iClass.y();
			iClass.myMethod();
		}
		//인터페이스 사이에도 상속을 사용할 수 있음
		//extends 키워드를 사용
		//인터페이스는 다중 상속이 가능하고 구현 코드의 상속이 아니므로 타입 상속 이라고 함

	}
