import java.sql.SQLException;

public class daotest {
	public static void main(String[] args) {
		// dao 연습; 모든 상품 읽어오기 (확인) 
		ManagementDaoImpl dao = new ManagementDaoImpl();
		try {
			System.out.println(dao.read());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
