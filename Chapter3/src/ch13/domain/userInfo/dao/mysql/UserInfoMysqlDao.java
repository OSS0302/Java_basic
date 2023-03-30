package ch13.domain.userInfo.dao.mysql;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) { // 글 작성 
		System.out.println("Insert into Mysql DB userId = "+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) { // 글 수정 
		System.out.println("Update into Mysql DB userId = "+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) { // 글 삭제 
		System.out.println("Delete into Mysql DB userId = "+userInfo.getUserId());
	}

}
