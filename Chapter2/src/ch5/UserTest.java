package ch5;

public class UserTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassword = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01034556699";
		userLee.address = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());

		UserInfo user = new UserInfo("b12345", "c12456", "Kim");
		System.out.println(user.showUserInfo());
	}

}
