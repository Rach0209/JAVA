import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main9 {
	// 아스키로 접근하기 메소드.
	public static boolean isNumberChar(char c) {
		return c >= '0' && c <= '9';
	}
	
	public static boolean isNumberStr(String s) {
		for (int i = 0; i < s.length(); i++) {
			// 하나라도 숫자가 아니면 false
			if (!isNumberChar(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));

		// 위의 리스트에서
		// 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성
		// 빈리스트 생성후 출력 버전
		List<String> fiveLengthlist = new ArrayList<>();
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			if (str.length() == 5) {
				fiveLengthlist.add(str);
			}
		}
		System.out.println(fiveLengthlist);
		// 복사 한 리스트에서 삭제버전
		List<String> copy = new ArrayList<>(list);
		Iterator<String> iterator = copy.iterator();
		while (iterator.hasNext()) {
			String str1 = iterator.next();
			if (str1.length() != 5) {
				iterator.remove();
			}
		}
		System.out.println("복사해서 지운 버전: " + copy);

		// 문자열 중에 'e' 문자를 포함하는 문자열만을 원소로 가지는 리스트 생성
		List<String> includeE = new ArrayList<>();
		Iterator<String> iter2 = list.iterator();
		while (iter2.hasNext()) {
			String e = iter2.next();
			if (e.contains("e")) {
				includeE.add(e);
			}
		}
		System.out.println(includeE);
		//
		List<String> empty = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.contains("e")) {
				empty.add(str);
			}
		}
		System.out.println("while 대신 for 문: " + empty);

		// ***************************************************************************
		List<String> list2 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나", "1000", "1a0b"));

		// 위의 2번 리스트에서 '정수 형태의 값'을 가지는 문자열을 찾아
		// 해당 원소를 가지는 정수형 리스트 생성
		// 베스트는 아스키코드로 접근
		// ******************아스키 코드 접근********************
		List<Integer> listInteger = new ArrayList<>();
		for (int i = 0; i < list2.size(); i++) {
			String str = list2.get(i); // 문자열 하나하나를 쪼개서 검사
			
			if (isNumberStr(str)) {
				listInteger.add(Integer.valueOf(str));
			}
		}
		System.out.println("아스키 코드로 접근: " + listInteger);
		
		// 쌤
//		List<Integer> listInteger = new ArrayList<>();
//		for (int i = 0; i < list2.size(); i++) {
//			String str = list2.get(i);
//			try {
//				Integer value = Integer.valueOf(str);
//				listInteger.add(value);
//			} catch (NumberFormatException e) {
//				System.out.println("문자열을 정수형으로 변환하는데 실패하여 예외가 발생했으나 정상흐름으로 돌아가기를 원해 예외처리");
//			}
//		}
//		System.out.println(listInteger);
		
		// 예외처리 메소드 사용
		List<String> intList = new ArrayList<>();
		for (int i = 0; i < list2.size(); i++) {
			if (isInt(list2.get(i))) {
				intList.add((list2.get(i)));
			}
		}
		System.out.println("정수 형태의 값을 가진 문자열: " + intList);

		List<Integer> changeInteger = new ArrayList<>();
		for (int i = 0; i < intList.size(); i++) {
			changeInteger.add(Integer.parseInt(intList.get(i)));
		}
		System.out.println("Integer형 List로 변환: " + changeInteger);
		// '정수 형태의 값'을 가지는 문자열을 -> Integer 형으로
//		Integer i = Integer.valueOf("1234"); // => 1234 Integer 반환
//		Integer exp = Integer.valueOf("숫자아니면?"); // => NumberFormatException 예외 발생
	}
	// 예외처리 메소드 제작
	public static boolean isInt(String string) {
		try {
			int num = Integer.valueOf(string);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
