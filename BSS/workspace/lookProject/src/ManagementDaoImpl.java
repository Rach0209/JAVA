import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

// All_product 테이블  컬럼
// product_Name, product_Size, product_Color, product_Category,
// product_Sub_Category, product_Image, product_Season 

public class ManagementDaoImpl implements ManagementDao {
	// ResultSet mapping method
	private Item resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("product_Name");
		String size = rs.getString("product_Size");
		String color = rs.getString("product_Color");
		String category = rs.getString("product_Category");
		String subCategory = rs.getString("product_Sub_Category");
		String imageUrl = rs.getString("product_Image");
		String season = rs.getString("product_Season");
		
		return new Item(id, name, size, color, category, subCategory, imageUrl, season);
	}

	// --------------------------------
	
	
	
	
	public int[] create(List<Item> list) throws SQLException {
		String query = "INSERT INTO all_product (product_Name, product_Size, product_Color, product_Category, product_Sub_Category, product_Image, product_Season) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			// product_Name, product_Size, product_Color, product_Category,
			// product_Sub_Category, product_Image, product_Season 
			// name, size, color, category, sub_category, image, season 값			
			for (Item i : list) {
				pstmt.setString(1,  i.getName());
				pstmt.setString(2,  i.getSize());
				pstmt.setString(3,  i.getColor());
				pstmt.setString(4,  i.getCategory());
				pstmt.setString(5,  i.getSubCategory());
				pstmt.setString(6,  i.getImageUrl());
				pstmt.setString(7,  i.getSeason());
				pstmt.addBatch();
			}
			return pstmt.executeBatch();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int create(String name, String size, String color, String category, String subCategory, String imageUrl, String season) throws SQLException {
		String query = "INSERT INTO all_product (product_Name, product_Size, product_Color, product_Category, product_Sub_Category, product_Image, product_Season) VALUES (?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			// product_Name, product_Size, product_Color, product_Category,
			// product_Sub_Category, product_Image, product_Season 
			// name, size, color, category, sub_category, image, season 값
			pstmt.setString(1, name);
			pstmt.setString(2, size);
			pstmt.setString(3, color);
			pstmt.setString(4, category);
			pstmt.setString(5, subCategory);
			pstmt.setString(6, imageUrl);
			pstmt.setString(7, season);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int update(int id, String name, String size, String color, String category, String subCategory, String imageUrl, String season) throws SQLException {
		String query = "UPDATE all_product SET product_Name = ?, product_Size = ?, product_Color = ?, product_Category = ?, product_Sub_Category = ?, product_Image = ?, product_Season = ? WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		// product_Name, product_Size, product_Color, product_Category,
		// product_Sub_Category, product_Image, product_Season 
		// name, size, color, category, sub_category, image, season 값
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, size);
			pstmt.setString(3, color);
			pstmt.setString(4, category);
			pstmt.setString(5, subCategory);
			pstmt.setString(6, imageUrl);
			pstmt.setString(7, season);
			pstmt.setInt(8, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int delete(int id) throws SQLException {
		String query = "DELETE FROM all_product WEHRE id = ?";
		
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

	@Override
	public List<Item> read() throws SQLException {
		String query = "SELECT * FROM all_product";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Item> list = new ArrayList<>();
		
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
	public Item read(int id) throws SQLException {
		String query = "SELECT * FROM all_product WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
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

}
