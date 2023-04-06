package ch05;


public class MyListQueueTest {
	
	public static void main(String[] args) {
		MyLinkedQueue listQueue = new MyLinkedQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		listQueue.enQueue("D");  
		// 큐는 먼저 들어간게 출력이 된다.
		listQueue.printAll(); // 전체출력하기
		
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());

	}

}
