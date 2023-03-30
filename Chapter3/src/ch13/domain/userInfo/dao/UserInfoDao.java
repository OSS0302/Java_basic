package ch13.domain.userInfo.dao;

import ch13.domain.userInfo.UserInfo;

public interface UserInfoDao {
	// 유저인포 에대한 기능을 쓰는 인터페이스 
	void insertUserInfo(UserInfo userInfo); //유저 작성 
	void updateUserInfo(UserInfo userInfo); // 유저 수정
	void deleteUserInfo(UserInfo userInfo); // 유저 삭제 
	
	
}
