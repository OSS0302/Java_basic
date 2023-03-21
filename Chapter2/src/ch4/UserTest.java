package ch4;

public class UserTest {

	public static void main(String[] args) {
		UserInfo user1 = new UserInfo("진나라군대 ", 123456 ,"Lee"); 
		System.out.println(user1.usershowInfo());
		
		UserInfo user2 = new UserInfo("촉나라군대", 22334455, "kim");
		
		System.out.println(user2.usershowInfo());
	}
	

}
