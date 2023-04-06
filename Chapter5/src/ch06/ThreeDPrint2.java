 package ch06;

public class ThreeDPrint2 {
	
	private Plastic material;// 
	
	public Plastic getMaterial() {
		return material;
		
	}

	public ThreeDPrint2(Plastic material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return  "재료는 Plastic입니다";
	}
}
