import java.sql.SQLException;
import java.util.List;

public interface ManagementDao {
	int create(String name, String size, String color, String category, String subCategory, String imageUrl, String season) throws SQLException;
	int update(int id, String name, String size, String color, String category, String subCategory, String imageUrl, String season) throws SQLException;
	int delete(int id) throws SQLException;
	List<Item> read() throws SQLException;
	Item read(int id) throws SQLException;
	
	
}
