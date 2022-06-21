import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박"));

		// 콘솔 입출력
		// 과일 목록 보여주기
		// 과일 주기(제일 앞에거부터 줌)
		// 재고 과일 추가하기(제일 마지막에 추가) - 진열대가 최대 10개

		// 과일 목록
//		System.out.println(list);
//
//		// 과일 주기(제일 앞부터)
//		Iterator<String> iter = list.iterator();
//
//		while (iter.hasNext()) {
//			String str = iter.next();
//			iter.remove();
//			System.out.println(list);
//		}
//
//		// 재고 과일 추가하기(제일 마지막에 추가) 최대 10개
//		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < 10; i++) {
//			System.out.println("추가할 과일 입력");
//			String fruit = scan.nextLine();
//			list.add(fruit);
//			System.out.println(list);
//		}

		// 위의 기능 이용한 과일 관리 프로그램
		Scanner scanner = new Scanner(System.in);
		int input;
		while (true) {
			System.out.println("1. 목록 보기 2. 과일주기(목록 앞에서부터 분배) 3. 과일넣기(목록 뒤부터 추가) 0. 종료");
			input = scanner.nextInt();
			switch (input) {
			case 1: {
				System.out.println("재고 목록: " + list + " " + list.size() + "개 있음");
				break;
			}
			case 2: {
				Iterator<String> iter1 = list.iterator();
				System.out.println("몇개 줄거임?");
				System.out.println("현재 과일 재고 목록: " + list + " " + list.size() + "개 있음");
				try {
					int howmany = scanner.nextInt();
					for (int i = 0; i < howmany; i++) {
						iter1.hasNext();
						String str = iter1.next();
						iter1.remove();
					}
				} catch (InputMismatchException e1) {
					System.out.println("숫자만 입력하십쇼; 프로그램 꺼지잖음");
				} catch (NoSuchElementException e2) {
					System.out.println("가지고 있는 것보다 많이 줄 순 없어요 일단 있는건 다주겠음");
				} finally {
					System.out.println("주고 난 후 과일 재고 목록: " + list + " " + list.size() + "개 남음");
				}
			}
				break;
			case 3: {
				scanner.nextLine();
				int count = 10 - list.size();
				try {
				System.out.println("몇개의 과일을 추가 할건가용?");
				System.out.println("지금 " + count + "개 자리 남음");
				int addfruit = scanner.nextInt();
				scanner.nextLine();
				for (int i = 0; i < addfruit; i++) {
					System.out.println("추가할 과일 입력");
					String fruit = scanner.nextLine();
					list.add(fruit);
					System.out.println(list + " " + "현재" + list.size() + "개");
				}
				} catch (InputMismatchException e1) {
					System.out.println("숫자만 입력하십쇼; 프로그램 꺼지잖음");
				}
				break;
			}
			case 0: {
				System.out.println("프로그램 종료");
				return;
			}
			default: {
				System.out.println("잘못된 입력");
				return;
			}
			}
		}
	}
}
