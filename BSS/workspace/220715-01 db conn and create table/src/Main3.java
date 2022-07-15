import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void selectAllbook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // Statement와 마찬가지로 interface의 sql을 import해주어야함.
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			// SQL에서 조회를 하고하자는 SELECT문은 executeQuery 문을 사용해준다.
			rs = stmt.executeQuery("SELECT * FROM books");
			// executeQuery는 ResultSet을 반환해준다.
			// ResultSet은 임포트 필요.
			
			// next()는 한 줄씩 호출한다 ---->다음줄의 유무를 불련값으로 알려줌 // hasNext와 비슷
			while (rs.next()) {
				int id = rs.getInt("bookId");
				String title = rs.getString("title"); // 제목가져오기; 제목은 문자열로 설정되어있음.
				int price = rs.getInt("price"); // 가격 가져오기.
				
				System.out.println(id + ", " + title + ", " + price);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // close()닫는 순서는 항상 마지막에 한것부터.
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
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
	
	// 메소드로빼고, 동적으로 문자열 결합 만들어줌~
	public static int insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		try {
			conn = makeConnection();
			stmt = conn.createStatement();

			// executeUpdate는 int 반환값이 존재한다. = 몇 행을 추가했는지
			result = stmt.executeUpdate("INSERT INTO books (Title, Price) VALUES (" + "'" + title + "', " + price + ");"); // "" 쌍따옴표는 에러, '' 홑따옴표로 처리
			
			System.out.println(result + "행이 추가되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 최근에 열었던 객체부터 닫아준다!
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
		
		return result;
	}
	
	public static void main(String[] args) {
		// 메소드화 시켜서 메인 메소드가 아주 간단해짐
//		insertBook("새로운 책입니당", 13000);
		selectAllbook();
		
	}
}
