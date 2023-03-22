package ch7;

public class Order {
	
	String orderName;// 주문자 이름
	int orderCode; // 음식코드 
	
	Food chicken;
	Food pizza;
	
	
	public Order(String orderName, int orderCode) {
		this.orderName = orderName;
		this.orderCode = orderCode;
		chicken = new Food();
		pizza =new Food();
		
	}
	public void setchicken(String name , int price) {
		chicken.foodName =name;
		chicken.price =price;
	}
	
	public void setpizza(String name , int price) {
		pizza.foodName =name;
		pizza.price =price;
	}
	
	public void showPrice() {
		int total = chicken.price+pizza.price;
		System.out.println(orderName+"님의음식 가격은 "+total + "원입니다.");
	}
}
