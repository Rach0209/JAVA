package question4;

public class Magazine extends Book {
	private String releaseDate;

	public Magazine(String title, int page, String author, String releaseDate) {
		super(title, page, author);
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}
	
	public String toString() {
		return super.toString() + ", 발매일 : " + releaseDate;
	}
	
	public void printAll() {
		System.out.println(this.toString());
	}
}
