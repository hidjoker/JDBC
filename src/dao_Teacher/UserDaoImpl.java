package dao_Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBConn;
import dto_Teacher.User;

public class UserDaoImpl implements UserDao {

	private Connection conn = DBConn.getConnection();
	
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public List<User> selectAll() {
		
		String sql = "SELECT * FROM userTb ORDER BY idx";
		
		List<User> list = new ArrayList();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				User user = new User();
				user.setIdx(rs.getInt("idx"));
				user.setUserid(rs.getString("userid"));
				user.setName(rs.getString("name"));
				
				list.add(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)	rs.close();
				if(st!=null)	st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	@Override
	public Use selectByIdx(int idx) {
		String sql = "SELECT * FROM userTb"
				+ " WHERE idx=?"
				+ " ORDER BY idx";
		
		User user = new User();
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, idx);
			
			rs = ps.executeQuery();
			
//			st = conn.createStatement();
//			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				user.setIdx(rs.getInt("idx"));
				user.setUserid(rs.getString("userid"));
				user.setName(rs.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)	rs.close();
				if(st!=null)	st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return user;
	}

	@Override
	public void insertUser(User insertUser) {
		
		String sql = "INSERT INTO userTb (idx,userid,name)"
				+ " VALUES ("
				+ " userTB_SQ.nextval,'"+insertUser.getUserid()+ "'"
				+ ",'" + insertUser.getName() + "')";
		
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(st!=null)	st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteByIdx(int idx) {
		String sql = "DELETE userTb WHERE idx=?";
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, idx);
			
			ps.executeUpdate();
			
			
//			st = conn.createStatement();
//			st.executeUpdate(sql);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(st!=null)	st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void insertUser_ps(User insertUser) {
		String sql = "INSERT INTO userTb (idx,userid,name)"
				+ " VALUES (userTB_SQ.nextval,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, insertUser.getUserid());
			ps.setString(2, insertUser.getName());
						
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)	ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}






