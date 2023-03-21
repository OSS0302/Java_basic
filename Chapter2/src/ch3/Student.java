package ch3;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID+"학번 학생 이름은"+studentName+"이고, 주소는 "+address+"입니다.");
	}
	//이름을 반환하는 메서드 만들기
	public String getstudentName() {
		return studentName;
		
	}
	public void setStudentName(String name) {
		studentName =name;
	}
}
