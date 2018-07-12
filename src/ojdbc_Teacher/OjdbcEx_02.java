package ojdbc_Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_02 {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	public static void main(String[] args) {
		
		// 드라이버 로드
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null; // DB 연결객체
		
		Statement st = null; // SQL수행 객체
		ResultSet rs = null; // 조회 결과 객체
		
		String createTbSql = "CREATE TABLE userTest ("
				+ " NO NUMBER CONSTRAINT PK_USER_TEST PRIMARY KEY,"
				+ " NAME VARCHAR2(20) NOT NULL,"
				+ " PHONE VARCHAR2(40) NOT NULL )";

		String createSqSql = "CREATE SEQUENCE seq_usertest"
				+ " INCREMENT BY 1"
				+ " START WITH 1";
		
		String sql = "";
		
		try {
			// DB 연결
			conn = DriverManager.getConnection(
					URL, USERNAME, PASSWORD);
			
			// Statement 객체 얻기
			st = conn.createStatement();
			
			// Query 수행
			st.execute(createTbSql); //TB 생성
			st.execute(createSqSql); //SEQ 생성
			
			rs = st.executeQuery("SELECT COUNT(*) CNT FROM tabs"
					+ " WHERE table_name='USERTEST'");
			
			rs.next();
			if( rs.getInt("CNT") > 0 ) {
				System.out.println("테이블 생성 완료");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		
	}
}














