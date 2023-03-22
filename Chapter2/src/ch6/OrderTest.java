package ch6;

public class OrderTest {

	public static void main(String[] args) {
		OrderInfo  order = new OrderInfo("2020110200003", "01023450001", "서울시 강남구 역삼동 111-333",20201102, 130258, 35000, "0003");
		System.out.println(order.showOrderInfo());
	}
	
}
