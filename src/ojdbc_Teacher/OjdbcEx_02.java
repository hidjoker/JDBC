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
		
		// ����̹� �ε�
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null; // DB ���ᰴü
		
		Statement st = null; // SQL���� ��ü
		ResultSet rs = null; // ��ȸ ��� ��ü
		
		String createTbSql = "CREATE TABLE userTest ("
				+ " NO NUMBER CONSTRAINT PK_USER_TEST PRIMARY KEY,"
				+ " NAME VARCHAR2(20) NOT NULL,"
				+ " PHONE VARCHAR2(40) NOT NULL )";

		String createSqSql = "CREATE SEQUENCE seq_usertest"
				+ " INCREMENT BY 1"
				+ " START WITH 1";
		
		String sql = "";
		
		try {
			// DB ����
			conn = DriverManager.getConnection(
					URL, USERNAME, PASSWORD);
			
			// Statement ��ü ���
			st = conn.createStatement();
			
			// Query ����
			st.execute(createTbSql); //TB ����
			st.execute(createSqSql); //SEQ ����
			
			rs = st.executeQuery("SELECT COUNT(*) CNT FROM tabs"
					+ " WHERE table_name='USERTEST'");
			
			rs.next();
			if( rs.getInt("CNT") > 0 ) {
				System.out.println("���̺� ���� �Ϸ�");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		
	}
}














