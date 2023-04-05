package ch01;

public class MyArrayTest {

	public static void main(String[] args) {
		Myarray array = new Myarray();
		array.addElement(10);
		array.addElement(20);
		array.addElement(30);
		array.insertElement(1, 50);
		array.printAll();
		
		System.out.println("=============== 요소 삭제 하기");
		array.removeElement(1);
		array.printAll();
		System.out.println("=============== 요소 추가하기");
			
		array.addElement(70); // 요소 추가하기
		
		array.printAll();
		System.out.println("============== 요소 삭제하기");
		array.removeElement(1);
		array.printAll();
		
		System.out.println("===============두번쩨요소 가져오기 ");
		System.out.println(array.getElement(2));
		
	}

	}

