package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_02 {
	
//	+ execute 종류
//	- ResultSet executeQuery(String sql)
//		SELECT 쿼리의 결과를 ResultSet으로 반환
//		ResultSet은 조회된 모든 행을 담고있다
//		반환객체.next()를 호출할 때마다 다음 행을 가리키게 됨
//	- int executeUpdate(String sql)
//		INSERT, UPDATE, DELETE 를 수행할 때 사용
//		return : int -> 영향받은 행 수
//	- boolean execute(String sql)
//		CREATE, ALTER, DROP 을 수행할 때 사용
//		true - ResultSet 객체를 반환할 경우
//		false - ResultSet 객체를 반환하지 않을 경우

	
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
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			// Statement 객체 얻기
			st = conn.createStatement();
			
			// Query 수행
			st.execute(createTbSql); //TB 생성
			st.execute(createSqSql); //SEQ 생성
			
			rs = st.executeQuery("SELECT COUNT(*) FROM tabs"
					+ " WHERE table_name='USERTEST'");
			
			rs.next();
			if(rs.getInt(1) > 0 ) {
				System.out.println("테이블 생성 완료");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
