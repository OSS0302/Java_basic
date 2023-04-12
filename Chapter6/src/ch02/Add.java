package ch02;
@FunctionalInterface // 어노테이션은 컴파일러에게 정보를 주는 역할과 오류를 방지하는 역할도 한다.
public interface Add { //메서드를 두개이상 쓰면 오류가 난다. @FunctionalInterface 떄문에
	
	public int add(int x, int y);
	//public int sub(int x , int y);
}
