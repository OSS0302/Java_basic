package ch02;

public class Student implements Cloneable{
	
	private int studentId; //학생 아이디 
	private String studentName; // 학생이름 

	public Student(int studentId, String studentName)
	{
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId )
				return true;
			else return false;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	
	
	//객체의 원본을 복제하는데 사용하는 메서드
	//생성과정의 복잡한 과정을 반복하지 않고 복제 할 수 있음
	//clone()메서드를 사용하면 객체의 정보(멤버 변수 값등...)가 동일한 또 다른 인스턴스가 생성되는 것이므로, 객체 지향 프로그램에서의 정보 은닉, 객체 보호의 관점에서 위배될 수 있음
	//해당 클래스의 clone() 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해 해준다.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // 
	}

}




