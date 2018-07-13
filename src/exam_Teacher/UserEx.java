package exam;

import java.util.List;

import dao.UserDao;
import dao.UserDaoImpl;
import dto.User;

public class UserEx {
	public static void main(String[] args) {
		
		UserDao userDao = new UserDaoImpl(); 
		
		// 전체 출력
//		List<User> list = userDao.selectAll();
//		for( User u : list ) 
//			System.out.println(u);
		
		// 유저 삽입
//		User insertUser = new User();
//		insertUser.setUserid("A123");
//		insertUser.setName("Alice");
//		userDao.insertUser(insertUser);
		
		// 유저 조회
//		User selectUser = userDao.selectByIdx(20);
//		System.out.println(selectUser);
		
		// 유저 삭제
//		userDao.deleteByIdx(20);
		
		// 유저 조회
//		User resultUser = userDao.selectByIdx(20);
//		System.out.println(resultUser);
	
		
		// 유저 삽입 - PreparedStatement 사용
		User insertUser = new User();
		insertUser.setUserid("BB505");
		insertUser.setName("Bob");
		userDao.insertUser_ps(insertUser);
		
		
		
	}
}














