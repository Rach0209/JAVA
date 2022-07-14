import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * 데이터베이스와 연동시키기
 * 프로젝트 라이브러리에  sql connection j 참조 시키기.
 */
public class Main {
	public static void main(String[] args) {
		// 데이터베이스와 연동시키기. localhost => 내 컴퓨터 3306 => port
		String url = "jdbc:mysql://localhost:3306/world"; // 주소 경로  슬래시 갯수 조심하기
		String id = "root";
		String password = "root";
		
		// com.mysql.cj.jdbc.Driver 패키지와 클래스(Driver)를 나타냄
		// 무조건 처리해야하는 checked exception이 발생한다.
		// 자바에서는 jdbc에서 드라이버라는 매니저가 있음. mySQL 드라이버를 선택해서 연결을 만들어줌. ---> 내용 확인 필요할듯
		// forName은 클래스를 로드시키려는 과정.
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 적재 성공");
			
			// Connection ===> import 필요. 인터페이스임 => 내용이 Driver에 들어있음
			// 연결을 해줌 ==========> 닫아주어야 함.
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) { // DriverManager.getconnection의 SQLExcption
			System.out.println("데이터베이스 연결에 실패하였습니다.");
			System.out.println(e.getMessage()); // 실패하였을 때, 실패내용 호출.
		} finally {// 연결 했으면 닫아줘야함. 파일 입출력때와 같음.
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결을 닫았습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
