package ch05;

import java.util.ArrayList;

public class CustomerTest {



		public static void main(String[] args) {
			
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			
			Customer customerLee = new Customer(10010, "이순신");
			Customer customerShin = new Customer(10020, "신사임당");
			Customer customerHong = new GoldCustomer(10030, "홍길동");
			Customer customerYul = new GoldCustomer(10040, "이율곡");
			Customer customerKim = new VIPCustomer(10050, "김유신");
			
			customerList.add(customerLee);
			customerList.add(customerShin);
			customerList.add(customerHong);
			customerList.add(customerYul);
			customerList.add(customerKim);
			
			System.out.println("====== 고객 정보 출력 =======");
			
//			for( Customer customer : customerList){
//				System.out.println(customer.showCustomer());
//			}
//			
//			System.out.println("====== 할인율과 보너스 포인트 계산 =======");
//			
//			int price = 10000;
//			for( Customer customer : customerList){
//				int cost = customer.calPrice(price);
//				System.out.println(customer.getCustomerName() +" 님이 " +  cost + "원 지불하셨습니다.");
//				System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bounsPoint + "점입니다.");
//			}
		
		if (customerYul instanceof GoldCustomer) { // instanceof : customerYul 이GoldCustomer 인지 확인한다.
			//원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드 맞으면 true 아니면 false를 반환 함
			GoldCustomer vc = (GoldCustomer)customerYul;
			System.out.println(customerYul.showCustomer());
			}
		}
}
		


	

