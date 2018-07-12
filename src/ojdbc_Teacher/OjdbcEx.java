package ojdbc_Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC ��� ���
// 1. JDBC ����̹� �ε�
// 2. DB ����(Connection)
// 3. SQL ���� ����
// 4. ��� ó��
// 5. ���� ����

public class OjdbcEx {
	public static void main(String[] args) {
		
		// OJDBC ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null; // DB���� ��ü
		Statement st = null;	// SQL�� ���� ��ü
		ResultSet rs = null;	// ��ȸ��� ��ȯ ��ü
		
		try {
			
			// DB ����
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"scott",
					"tiger");

			// SQL ���� Ŭ���� 
			//	Statement �Ǵ� PreparedrStatement
			st = conn.createStatement();
			
			// SQL ���� �޼ҵ�
			//	execute
			//	executeUpdate
			//	executeQuery - SELECT

			// SQL ���� ��� �޴� Ŭ���� (SELECT�� ��쿡��)
			//	ResultSet
			
			rs = st.executeQuery(
					"SELECT * FROM emp ORDER BY empno");
			
			// ��ȸ ��� ó���ϱ�
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














