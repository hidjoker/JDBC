package ojdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dbutil.DBConn;

public class Test {
	public static void main(String[] args) {
	
		Connection conn = DBConn.getConnection();

		Connection conn2 = DBConn.getConnection();

		Connection conn3 = DBConn.getConnection();

	}
}















