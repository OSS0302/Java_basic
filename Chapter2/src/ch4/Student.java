package ch4;

public class Student {

	public int studentNumber; //학생 번호 
	public String studentName; // 학생 이름 
	public int grade; // 학년 
	
	public Student(int studentNumber,String studentName, int grade) {
	this.studentNumber =studentNumber;
	this.studentName =studentName;
	this.grade =grade;
	}
	public String showStudentInfo() {
		return studentName+"학생의 학번은 "+studentNumber+"이고 "+grade+"학년입니다.";
	}
}
