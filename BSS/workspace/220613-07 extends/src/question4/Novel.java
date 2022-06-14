package question4;

public class Novel extends Book {
	private int rating;

	public Novel(String title, int page, String author, int rating) {
		super(title, page, author);
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
