import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutil.DBUtil;

// Eclipse는 프로젝트를 프로젝트에 바로 포함시킬 수 있다. (jar파일로 배포하는 번거러움 방지)
// properties에서 프로젝트를 포함시켰다.
public class TestConn { 
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.println("스태틱블럭 실행흐름 1");
		
		try {
			conn = DBUtil.getConnection();
			
			System.out.println("스태틱블럭 실행흐름 2");
			// 로드는 딱 한번 일어난다.
			
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 1");
			
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("확인 : " + result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
	}
}
