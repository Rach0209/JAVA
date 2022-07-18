import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantRepository {
	// 음식점 리턴 메소드 (반복작업)
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int restaurantId = rs.getInt("RestaurantId");
		String title = rs.getString("name");
		String phoneNumber = rs.getString("callNum");
		String address = rs.getString("address");

		return new Restaurant(restaurantId, title, phoneNumber, address);
	}

	// 추가
	public int add(Restaurant restaurant) throws SQLException {
		String query = "INSERT INTO restaurants (name, callNum, address) VALUES ('" + restaurant.getTitle() + "', '"
				+ restaurant.getPhoneNumber() + "', '" + restaurant.getAddress() + "')";
		System.out.println("추가 : " + query);

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 리스트
	public List<Restaurant> list() throws SQLException {
		String query = "SELECT * FROM restaurants";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	// 검색
	public Restaurant selectByTitle(String title) throws SQLException {
		String query = "SELECT * FROM restaurants WHERE name = '" + title + "'";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 삭제
	public int delete(int restaurantId) throws SQLException {
		String query = "DELETE FROM restaurants WHERE RestaurantId = " + restaurantId;

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 수정
	public int update(Restaurant restaurant) throws SQLException {
		String query = "UPDATE restaurants SET name = '" + restaurant.getTitle() + "', callNum = '"
				+ restaurant.getPhoneNumber() + "', address = '" + restaurant.getAddress() + "'";

		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);

		}
	}
	public int updateTitle(Restaurant restaurant) throws SQLException {
		String query = "UPDATE restaurants SET name = '" + restaurant.getTitle() + "'" + "WHERE RestaurantId = " + restaurant.getRestaurantId();
		
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
			
		}
	}

}
