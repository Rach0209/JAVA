import java.util.ArrayList;
// ArrayList() 
public class Main {
	public static void main(String[] args) {
//		ArrayList → 배열처럼 여러 개의 자료들을 가지고 있는 객체
		// 객체를 추가시킬 수 있다.
		// ArrayList는 집어 넣을 때마다 크기가 커진다.
		// capacity를 이용해서 배열의 length를 정해 줄 수 있음. 기본적으로 8정도 설정되어있음. ArrayList('capacity');
		// 사이즈는 미리 정하지 않고, 동적으로 늘어날 수 있게 해준다.
		ArrayList list = new ArrayList();
		list.add("문자열 객체"); // 문자열 객체를 넣으면 인덱스 번호가 증가한다. 
		list.add(new Object());
		// 기본형 타입의 값을 집어 넣을 수 없다.
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		
		list.add(500); // auto-boxing이 일어나서, Integer라는 객체로 변환
		// 500 이라는 int 값이 integer instance라는 객체로 참조.
		list.add(123.123);
		
//		int size = list.size();
//		System.out.println(size);
		
		// 동적으로 삽입 순서에 따라서 index번호 부여
		// index를 사용해서 원하는 원소 값을 가져 올 수 있다.
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
		
		// 반복문 사용하여 모든 리스트 객체 나타내기.
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		for (int i = list.size() - 1; i >= 0; i--) {
//			System.out.println(list.get(i));
//		}
		
		// for-each 문도 사용가능하다.
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
