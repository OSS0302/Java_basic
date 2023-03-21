package ch5;

public class UserInfo {
	
	String userId; //유저아이디 생성하기
	String userPassword; // 유저 비밀번호
	String userName;
	String address; // 주소
	String phoneNumber; //전화번호
	public UserInfo(String userId, String userPassword, String userName) {
	
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	public UserInfo(){
		
	}
	
	public String showUserInfo() {
		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다."; 
		
	}

	
	
}
