package ch08;

import java.util.ArrayList;

class Animal{
	public void move(){
		System.out.println("동물이 움직입니다.");
	}
	public void eating() {
		System.out.println("동물은 고기를 먹습니다.");
	}
}
class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두발로 움직입니다.");
		}
	
	public void readbook() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
		public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}		
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	public void flying () {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
	}
	
}
	

public class AnimalTest {

	public static void main(String[] args) {
	Animal hAnimal = new Human();
	Animal tAnimal = new Tiger();
	Animal eAnimal = new Eagle();
	
	AnimalTest test = new AnimalTest();
	test.moveAnimal(hAnimal);
	test.moveAnimal(tAnimal);
	test.moveAnimal(eAnimal);
	
	
	ArrayList<Animal> animalList =new ArrayList<>();
//	animalList.add(hAnimal); //사람객체 을 리스트에 넣겠다.
//	animalList.add(tAnimal); //호랑객체 을 리스트에 넣겠다.
//	animalList.add(eAnimal); // 독수리객체를 리스트에넣겠다.
	
	for (Animal animal :animalList) {
		animal.move();
		
	}
	test.testDownCasting(animalList);  // 코드가 길어지고 가능하다면 다형성를 하자 
	
}
	public void testDownCasting(ArrayList<Animal>list) {
		for (int i =0; i<list.size(); i++) {
			Animal animal = list.get(i);
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readbook();
			}
			else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
				
			}
			else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
				
			}else { //타입이 없다면 지원되지 않는 타입이다.
				System.out.println("unsupported type");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
