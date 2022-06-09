import java.util.Scanner;

public class Library {
	private Book[] books;

	public Library() {
	}

	public Library(Book... books) {
		this.books = books;
	}


	public Book inputBook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("책의 정보 - 제목, 저자, 출판사, 장르, 가격 순으로 입력해주세요.");
		String title = scan.nextLine();
		String name = scan.nextLine();
		String publisher = scan.nextLine();
		String genre = scan.nextLine();
		int price = scan.nextInt();

		return new Book(title, name, publisher, genre, price);
	}

	public void Menu() { // 메뉴 불러오는 메소드 제작;
		Scanner scan = new Scanner(System.in);
		Book[] book = new Book[5];
		book[0] = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600);
		book[1] = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
		book[2] = new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);
		book[3] = new Book("코스모스", "칼 세이건", "사이언스북스", "과학 공학", 16650);
		book[4] = new Book("여행의 이유", "김영하", "문학동네", "에세이", 12150);

		boolean run = true;

		while (run) {
		System.out.println();
		System.out.println("   ---------------------------목록 보기---------------------------");
		System.out.println("1. 가격순 정렬 2. 분야별 정렬 3. 상세보기 4. 도서 정보 수정 5. 도서 정보 추가 (0. 프로그램종료)");
		int number = scan.nextInt();
			switch (number) {
			case 1: { // 가격순 정렬
				System.out.println("1. 오름차순 2. 내림차순");
				int x = scan.nextInt();
				if (x == 1) { // 가격 오름차순 정렬
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

				if (x == 2) { // 가격 내림차순 정렬
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
			case 2: { // 분야별 정렬
				System.out.println("1. 제목 2. 저자 3. 출판사 4. 장르 5. 가격");
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
				System.out.println("수정을 원하는 책의 번호를 입력하세요.");
				System.out.printf("1. %s 2. %s 3. %s 4. %s 5. %s\n",
						book[0].getTitle(), book[1].getTitle(), book[2].getTitle(), book[3].getTitle(), book[4].getTitle());
				int bookNum = scan.nextInt();
				System.out.println("원하는 수정 항목을 입력하세요.");
				System.out.println("1. 제목 2. 저자 3. 출판사 4. 장르 5. 가격");
				int num = scan.nextInt();
				if (num == 1) { // 제목 배열값 변경하기 
					System.out.println("변경할 값을 입력하세요.");
					scan.nextLine();
					String title = scan.nextLine();
					book[bookNum - 1].setTitle(title);
					System.out.println("변경한 값 출력 : " + book[bookNum - 1].getTitle());
				} else if (num == 2) {
					System.out.println("변경할 값을 입력하세요.");
					scan.nextLine();
					String name = scan.nextLine();
					book[bookNum - 1].setName(name);
					System.out.println("변경한 값 출력 : " + book[bookNum - 1].getName());
				} else if (num == 3) {
					System.out.println("변경할 값을 입력하세요.");
					scan.nextLine();
					String publisher = scan.nextLine();
					book[bookNum - 1].setPublisher(publisher);
					System.out.println("변경한 값 출력 : " + book[bookNum - 1].getPublisher());
				} else if (num == 4) {
					System.out.println("변경할 값을 입력하세요.");
					scan.nextLine();
					String genre = scan.nextLine();
					book[bookNum - 1].setGenre(genre);
					System.out.println("변경한 값 출력 : " + book[bookNum - 1].getGenre());
				} else if (num == 5) {
					System.out.println("변경할 값을 입력하세요.");
					int price = scan.nextInt();
					book[bookNum - 1].setPrice(price);
					System.out.println("변경한 값 출력 : " + book[bookNum - 1].getPrice());
				}
			}
				break;
			case 5: {
			
			}
				break;
			case 0: {
				System.out.println("프로그램 종료.");
				run = false;
				break;
			}
			default: {
				System.out.println("올바른 값이 아닙니다. 다시 시작하세요.");
			}

			}
		}

	}
}
