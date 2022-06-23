package teacherdiary;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

// 콘솔 입출력용 클래스
public class ConsolePresenter {
	private DiaryManage manager;

	// ***** List를 들고있는 DiaryManageImpl을 필드로 만들고 초기화 *****
	public ConsolePresenter() {
		manager = new DiaryManageImpl();
	}

	public void start() {
		while (true) {
			menu();
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();

			switch (number) {
			case 1:
				add();
				break;
			case 2:
				list();
				break;
			case 3:
				edit();
				break;
			case 4:
				delete();
				break;
			default:
				System.out.println("없는 메뉴");
			}
		}
	}

	public void menu() {
		System.out.println("메뉴");
		System.out.println("1번. 추가, 2번. 목록, 3번. 수정, 4번. 삭제(오래된 것)");
	}

	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜? yyyy-MM-dd 예) 2022-06-21");
		String date = scan.nextLine();
		System.out.println("제목?");
		String title = scan.nextLine();
		System.out.println("날씨?");
		String weather = scan.nextLine();
		System.out.println("내용?");
		String content = scan.nextLine();
		// 다루고자 하는 타입으로 변환
		LocalDate day = LocalDate.parse(date);
		// 관리자에게 추가해달라해서 리스트에 추가
		manager.add(new Diary(day, title, weather, content));
	}

	public void list() {
		System.out.println("-일기 목록-");
		List<Diary> list = manager.list();
		for (Diary d : list) {
			System.out.println(d);
		}
	}

	public void edit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 날짜?");
		String date = scan.nextLine();
		LocalDate day = LocalDate.parse(date);

		System.out.println("내용?");
		String content = scan.nextLine();

		manager.edit(day, content);
	}

	public void delete() {
		manager.deleteFirst();
		System.out.println("삭제 되었습니다.");
	}
}
