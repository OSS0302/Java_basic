package ch13.domain.userInfo;

public class UserInfio {
	
	private String UserId; //유저아이디 
	private String passWord;// 유저 비밀번호 
	private String userName; // 유저 이름
	
	// 데이터 뽑아내고 수정하는 getter and setter 
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
