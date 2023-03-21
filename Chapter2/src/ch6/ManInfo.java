package ch6;

public class ManInfo {
	//키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.
	String name; //이름
	int height; // 신장
	int weight; // 몸무게
	int age; //나이
	
	
	public ManInfo(String name, int height, int weight, int age) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	public ManInfo() {}
	public String showmanInfo() {
		return "키가"+height+"이고 몸무게가"+weight+"킬로인 남성인 있습니다."+name+"이고 나이는"+age+"세입니다.";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
