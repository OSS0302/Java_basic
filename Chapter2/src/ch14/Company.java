package ch14;

public class Company {
	
	private static Company instance = new Company();
	
	
	private Company() {
		
	}
	
	public static Company getInstance() { // 그래야외부 호출해서 클래스이름으로 getInstance메서드를 호출해서 쓸수있다.
		if(instance ==null) { //인스턴스가 널이면 
			instance = new Company(); // 새로 생성해라.
		
	}
	return instance;
	}
}
