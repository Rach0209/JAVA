package kr.co.greenart.dbutil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

// 데이터베이스와의 연결을 프로젝트, 파일로 관리하기.
// 문자열 관계를 독립적으로 존재할 수 있게, _DB UTIL 프로젝트에서 properties 파일로 관리중.
// 파일을 객체로 사용할 수 있게 만듬.
// 일일이 타이핑 할 필요 없게. 내용의 변경이 필요할 때도, 파일을 수정하고, 파일 자체를 다시 읽어오면
// 번거로움을 줄일 수 있다.

public class DBUtil {
	private final static Properties properties = new Properties();

	static {
//		System.out.println("스태틱 블럭은 언제 실행될까?~");
		InputStream inStream = null;
		
		try {
			// 프로퍼티 파일을 읽어서(인풋스트림) 객체화
			inStream = DBUtil.class.getClassLoader().getResourceAsStream("mysql.properties");
			properties.load(inStream);

			String driverClass = properties.getProperty("JDBC_DRIVER_CLASS");

			// 드라이버 로드(적재)
			Class.forName(driverClass);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 연결 메소드
	public static Connection getConnection() throws SQLException {
		String url = properties.getProperty("JDBC_URL");
		String id = properties.getProperty("JDBC_USERNAME");
		String password = properties.getProperty("JDBC_PASSWORD");

		return DriverManager.getConnection(url, id, password);
	}
	
	// Connection 닫아주기
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Statement 닫아주기
	public static void closeStmt(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ResultSet 닫아주기
	public static void closeRS(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
