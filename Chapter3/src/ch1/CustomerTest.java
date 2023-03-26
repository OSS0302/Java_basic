package ch1;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustmerID(10010);
		customerLee.bounsPoint=1000;
		System.out.println(customerLee.showCustomer());
		
		Customer customerKim = new Customer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustmerID(10020);
		customerKim.bounsPoint =10000;
		System.out.println(customerKim.showCustomer());
	}

}
