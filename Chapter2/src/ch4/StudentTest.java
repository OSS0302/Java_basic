package ch4;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee =new Student(1,"Lee",1);
		Student studentKim =new Student(2,"Kim",2);
		System.out.println(studentLee.showStudentInfo());
		System.out.println(studentKim.showStudentInfo());
	}

}
