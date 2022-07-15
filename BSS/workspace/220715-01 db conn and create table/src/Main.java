import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; // statement는 요걸로 임포트해야함 

public class Main {
	public static void main(String[] args) {
		Connection conn = null; // 둘다 finally에서 닫아주기 위해서, try 바깥으로 뺌. 
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// mysql의 jdbc 드라이버 이름
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			
			// table A : 컬럼 B VARCHAR(10) PK 생성하기.
			String query = "CREATE TABLE A (B VARCHAR(10) PRIMARY KEY)"; // 대소문자 구분 필요없음
			stmt = conn.createStatement();
			String drop = "DROP TABLE A";
			
//			stmt.executeUpdate(query); // 명령하기.
			stmt.executeUpdate(drop); // 테이블 삭제하기
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 닫는 순서는, statement를 먼저 닫고, connection을 닫아준다.
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
