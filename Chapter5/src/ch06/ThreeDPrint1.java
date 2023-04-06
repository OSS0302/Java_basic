 package ch06;

public class ThreeDPrint1 {
	
	private Powder material;// 
	
	public Powder getMaterial() {
		return material;
		
	}

	public ThreeDPrint1(Powder material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return  "재료는 Powder입니다";
	}
	
	
	

}
