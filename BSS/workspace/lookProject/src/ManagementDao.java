import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.List;

public interface ManagementDao {
	int create(String name, String size, String color, String category, String subCategory, String imageUrl, File imageBlob,
			String season) throws SQLException;

	int update(int number, String name, String size, String color, String category, String subCategory, String imageUrl, File imageBlob,
			String season) throws SQLException;

	int delete(String name) throws SQLException;

	List<Item> read() throws SQLException;

	Item read(String name) throws SQLException;

}
