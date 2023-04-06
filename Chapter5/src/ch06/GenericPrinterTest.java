package ch06;

public class GenericPrinterTest {
	public static void main(String[] args) {
		 Powder powder = new Powder();
		 GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // 다이어몬드 연산자 는 생략이 가능하다
		 powderPrinter.setMaterial(powder);
		 
		 Powder p = powderPrinter.getMaterial();
		 System.out.println(powderPrinter.toString());
		 
		 Plastic plastic =new Plastic();
		 GenericPrinter<Plastic> PlasticPrinter = new GenericPrinter<Plastic>();
		 PlasticPrinter.setMaterial(plastic);
		 Plastic pl = PlasticPrinter.getMaterial();
		 System.out.println(PlasticPrinter.toString());
	}
	
}
