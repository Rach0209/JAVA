import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantsDaoImpl implements RestaurantsDao {
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("RestaurantId");
		String name = rs.getString("name");
		String phoneNumber = rs.getString("callNum"); // 내 DB에서 phoneNumber가 아니라 callNum이라서 수정함
		String address = rs.getString("address");
		
		return new Restaurant(id, name, phoneNumber, address);
	}
	// 여러 행을 추가하기
	public int[] create(List<Restaurant> list) throws SQLException {
		String query = "INSERT INTO restaurants (name, callNum, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (Restaurant r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getPhoneNumber());
				pstmt.setString(3, r.getAddress());
				// (같은 SQL문을) 반복해서 작업하는 것 => Batch작업.
				pstmt.addBatch(); // 한줄 씩 준비해 준것을 batch라는 작업에 하나씩 쌓아둔다. 
			}
			// 쌓아둔 batch작업을 실행하기. 
			return pstmt.executeBatch(); // batch는 int[] 배열값을 반환한다.
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	
	@Override
	public int create(String name, String phoneNumber, String address) throws SQLException {
		// 파라미터가 오는 자리에 ?를 주고, PreparedStatement 객체를 사용한다.
		String query = "INSERT INTO restaurants (name, callNum, address) VALUES (?, ?, ?)";

		Connection conn = null;
		// PreparedStatement는 Statement의 자식.. 상속
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name); // 파라미터 ? 값의 1번째값을 설정
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);

			return pstmt.executeUpdate(); // 이미 준비가 끝난 쿼리문을 가지고 있기 때문에 파라미터 값을 비운다.
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public List<Restaurant> read() throws SQLException {
		String query = "SELECT * FROM restaurants";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	@Override
	public Restaurant read(int id) throws SQLException {
		String query = "SELECT * FROM restaurants WHERE RestaurantId = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id); // 준비시키기. query의 '?'값 설정
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				return resultMapping(rs);
			}
			
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
		return null;
	}

	@Override
	public int update(int id, String name, String phoneNumber, String address) throws SQLException {
		String query = "UPDATE restaurants SET name = ?, callNum = ?, address = ? WHERE RestaurantId = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int delete(int id) throws SQLException {
		String query = "DELETE FROM restaurants WHERE RestaurantId = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

}
