package ch01; 
	
class OutClass {//외부 클래스 

		private int num = 10;
		private static int sNum = 20;
		private InClass inClass;
		
		public OutClass(){
			inClass = new InClass(); // 내부 클래스 생성 인스턴스 innerClass 는 OutClass 가 생성후에 그 다음으로 innerClass가 만들어진다.
		}
		
		class InClass{//내부클래스 
			
			int inNum = 100;
			//static int sInNum = 200;  //에러 남  인스턴스 inner Class 내부에서 는 static 변수를 사용할 수없다. 만약에 사용하려면 정적 내부 클래스에서 사용해야한다.
			
			void inTest(){
				System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
				System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
				System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
			}
			
		    //static void sTest(){  //에러 남
		    	
		    //}
			
		}
		
		public void usingClass(){
			inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
		}
	}

	public class InnerTest {

		public static void main(String[] args) {
			OutClass outClass = new OutClass();
			System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
			outClass.usingClass();    // 내부 클래스 기능 호출
		    System.out.println();
		    
			OutClass.InClass inClass = outClass.new InClass();   // 외부 클래스를 이용하여 내부 클래스 생성
			System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
			inClass.inTest();
		}

	}


