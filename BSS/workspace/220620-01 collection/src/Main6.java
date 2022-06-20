import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// 리스트 정렬과 검색 등 
public class Main6 {
	public static void main(String[] args) {
		// 리스트 정렬하기 오름차순
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));

		// Collections 클래스
		// 오름차순 정렬해줌.
		Collections.sort(list);
		System.out.println(list);

		// 2진 검색으로 index번호를 찾아준다.
		int index = Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스: " + index);
		
		// 순서를 역순으로
		Collections.reverse(list);
		System.out.println(list);
		
		// 순서를 랜덤하게 섞기.
		Collections.shuffle(list);
		System.out.println(list);
		
		// 최대, 최솟값
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		// 전체 원소값을 하나의 값으로 바꾸는 메소드.
		Collections.fill(list, 33);
		System.out.println(list);
		
		// 특정한 원소만 찾아서 모두 바꾸는 메소드.
		Collections.replaceAll(list, 33, 77);
		System.out.println(list);
		
//		list.clear(); // 밑에 target은 길이가 3.
		// 최소 길이가 3칸은 있어야 복사가 가능하다. 그렇지 않으면 에러.
		
		// 복사해서 list에 집어넣기. << 앞에서 부터 원소를 덮어 씌워준다.
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		Collections.copy(list, target);
		System.out.println(list);
		
	}

}
