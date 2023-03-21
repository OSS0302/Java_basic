package ch3;

public class UserInfo {
	
	String userId; //유저아이디 생성하기
	String userPassword; // 유저 비밀번호
	String userName;
	String address; // 주소
	int phoneNumber; //전화번
	
	public void userShowInfo() {
		System.out.println("유저아이디:"+userId+"비밀번호는:"+userPassword+"유저이름:"+userName+"주소는"+address+"전호번호:"+phoneNumber);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
