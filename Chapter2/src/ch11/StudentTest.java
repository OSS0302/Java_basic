package ch11;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100); // 버스 100번 
		Bus bus500 = new Bus(500); //버스 500번 
		
		studentJ.takebus(bus100); //100번 버스를 탔다.
		
		Subway greenSubway = new Subway(2);
		studentT.takesubway(greenSubway);
		
		studentJ.showInfo(); // 제임스 대한 정
		studentT.showInfo(); // 토마스 대한 정보
		
		bus100.showInfo(); // 100버스의정보 
		greenSubway.showInfo(); // 그린 지하철에대한 정보
	}

}
