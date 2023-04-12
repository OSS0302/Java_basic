package ch03;
@FunctionalInterface// 어노테이션은 컴파일러에게 정보를 주는 역할과 오류를 방지하는 역할도 한다.
public interface MyNumber { //메서드를 두개이상  @FunctionalInterface 떄문에 오류가 난다. 허너만 지정하면된다. 
	int getMax(int num1, int num2 ); // 두수 중 더 큰 수를 보여주는 람다식 메서드 
	
}
