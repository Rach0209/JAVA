import java.util.Scanner;

public class Library {
	private Book[] books;

	public Library() {
	}

	public Library(Book... books) {
		this.books = books;
	}
	
	public void Menu() {
		Scanner scan = new Scanner(System.in);
		Book[] book = new Book[5];
		book[0] = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600);
		book[1] = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
		book[2] = new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);
		book[3] = new Book("코스모스", "칼 세이건", "사이언스북스", "과학 공학", 16650);
		book[4] = new Book("여행의 이유", "김영하", "문학동네", "에세이", 12150);

		System.out.println("목록 보기");
		System.out.println("1. 가격순 정렬 2. 분야별 정렬 3. 상세보기 4. 도서 정보 수정 5. 도서 정보 추가");
		int number = scan.nextInt();

		switch (number) {
		case 1: {
			System.out.println("1. 오름차순 2. 내림차순");
			int x = scan.nextInt();
			if (x == 1) {
				for (int i = 0; i < book.length - 1; i++) {
					for (int j = 0; j < book.length - 1; j++) {
						if (book[j].getPrice() > book[j + 1].getPrice()) {
							Book a = book[j];
							book[j] = book[j + 1];
							book[j + 1] = a;
						} else if (book[j].getPrice() == book[j + 1].getPrice()) {
							if (book[j].getPublisher().length() > book[j].getPublisher().length()) {
								Book a = book[j];
								book[j] = book[j + 1];
								book[j + 1] = a;
							}
						}
					}
				}
				for (int i = 0; i < book.length; i++) {
					book[i].printAllInfo();
				}
			}

			if (x == 2) {
				for (int i = 0; i < book.length; i++) {
					for (int j = 0; j < book.length - 1; j++) {
						if (book[j].getPrice() < book[j + 1].getPrice()) {
							Book a = book[j];
							book[j] = book[j + 1];
							book[j + 1] = a;
						} else if (book[j].getPrice() == book[j + 1].getPrice()) {
							if (book[j].getPublisher().length() < book[j].getPublisher().length()) {
								Book a = book[j];
								book[j] = book[j + 1];
								book[j + 1] = a;
							}
						}
					}
				}
				for (int i = 0; i < book.length; i++) {
					book[i].printAllInfo();
				}
			}
		}
			break;
		case 2: {
			System.out.println("1. 제목 2. 저자 3. 출판사 4. 장르 5. 가격"); // 분야 정렬
			int num = scan.nextInt();
			if (num == 1) {
				for (int i = 0; i < book.length; i++) {
					System.out.println(book[i].getTitle());
				}
			}
			if (num == 2) {
				for (int i = 0; i < book.length; i++) {
					System.out.println(book[i].getName());
				}
			}
			if (num == 3) {
				for (int i = 0; i < book.length; i++) {
					System.out.println(book[i].getPublisher());
				}
			}
			if (num == 4) {
				for (int i = 0; i < book.length; i++) {
					System.out.println(book[i].getGenre());
				}
			}
			if (num == 5) {
				for (int i = 0; i < book.length; i++) {
					System.out.println(book[i].getPrice());
				}
			}
		}
			break;

		case 3: {
			for (int i = 0; i < 5; i++) {
				book[i].printAllInfo();
			}
		}
			break;

		case 4: {

		}
			break;
		case 5: {
	
		}
			break;
		default: {
			System.out.println("올바른 값이 아닙니다. 다시 시작하세요.");
		}

		}

	}
}
