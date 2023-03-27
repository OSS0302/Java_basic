package ch05;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
	ArrayList<Customer> customerList = new ArrayList<>();
	Customer customerT =new Customer(10010,"Tomas");
	Customer customerJ =new GoldCustomer(10020,"James");
	Customer customerE =new GoldCustomer(10030,"Edward");
	Customer customerP =new GoldCustomer(10040,"Percy");
	Customer customerK =new VIPCustomer(10050,"Kim");
	Customer customerO =new VIPCustomer(10060,"OH");
	Customer customerA =new VIPCustomer(10070,"APPLE");
	
	customerList.add(customerA);
	customerList.add(customerO);
	customerList.add(customerJ);
	customerList.add(customerK);
	customerList.add(customerT);
	customerList.add(customerJ);
	customerList.add(customerP);
	customerList.add(customerP);
	
	for (Customer customer :customerList) {
		System.out.println(customer.showCustomer()); // 고객정보  보기 
	}
	int price =10000;
	for(Customer customer : customerList) {
		int cost = customer.calPrice(price);
	}
	}
}
