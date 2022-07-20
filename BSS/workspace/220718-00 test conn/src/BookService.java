import java.sql.Connection;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class BookService {
	private BookDaoParamConn dao;

	public BookService(BookDaoParamConn dao) {
		super();
		this.dao = dao;
	}

	public void setDao(BookDaoParamConn dao) {
		this.dao = dao;
	}

	// 신간이 추가되면
	public void insertAndUpdate(String title, int price) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			dao.update(conn, "%" + title + "%", price);
			dao.insert(conn, title, price);
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("롤백함");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBUtil.closeConn(conn);
		}

	}
}
