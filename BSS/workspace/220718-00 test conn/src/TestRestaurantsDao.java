import java.sql.SQLException;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDaoImpl();

		try {
//			int result = dao.create("테스트중1", "1234-5555", "부산 어쩌구");
//			System.out.println(result == 1);

//			System.out.println(dao.read()); // 전체 목록 불러오기
//			System.out.println(dao.read(3)); // id넘버(3) 행 불러오기

//			int result = dao.update(1, "대대모골", "9874-1235", "부산 진구 어딘가요");
//			System.out.println(result == 1);
//			System.out.println(dao.read(1));

//			int result = dao.delete(1); // 에러 발생;; 외래키 참조 중인 대상에 대한 변경이나 삭제를 막는다. - 참조 무결성
//			System.out.println(result == 1);
//			System.out.println(dao.read());

			RestaurantsDaoImpl impl = (RestaurantsDaoImpl) dao;
			int[] result = impl.create(Arrays.asList(new Restaurant(0, "배치1", "089-020", "배치주소1") 
					, new Restaurant(0, "배치2", "001-023", "배치주소2")
					, new Restaurant(0, "배치3", "013-021", "배치주소3")
					, new Restaurant(0, "배치4", "0121-24", "배치주소4")
					));
			System.out.println(Arrays.toString(result));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
