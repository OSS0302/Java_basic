package ch6;

public class ManTest {
	//키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.
	public static void main(String[] args) {
		 ManInfo man = new ManInfo();
		 man.name ="Tomas";
		 man.height=180;
		 man.weight=78;
		 man.age=37;
		 
		 System.out.println(man.showmanInfo());
		 ManInfo man1 = new ManInfo("KIM MIN JUN",180, 78 ,38);
		 System.out.println(man1.showmanInfo());
	}
	

}
