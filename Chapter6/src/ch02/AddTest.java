package ch02;

public class AddTest {

	public static void main(String[] args) {
		
		// 람다식 구현
		Add add  = (x,y)-> {return x+y;};  //Add 인터페이스  add 메서드 
		
		//호출하기 
		System.out.println(add.add(2, 3));
	}

}
