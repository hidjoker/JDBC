package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dto.User;
import dbutil.DBConn;

public class UserDao implements dao_Teacher.UserDao{

	Connection conn = null;
	Statement st = null;
	
	// UserTB 전체 조회
	//	idx 정렬
	@Override
	public List<User> selectAll() {

		conn = DBConn.getConnection();
		List<User> list = new ArrayList<>();
		ResultSet rs = null;

		try {
			
			String q = "Select * FROM USERTB";

			st = conn.createStatement();
			rs = st.executeQuery(q);
			
			while(rs.next()) {
				User dto = new User();
				dto.setIdx(rs.getInt(1));
				dto.setUserId(rs.getString(2));
				dto.setName(rs.getString(3));
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return list;
	}

	// idx를 이용한 UserTB 조회 - 1명
	@Override
	public User selectByIdx(int idx) {
		
		conn = DBConn.getConnection();
		ResultSet rs = null;
		User dto = null;
		
		try {
			
			String q = " Select * FROM USERTB WHERE IDX = ? ";
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setInt(1, idx);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				dto = new User();
				dto.setIdx(rs.getInt(1));
				dto.setUserId(rs.getString(2));
				dto.setName(rs.getString(3));
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return dto;
	}

	// User 삽입
	@Override
	public void insertUser(User insertUser) {
		conn = DBConn.getConnection();
		String q = " INSERT INTO USERTB VALUES(?,?,?) ";
		try {
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setInt(1, insertUser.getIdx());
			ps.setString(2, insertUser.getUserId());
			ps.setString(3, insertUser.getName());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}

	// idx를 이용한 UserTb 삭제
	@Override
	public void deleteByIdx(int idx) {
		conn = DBConn.getConnection();
		String q = "DELETE FROM USERTB WHERE IDX = ?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setInt(1, idx);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}	

}
