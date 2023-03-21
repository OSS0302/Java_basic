package ch3;

public class StudentTest {

	public static void main(String[] args) {
		
		//클래스 생성방법은 
		Student studentLee =new Student();//Studnent  데이터 타입 한명을 생성해라.
		studentLee.studentID = 12345;// 변수아이디 는 
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구 ";
		
		//학생 한명를 클래스 를 인스턴스 생성하고 메서드 맴버변수를 이용해서 값을 세팅했다.
		
		studentLee.showStudentInfo(); // 학생 메서드 호출하기 
		
		Student studentOh =new Student();
		studentOh.studentID = 33132;
		studentOh.setStudentName(" OH ");
		studentOh.address ="경기도 수원시";
		
		studentOh.showStudentInfo();
		// 클래스 변수 참조변수 는 생성자의 메모리 위치 
	}

}
