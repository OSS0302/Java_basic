package ch3;

public class UserTest {

	public static void main(String[] args) {
		UserInfo userLee =new UserInfo();
		userLee.userId="당나라군대 ";
		userLee.userPassword="12345";
		userLee.userName="Lee";
		userLee.address="서울특별시 영등포";
		userLee.phoneNumber=1234567;
		
		userLee.userShowInfo();
		
		UserInfo userKim =new UserInfo();
		userKim.userId="수나라군대 ";
		userKim.userPassword="23456";
		userKim.userName="Kim";
		userKim.address="서울시 동작구 ";
		userKim.phoneNumber=2345678;
		
		userKim.userShowInfo();
	}
	
	

}
