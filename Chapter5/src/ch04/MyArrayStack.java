package ch04;

import ch01.Myarray;

public class MyArrayStack {
	Myarray arrayStack; // 패키지 챕터 1에 데이터 임포트
	int top;
	public MyArrayStack() {
		top = 0;
		arrayStack =new Myarray();
		
	}
	public MyArrayStack(int size) {
		top =0;
		arrayStack =new Myarray(size);
		
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
	}
		arrayStack.addElement(data);
		top++; // 배열 뒤로 데이터가 쌓인다.
}
	public boolean isFull() {
		if (top == arrayStack.ARRAY_SIZE) {
			return true;
			
		}
		else return false;
	}
	public int pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return Myarray.ERROR_NUM;
			 
		}
		return arrayStack.removeElement(--top); // 먼저 감소후에top 이 수행한다.
	}
	public int peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return Myarray.ERROR_NUM;
			 
		}
		return arrayStack.getElement(--top); // 먼저 감소후에top 이 수행한다.
	}
	
	
	//비워져있는지 확인 
	public boolean isEmpty() {
		if(top ==0) {
			
			return true;
		}
		else return false;
		
		
	}
	// 프린트 출
	public void printAll() {
		arrayStack.printAll();
	}
	}

