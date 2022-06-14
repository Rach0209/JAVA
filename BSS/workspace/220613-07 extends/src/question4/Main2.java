package question4;

public class Main2 {
	public static void main(String[] args) {
		Novel novel = new Novel("소설책", 100, "소설작가", 10);
		Magazine magazine = new Magazine("잡지", 90, "잡지작가", "2022-06-01");
		
		// 소설에 대한 참조
		Book book = novel;
		novel.getRating();
//		book.getRating(); 같은 참조조이지만 불가능. 책이라는 것에는 점수를 알려준다는 행동이 없음.
		
		// 책을 원래의 형태로 돌리려 함 // 좁은 범위로 내려가기 때문에 형을 적어줘야함.
//		Novel otherRef = (Novel) book; 
//		System.out.println(otherRef.getRating());
		
		// 실행중 에러
//		Magazine otherRef = (Magazine) book;
//		otherRef.getReleaseDate();
		
		// instanceof 사용해서 실행중 에러 없애고, 다운캐스팅 수행하기.
		if (book instanceof Magazine) {
			Magazine otherRef = (Magazine) book;
			otherRef.getReleaseDate();
		} else if (book instanceof Novel) {
			Novel nnn = (Novel) book;
			nnn.getRating();
		}
	}
}