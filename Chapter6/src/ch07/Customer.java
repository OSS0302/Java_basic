package ch07;

public class Customer {
	private String name ; // 이름 
	private int age; // 나이
	
	private int price; // 가격
	
	
	
	public Customer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "name: " + name + "age: " + age + "price: " + price; 
	}
	
	
	
	
	
	
	
}