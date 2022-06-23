package myversiondiary;


public class Diary implements Comparable<Diary>{
	private int date;
	private String title;
	private String weather;
	private String content;
	public Diary(int date, String title, String weather, String content) {
		super();
		this.date = date;
		this.title = title;
		this.weather = weather;
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public int getDate() {
		return date;
	}
	public String getTitle() {
		return title;
	}
	public String getWeather() {
		return weather;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	@Override
	public String toString() {
		return "[날짜: " + date + ", 제목: " + title + ", 날씨: " + weather + ", 내용: " + content + "]";
	}
	@Override
	public int compareTo(Diary o) {
		return date - o.date;
	}
}
