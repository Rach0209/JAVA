import java.sql.SQLException;
import java.util.List;
/*
 * restaurants 테이블에 대한 db access를 수행하는 객체를 작성해보세요. 작성 후 테스트!!
 * 
 * 메소드(입력값) : 반환값								throws 예외
 * 
 * C(상호명, 전화번호, 주소) or C(음식점) : 행 개수
 * R() : List<음식점>									throws SQLException
 * R(pk) : 음식점										throws SQLException
 * U(pk, 새 상호명, 새 전화번호, 새 주소) or U(음식점) : 행 개수	throws SQLException
 * D(pk) : 행 개수										throws SQLException
 * 
 * ---------------------------------------------------------------------
 * 
 * 여러 행의 음식점 추가
 * 
*/ // 220719 복습겸 쌤과함께 // 내가 만든것 220718-01 프로젝트에있음. 
public interface RestaurantsDao {
	int create(String name, String phoneNumber, String address) throws SQLException;
//	int create(Restaurant restaurant) throws SQLException;
	
	List<Restaurant> read() throws SQLException;
	Restaurant read(int id) throws SQLException;
	
	int update(int id, String name, String phoneNumber, String address) throws SQLException;
	
	int delete(int id) throws SQLException;
}
