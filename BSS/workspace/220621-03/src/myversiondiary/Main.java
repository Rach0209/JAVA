package myversiondiary;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 일기 관리 프로그램
// 일기 (날짜, 제목, 날씨, 내용 등등)

// 일기 등록
// 같은 일자에는 일기가 1개만 존재 (중복 X)

// 일기 목록도 볼 수 있음
// 날짜 순
// 내용 길이 순

// 날짜를 선택해서 해당 일기 내용을 수정 가능

// 삭제 - 가장 오래된 일기가 삭제됨.

public class Main {
	public static void main(String[] args) {
		Diary d1 = new Diary(220618, "일기1", "맑음", "따스한 햇살에 잠이 온다");
		Diary d2 = new Diary(220622, "일기3", "흐림", "날이 흐려서 잠이 온다");
		Diary d3 = new Diary(220620, "일기2", "비", "비내리는 소리.... 잠이 온다");

		List<Diary> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("=========My Diary Program=======");
			System.out.println("|1.일기 목록열기 2.일기 적기 3.일기 내용 수정|");
			System.out.println("|4.일기 정렬하기 5.오래된 일기 삭제                |");
			System.out.println("|6.일기 선택삭제                                0.종료  |");
			System.out.println("================================");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				System.out.println("-----------------일기장 목록------------------");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				System.out.println();
				continue;
			}
			case 2: {
				System.out.println("---------------일기장---------------");
				System.out.println("날짜 입력 (형식:yymmdd)");
				int date = scan.nextInt();
				scan.nextLine();
				int savedDate = 0;
				for (int i = 0; i < list.size(); i++) {
					savedDate = list.get(i).getDate();
					if (date != savedDate) {
						System.out.println("제목 입력");
						String title = scan.nextLine();
						System.out.println("날씨 입력");
						String weather = scan.nextLine();
						System.out.println("--------------일기 내용---------------");
						String content = scan.nextLine();
						list.add(new Diary(date, title, weather, content));
						break;
					} else {
						System.out.println("해당 날짜엔 일기가 이미 작성되어있슴둥");
						break;
					}
				}
				continue;
			}
			case 3: {
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + "번: " + list.get(i).getDate());
				}
				System.out.println("수정할 날짜의 일기를 선택하세요");
				int choose = scan.nextInt();
				scan.nextLine();
				System.out.println("----수정할 내용 입력----");
				String content = scan.nextLine();
				list.get(choose - 1).setContent(content);
				continue;
			}
			case 4: {
				System.out.println("1. 날짜 순 2. 내용길이 순 (둘다 오름차순입니다) 3. 나가기");
				int choice = scan.nextInt();
				Comparator<Diary> orderedContent = new Comparator<Diary>() {
					@Override
					public int compare(Diary o1, Diary o2) {
						return o1.getContent().length() - o2.getContent().length();
					}
				};
				switch (choice) {
				case 1: {
					System.out.println("날짜 오름차순");
					Collections.sort(list);
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
					System.out.println();
					continue;
				}
				case 2: {
					System.out.println("내용길이 오름차순");
					Collections.sort(list, orderedContent);
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
					System.out.println();
					continue;
				}
				case 3:
					System.out.println();
					continue;
				}
				break;
			}
			case 5: {
				scan.nextLine();
				System.out.println("정말 오래된일기를 삭제 하시겠어요? Y/N 입력");
				String choice = scan.nextLine();
				if (choice.equals("Y") || choice.equals("y")) {
					list.remove(0);
					System.out.println("오래된 일기 삭제완료");
				} else if (choice.equals("N") || choice.equals("n")) {
					System.out.println("삭제 취소");
				} else {
					System.out.println("잘못 입력했어요");
				}
				continue;
			}
			case 6: {
				System.out.println("삭제를 원하는 일기를 선택하세요");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(
							(i + 1) + "번 일기: " + "날짜: " + list.get(i).getDate() + " 제목: " + list.get(i).getTitle());
				}
				int choice = scan.nextInt();
				list.remove(choice - 1);
				System.out.println("삭제 완료");
				scan.nextLine();
				continue;
			}
			case 0: {
				System.out.println("종 료");
				return;
			}
			default: {
				System.out.println("잘못된 입력이에오");
				continue;
			}
			}
			break;
		}
	}
}
