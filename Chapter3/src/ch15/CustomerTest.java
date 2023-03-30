package ch15;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer customer =new Customer();
		customer.buy(); //사다
		customer.sell();// 팔다
		customer.order();// 주문 
		customer.hello();// 헬로
		
		Buy buyer = customer; // buy 인터페이스 안에 있는 것만쓸 수있다.
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order(); 
		
		//- 자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스는 구현 할 수 있음
		// 디폴트 메서드가 중복 되는 경우는 구현 하는 클래스에서 재정의 하여야 함
		// 여러 인터페이스를 구현한 클래스는 인터페이스 타입으로 형 변환 되는 경우 해당 인터페이스에 선언된 메서드만 사용 가능 함
		
	}	
	
}
