public class Book {
	private String title;
	private String name;
	private String publisher;
	private String genre;
	private int price;
	
	public Book(String title, String name, String publisher, String genre, int price) {
		this.title = title;
		this.name = name;
		this.publisher = publisher;
		this.genre = genre;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printAllInfo() {
		System.out.printf("제목: %s\t저자: %s\t출판사: %s\t장르: %s\t가격: %d원\n", 
				getTitle(), getName(), getPublisher(), getGenre(), getPrice());
	}
	
	
}
