package ch2;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bounsPoint=1000;
		System.out.println(customerLee.showCustomer());
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
		customerKim.bounsPoint =10000;
		System.out.println(customerKim.showCustomer());
		
		Customer vc =new VIPCustomer(12345,"noname");  //자기 타입의 변수만 쓸수있다/
	
	}

}
