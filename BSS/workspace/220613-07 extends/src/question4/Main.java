// page 264
// 4번
// 5번
// 6번
// 7번

// 4번문제
package question4;

public class Main {
	public static void main(String[] args) {
//		Magazine m = new Magazine("이것은 책이다.", 2500, "김 책장인", "발매일 : 2032-06-13");
//		m.printAll();
		
		// 부모 클래스로 생성하기
		// 자동 형변환. Book > Magazine => Up-casting (상향 변환)
		Book book = new Magazine("이것은 책이다.", 2500, "김 책장인", "발매일 : 2032-06-13");
		System.out.println(book.getTitle());
		System.out.println(book.getPage());
		System.out.println(book.getAuthor());
		// 하지만 book은 Book(부모) 클래스라서 Magazine(자식)의 행동은 불가능하다.
		// 책을 참조하면 책의 행동만, 잡지를 참조하면 잡지의 행동까지 가능.
//		System.out.println(book.getReleaseDate());

		// book -> magazine 아래쪽으로 형변화; Down-casting (하향 변환)
		Magazine magazine = (Magazine) book; // 잡지(Magazine)를 참조.
		System.out.println(magazine.getReleaseDate());
		
		System.out.println(book.toString());
		
		Book b = new Book("그냥책", 50, "그냥작가");
		// 모든 책을 잡지로 할 수 없다.
//		Magazine m = (Magazine) b; // 실행중 에러. 문법적으로 상관없음.
		// Down-casting (하향 변환)을 하려면 먼저, instanceof가 필요함.
		// *** instanceof : 왼쪽 참조형 변수 값이 오른쪽 값의 참조인지 아닌지 T/F로 표현 ***
		// 다형성
		if (b instanceof Magazine) {
			Magazine m = (Magazine) b;
		}
		
		
	
		
	}
}
