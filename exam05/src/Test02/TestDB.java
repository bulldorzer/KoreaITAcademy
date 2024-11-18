package Test02;

public class TestDB {

	public static void main(String[] args) {
		String dbtype = "MYSQL";
		
		UserInfo userInfo = new UserInfo("LEE", "1234", "이순신");
		
//		인터페이스로 객체변수
		UserInfoDao userInfoDao = null;
		
		if (dbtype.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}else if (dbtype.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}else {
			System.out.println("db support error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);;
		userInfoDao.updateUserInfo(userInfo);;
		userInfoDao.deleteUserInfo(userInfo);;
	}

}
