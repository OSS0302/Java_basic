package ch17;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] libray = new Book[5];
		Book[] copylibray =new Book[5];
		

		libray[0] = new Book("태백산맥1","조정래");
		libray[1] = new Book("태백산맥2","조정래");
		libray[2] = new Book("태백산맥3","조정래");
		libray[3] = new Book("태백산맥4","조정래");
		libray[4] = new Book("태백산맥5","조정래");
		
		System.arraycopy(libray, 0, copylibray, 0, 5);
		
		
//		System.out.println("== libray ==");
//		for (Book book :libray) {
//			System.out.println(book);
//			book.showInfo(); 
//		}
//		System.out.println("== copylibray ==");
//		for (Book book :libray) {
//			System.out.println(book);
//			book.showInfo(); 
//		}
		libray[0].setAuthor("박완서 "); // 저자 변경하기
		libray[0].setTitle("니목"); //제목 변경하기 
		System.out.println("== libray ==");
		for (Book book :libray) {
			System.out.println(book);
			book.showInfo(); 
		}
		System.out.println("== copylibray ==");
		for (Book book :libray) {
			System.out.println(book);
			book.showInfo(); 
		}
		// 얇은 복사: 라이브러리 배열과 카피 배열 얇은 복사는 했지만 값의 주소 가르치 때문에  같은 값이 나온다.
	}
	
}
