// Person 클래스; 사람(부모 클래스)에게서 상속 받기
public class Author extends Person{
//	private String name;
//	private int age;
	private String bookList;
	
	public Author(String name, int age, String bookList) {
		// ****부모의 생성자를 호출하는 super키워드****
		// 언제나 생성자의 첫문장 이여야 함.
		super(name, age);
		this.bookList = bookList;
	}

	public String getBookList() {
		return bookList;
	}
	
}
