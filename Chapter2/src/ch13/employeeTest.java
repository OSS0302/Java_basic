package ch13;

public class employeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(employeeLee.serialNum); //클래스 변수 라 인스턴스 변수와 상관없이 사용 가능하다 .
		
		Employee employeeKim = new Employee(); // 
		employeeKim.setEmployeeName("김유신");
		
		
		System.out.println(employeeLee.getEmployeeName()+"님의 사번은 "+employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName()+"님의 사번은 "+employeeKim.getEmployeeId());
		//두개의 인스턴스가 하나의 메모리에 공유한다.
		//여러 인스턴스 의 공유하는 어떤 값이 필요하다 . 그러면 static 변수 값이 필요하다.
		
	}

}
