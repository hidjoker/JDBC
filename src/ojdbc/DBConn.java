package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
	//���ᰴü
	private static Connection conn = null; 
	
	// DB ��������
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	private DBConn() {} //DBConn ��ü ���� ����
	
	public static Connection getConnection() {
		
		// DB������ �� �Ǿ����� ���� ����
		if(conn == null) { 
			try {			
				Class.forName(DRIVER); //����̹��ε�
				conn = DriverManager.getConnection(
						URL, USERNAME, PASSWORD); // DB����
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		return conn; //DB���ᰴü ��ȯ
	}
}
