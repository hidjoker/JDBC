package ojdbc_Teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_03 {
	public static void main(String[] args) {

		Connection conn = DBConn.getConnection(); //DB연결
		
		Statement st = null; //SQL 수행 객체
		ResultSet rs = null; //결과 반환 객체
		
		String sql = "SELECT * FROM dept";

		try {
			st = conn.createStatement();
			
			rs = st.executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}










