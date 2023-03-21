package ch4;

public class UserInfo {
	
	public String userID; // 유저아이디
	public int userPassWord;// 유저비밀번호
	public String userName; // 유저이름
	
	public UserInfo(String userID, int userPassWord, String username) {
		
		this.userID = userID;
		this.userPassWord = userPassWord;
		this.userName = username;
	}
	public String usershowInfo() {
		return "학생아이디:"+userID+"학생비밀번호:"+userPassWord+"학생이름:"+userName+"입니다.";
				
	}
	
	
	
	

}
