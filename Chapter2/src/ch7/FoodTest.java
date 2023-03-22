package ch7;

public class FoodTest {

	public static void main(String[] args) {
		Order kim =new Order("김의준", 145);
		kim.setchicken("양념치킨", 250000);
		kim.setpizza("포테이트 치즈피자 ", 180000);
			
		kim.showPrice();
		
	}

}
