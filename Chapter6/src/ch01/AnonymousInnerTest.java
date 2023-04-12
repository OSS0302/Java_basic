package ch01;

class Outer2{
	int outNum =100; //지역변수
	static int sNum =200;
	Runnable getRunnable( final int i ) {// 메서드가 호출될때 매개변수인 int i 가 Static 메모리에 생성된다.
		
	final  	int num = 10; // getRunnable안에 num 10 의 지역변수
		
		
		class MyRunnable implements Runnable{
			int localNum= 1000;

			@Override
			public void run() {
				
				//num = 200;   //에러 남. 지역변수는 상수로 바뀜 이메서드 가 호출되는 시점  클래스 생성주기 다르기때문에 오류가난다.
				//i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
				}

			}
			
		
		return new MyRunnable();
	}
}
public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
	}

}
