package ch02;

public class Student1 implements Cloneable{
	private int studentNum; // 학번
	private String studentName; //학생이름
	
	public Student1(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentNum+","+studentName; 
	}
	
	
	public void setStudent1(String name) {
		this.studentName = name; 
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student1) {
			Student1 std =(Student1)obj;
			if(this.studentNum ==std.studentNum) 
				return true;
				else return false;
		}
		return false;
		
	}
		@Override
		public int hashCode() {
			return studentNum;
			
			
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	
		
	

}
