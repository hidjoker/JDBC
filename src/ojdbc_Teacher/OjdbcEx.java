package ojdbc_Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC 사용 방법
// 1. JDBC 드라이버 로드
// 2. DB 연결(Connection)
// 3. SQL 쿼리 수행
// 4. 결과 처리
// 5. 연결 종료

public class OjdbcEx {
	public static void main(String[] args) {
		
		// OJDBC 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null; // DB연결 객체
		Statement st = null;	// SQL문 수행 객체
		ResultSet rs = null;	// 조회결과 반환 객체
		
		try {
			
			// DB 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"scott",
					"tiger");

			// SQL 수행 클래스 
			//	Statement 또는 PreparedrStatement
			st = conn.createStatement();
			
			// SQL 수행 메소드
			//	execute
			//	executeUpdate
			//	executeQuery - SELECT

			// SQL 수행 결과 받는 클래스 (SELECT일 경우에만)
			//	ResultSet
			
			rs = st.executeQuery(
					"SELECT * FROM emp ORDER BY empno");
			
			// 조회 결과 처리하기
			while( rs.next() ) {
				System.out.print(rs.getString("empno"));
				System.out.print(", "+rs.getString("ename"));
				System.out.print(", "+rs.getString("job"));
				System.out.print(", "+rs.getString("mgr"));
				System.out.print(", "+rs.getString("hiredate"));
				System.out.print(", "+rs.getString(6));
				System.out.print(", "+rs.getString(7));
				System.out.println(", "+rs.getString(8));
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}














