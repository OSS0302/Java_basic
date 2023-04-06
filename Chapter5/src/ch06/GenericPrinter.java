package ch06;

public class GenericPrinter<T> {
	// 클래스 옆에 가로 T 를 쓴다.
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	public String toString() {
		return material.toString();
	}
	

}
