package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		Powder powder =new Powder();
		ThreeDPrint3 printer = new ThreeDPrint3();
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial(); 
		//ThreeDPrint3 클래스안에 objcet 라는 최상위 객체 라 다운 형변환을 해줘야한다.
		System.out.println(p);
	}

}
