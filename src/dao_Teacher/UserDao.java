package dao_Teacher;

import java.util.List;

import dto.User;

public interface UserDao {
	// UserTB 전체 조회
	//	idx 정렬
	public List<User> selectAll();
	
	// idx를 이용한 UserTB 조회 - 1명
	public User selectByIdx(int idx);

	// User 삽입
	public void insertUser(User insertUser);

	// User 삽입 - PreparedStatement 사용
	public void insertUser_ps(User insertUser);

	// idx를 이용한 UserTb 삭제
	public void deleteByIdx(int idx);
	
}




