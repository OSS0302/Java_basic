package ch14;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 =  Company.getInstance(); //외부 에서 getInstance 를 호춣해서 사용한다.
		Company company2 =  Company.getInstance(); 
		
		System.out.println(company1);
		System.out.println(company2);

		//Calendar calendar = Calendar.getInstance(); 유일한 객체를 사용할 떄 싱글턴 패턴을 사용한다.
	}

}
