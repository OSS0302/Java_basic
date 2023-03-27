package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bounsPoint=1000;
		int price = customerLee.calPrice(1000);
		System.out.println(customerLee.showCustomer()+price);
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
		customerKim.bounsPoint =10000;
		price = customerKim.calPrice(1000);
		System.out.println(customerKim.showCustomer()+price);
		
		Customer vc =new VIPCustomer(12345,"noname");  //자기 타입의 변수만 쓸수있다/
		int cal =vc.calPrice(1000);
		System.out.println(cal);
	
	}

}
