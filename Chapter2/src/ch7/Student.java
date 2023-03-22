package ch7;

public class Student {
	
	int StudentID;		//학번
	String StudentName;//학생이름 
	
	Subject korea; //국어 
	Subject math; // 수학 
	
	
	public Student(int studentID, String studentName) {
		StudentID = studentID;
		StudentName = studentName;
		
	
	// 주소를 가르칠 4바이트밖에 안되서 생성자를 생성한다.
		//사용하기 전에 사용해야한다. 
	korea =new Subject();
	math = new Subject();
	
	}
	public void setKoreaSubject(String name , int score) {
		korea.subjectName =name;
		korea.score=score;
		
	}
	public void setMathSubject(String name , int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScore() {
		int total = korea.score +math.score;
		System.out.println(StudentName+"학생의총점은 "+total + "점입니다.");
	}
}
