package ch07;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer("이모씨", 40, 1000000);
		Customer customerkim = new Customer("김모씨", 45, 1000000);
		Customer customerHong = new Customer("홍모씨", 44, 1000000);
		
		List<Customer> customerList = new ArrayList<>();
		customerList.add(customerHong);
		customerList.add(customerkim);
		customerList.add(customerLee);
		
		// 고객 출력하기 
		System.out.println("고객 여행 비용   출력하기");

		customerList.stream().map(m->m.getPrice()).forEach(s->System.out.println(s));
		 System.out.println("44세 이상인 고객님 만출력하기 ");
		customerList.stream().filter(c->c.getAge() >=44).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		System.out.println("고객 여행 비행 총 금액");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
	}

}
