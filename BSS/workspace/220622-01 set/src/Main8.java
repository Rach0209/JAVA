import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
	private String title;
	private int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	// ***************** 각 객체마다 가지고 있는 고유한 숫자값 = Hash ********************
	// 동등한 객체끼리는 같은 숫자값이 될 수 있도록 만들어 준다.
	// 해시코드 설정 해주기.
	// 해시값 만들어 주는 것 => 해시 함수(hash function)
	@Override
	public int hashCode() {
//		return 987; // 모든 책들의 hash값을 987로 재정의.
		return Objects.hash(title, price); // fields를 넣어주면, 알아서 hashcode를 만들어줌.
		// 두 필드 값이 같은 객체면, 같은 hashcode 생성.
		// Java 1.7버전 부터 사용 가능
	    // 이클립스 자동완성으로 해쉬코드만들기 가능
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	// 제목으로 비교하는 compareTo생성.
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	
}
// ***************** 각 객체마다 가지고 있는 고유한 숫자값 = Hash ********************
// 동등한 객체끼리는 같은 숫자값이 될 수 있도록 만들어 준다.
public class Main8 {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000);
		Book b2 = new Book("책1", 5000);
		Book b3 = new Book("책2", 7000);
		Book b4 = new Book("책3", 4000);
		
		Set<Book> tree = new TreeSet<>();
		// 대소비교를 할 수 없어서, 에러발생. => 비교 기준 생성 -제목
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		tree.add(b4);
		System.out.println("제목순 정렬 : 비교 기준 생성, Comparable - override 필수");
		System.out.println(tree);

		// 가격순 정렬
		// 익명클래스 생성 
		Comparator<Book> com = new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		// TreeSet의 생성자에 비교기준 넣기.
		Set<Book> treeByPrice = new TreeSet<>(com);
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		treeByPrice.add(b4);
		System.out.println("가격순 정렬 : Comparator 익명클래스 사용");
		System.out.println(treeByPrice);
		// set은 순서 상관없음. 특징 : 집합이다. 원소 크기와 갯수만 같으면 됨.
		System.out.println("두 개의 set은 동등한가요? " + tree.equals(treeByPrice));
		
//		// b1책과 b2,b3책 동등함 비교
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//		
//		// 1차적으로 hash를 검사 => hash값이 같으면 => 2차 equals검사
//		Set<Book> set = new HashSet<>();
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		
//		System.out.println(set.size());
//		System.out.println(set);
	}
}
