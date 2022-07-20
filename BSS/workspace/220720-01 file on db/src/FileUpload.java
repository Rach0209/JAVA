import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class FileUpload {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("INSERT INTO files (id, name, file) VALUES (?, ?, ?)");
			pstmt.setInt(1, 1001);
			pstmt.setString(2,  "파일이름");
			pstmt.setBlob(3, new FileInputStream(new File("D:\\BSS\\춘식이\\춘식14.png")));
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
}
