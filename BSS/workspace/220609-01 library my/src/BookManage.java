import java.util.Scanner;

public class BookManage {
	private Library library;

	
	
//	public Book inputBook() { // 배열로 처음부터 입력하는 메소드; 
//	Scanner scan = new Scanner(System.in);
//	System.out.println("책의 정보 - 제목, 저자, 출판사, 장르, 가격 순으로 입력해주세요.");
//	String title = scan.nextLine();
//	String name = scan.nextLine();
//	String publisher = scan.nextLine();
//	String genre = scan.nextLine();
//	int price = scan.nextInt();
//	
//	return new Book(title, name, publisher, genre, price);
//}

	public void start() {
//		Scanner scan = new Scanner(System.in);
		Library m = new Library();
		m.Menu();

		// 배열로 받기; 책 권수도 결정 가능. 책 0권일때만 가능;
//		Book book1 = inputBook(); 
//		Book book2 = inputBook();
//		Book book3 = inputBook();
//		Book book4 = inputBook();
//		Book book5 = inputBook();
//		System.out.println("책 몇권을 등록 하시겠습니까?");
//		int n = scan.nextInt();
//	
//		Book book[] = new Book[n];
//		for (int i = 0; i < n; i++) {
//			book[i] = inputBook();
//		}
	}

}
