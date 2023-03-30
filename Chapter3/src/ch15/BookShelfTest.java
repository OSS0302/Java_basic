package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue =new BookShelf();
		bookQueue.enQueque("토지1");
		bookQueue.enQueque("토지2");
		bookQueue.enQueque("토지3");
		bookQueue.enQueque("토지4");
		bookQueue.enQueque("토지5");
		bookQueue.enQueque("삼국지1");
		bookQueue.enQueque("삼국지2");
		bookQueue.enQueque("삼국지3");
		// 책의 몇권인지 확인
		System.out.println(bookQueue.getSize()); 
		// 책이름 출력 
		// 큐에서 한개씩 제거 되므로 책 이름 추가한다.
		System.out.println(bookQueue.enQueue());
		System.out.println(bookQueue.enQueue());
		System.out.println(bookQueue.enQueue());
		System.out.println(bookQueue.enQueue());
		System.out.println(bookQueue.enQueue());
		System.out.println(bookQueue.enQueue());
		System.out.println(bookQueue.enQueue());
		System.out.println(bookQueue.enQueue());
		
		
		
	}

}
