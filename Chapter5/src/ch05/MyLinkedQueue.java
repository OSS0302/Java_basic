package ch05;


import ch03.MyLinkedList;
import ch03.MyListNode;

public class MyLinkedQueue  extends MyLinkedList implements Queue {
	
	MyListNode front; //앞
	MyListNode rear; // 뒤
	
	

	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			newNode= addElement(data);
			front= newNode;
			rear = newNode;
		
		}
		else {
			newNode = addElement(data);
			rear = newNode;
			
		}
		System.out.println(newNode.getData()+"added");
	}
	

	@Override
	public String deQueue() {
			if(isEmpty()) {
				return null;
			}
			String data = front.getData();
			front = front.next; // 다음걸 가르키면된다.
			
			if(front == null) {
				rear= null;
			}
			
			return data;
			
	
	}
	// printall은 이미 myLinkedList에이미 구현되어서 나오지 않는다.	
	//여기서 새로운 printAll 대신에 printQueue을 생성한다.
	@Override
	public void printQueue() {
		printAll();
	}

	



}
