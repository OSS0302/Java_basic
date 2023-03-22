package ch10;

public class Person {
	
	String name; //이름 
	int age; // 나이
	
	public Person() {
		this("no name",1);
	}
	public Person(String name, int age ) {
		this.name =name;
		this.age =age;
	}
	public void showPerson() {
		System.out.println(name+","+age);
	}
	
	public Person getPerson() {
		return this;
		
	}
}
