package ch07;

public class Plastic extends Material {

	@Override
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	
	}
	public String toString() {
		return "재료로 Plastic 입니다.";
	}
}
