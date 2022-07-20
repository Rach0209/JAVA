import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class testTranscation {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement("INSERT INTO books (title, price) VALUES (?, ?)");
			pstmt2 = conn.prepareStatement("UPDATE books SET title = ?, price = ? WHERE bookId = ?");
			
			for (int i = 0; i < 5; i++) {
				pstmt.setString(1, i + "번째 책");
				pstmt.setInt(2,  1000 * i);
				pstmt.addBatch();
			}
			
			pstmt2.setString(1, "책1");
			pstmt2.setInt(2, 50000);
			pstmt2.setString(3,  "1번째 책");
			
			pstmt.executeBatch();
			pstmt2.executeUpdate();
			
			conn.commit();
		} catch (SQLException e) {
			System.out.println("롤백합니다.");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}

	}
}
