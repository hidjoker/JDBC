package dao_Teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBConn;
import dto.Emp;

public class EmpDaoA {
	private Connection conn = DBConn.getConnection();
	
	public List<Emp> getList() {
		List<Emp> list = new ArrayList<>();
		
		String sql = "SELECT * FROM emp";
		
		try {
			conn.setAutoCommit(false);
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setHiredate(rs.getDate("hiredate"));
				
				list.add(emp);
			}
			
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return list;
	}
}
