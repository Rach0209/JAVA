import java.sql.SQLException;
import java.util.List;

public class TestRepo {
	public static void main(String[] args) {
		BooksRepository repo = new BooksRepository();

		int result;
		try {
//			result = repo.add(new Book("테스트용 책", 50000));
//			System.out.println("추가 확인 : " + (result == 1));
			
//			List<Book> list = repo.list();
//			System.out.println(list);
//			Book book = repo.selectByTitle("asdf");
//			System.out.println(book);
			
			result = repo.update(new Book(11, "자바에서 변경한 새이름", 5000));
			System.out.println(result == 1);
			Book book = repo.selectByTitle("자바에서 변경한 새이름");
			System.out.println(book);
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
			System.out.println(e.getCause());
			System.out.println(e.getErrorCode());
		}
	}
}
