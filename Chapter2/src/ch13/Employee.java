package ch13;

public class Employee {
	
	public static int serialNum = 1000; // 회사 사원  넘버 
	private int employeeId;		//회원아이디
	private String employeeName;//회원 이름
	private String dapartment;// 부서 
	
	public Employee() {//필요에 따라서 기본 생성자 안에 넣어서 작업한다. 
		//
		serialNum++;
		employeeId = serialNum; //매번 값이 증가 할떄 마다 자동으증가 한다.
 	}
	
	//데이터를 가져오고뽑아내는 getter setter
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDapartment() {
		return dapartment;
	}
	public void setDapartment(String dapartment) {
		this.dapartment = dapartment;
	}	
}
	
	
	
