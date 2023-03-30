package ch13.web.userInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;
import ch13.domain.userInfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		FileInputStream  fis = new FileInputStream("db.properties");
		Properties prop =  new Properties();
		prop.load(fis);
		// db.properties 값이오라클이냐mysql 이냐 여러가지 따라서 만들겟다.
		String dbType = prop.getProperty("DBTYPE");
		UserInfo userInfo = new UserInfo();
		UserInfoDao userInfoDao = null;
		userInfo.setUserId("아이폰");
		userInfo.setPassWord("!@#$");
		userInfo.setUserName("Lee");
		  
		
		if(dbType.equals("ORACLE")) 
		{
		userInfoDao = new UserInfoOracleDao();
		
		}else if(dbType.equals("MYSQL")) 
		{
			userInfoDao =new UserInfoMysqlDao();
		}else{
			
			
		System.out.println("db.orror");
		return;
		
		}
	userInfoDao.insertUserInfo(userInfo);
	userInfoDao.updateUserInfo(userInfo);
	userInfoDao.deleteUserInfo(userInfo);
	}
}


