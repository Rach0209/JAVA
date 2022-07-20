import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class Main {
	public static void main(String[] args) {
		// try-resource문.
		// ()안에 우리가 열고 닫고할 객체의 선언.
		// 커넥션 객체를 다 사용하고나면, 자동으로 close()해준다.
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("");) {
			pstmt.setString(1, "");
			// executeQuery()는 SELECT문. ResultSet 반환
			// executeUpdate()는 INSERT, UPDATE, DELETE int 반환 
			try (ResultSet rs = pstmt.executeQuery()) {
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		try (FileInputStream fis = new FileInputStream("")) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Connection conn = null;
//
//		try {
//			conn = DBUtil.getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}
}
