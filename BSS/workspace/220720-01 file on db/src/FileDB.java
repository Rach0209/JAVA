import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class FileDB {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM files WHERE id = ?");
			pstmt.setInt(1, 1000);

			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Blob file = rs.getBlob("file"); // SQL 패키지에 Blob이 존재.
				
				InputStream inputStream = file.getBinaryStream();
				FileOutputStream fos = new FileOutputStream(new File("다운로드받은거.png"));
				
				// 1 바이트를 읽어서 inputStream에 담았다가, write해준다.
				int b = 0;
				while ( ( b = inputStream.read() ) != -1 ) {
				fos.write(b);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
}
