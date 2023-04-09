package ch07;

public  class Powder  extends Material{ // Material의 클래스 를 상속받는다.

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	public String toString() {
		return "재료는 Powder 입니다";
	}

}
