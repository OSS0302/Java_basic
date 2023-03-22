package ch12;

public class HumanTest {

	public static void main(String[] args) {
		Human humanE = new Human("Edward", 20000);
		
		Taxi taxi = new Taxi("잘간다 운수 택시 ");
		humanE.takeTaxi(taxi);
		humanE.showInfo();
		taxi.showInfo();
	}

}
