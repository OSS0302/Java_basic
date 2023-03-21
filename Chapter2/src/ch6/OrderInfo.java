package ch6;

public class OrderInfo {

	String orderNumber; //주문 접수번
	String phoneNumber;// 주문 핸드폰 번
	String address;// 주문 집 주
	int date; 		// 주문 날짜
	int orderTime;  // 주문 시간
	int price;		// 주문 가격
	String menuNumber; // 메뉴번호 
	
	public OrderInfo(String orderNumber, String phoneNumber, String address, int date, int orderTime, int price,
			String menuNumber) {
		
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
		this.orderTime = orderTime;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public String showOrderInfo() {
		return 
				"주문 접수 번호 :"+orderNumber
				+"주문 핸드폰 번호 :"+phoneNumber
				+"주문 집 주소 :"+address
				+"주문 시간 :"+orderTime
				+"주문 가격 :"+price
				+"메뉴 번호 :"+menuNumber;
	}
	
	
	
}

