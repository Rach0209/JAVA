import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// List 편하게 쓰기.
public class Main5 {
	public static void main(String[] args) {
		// 생성자에 다른 리스트를 넣으면, 해당하는 리스트를 그대로 가지는 리스트 생성가능.
//		List<Integer> tens = new ArrayList<>();
//		tens.add(10);
//		tens.add(20);
//		tens.add(30);
//		tens.add(40);
//		List<Integer> list = new ArrayList(tens);
//		System.out.println(list);
		
		// asList를 사용
		// 원소의 추가 및 삭제, 변경 가능
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(list);
		
		// Arrays.asList()로 만든 list는 원소 추가나 삭제가 불가능하다.
//		List<Integer> test = Arrays.asList(10, 20, 30, 40, 50);
////		test.add(60); // 추가 및 삭제 , 변경 불가능
//		System.out.println(test);
		
		// 모든 원소들을 추가해준다. addAll();
		list.addAll(Arrays.asList(60, 70, 80));
		System.out.println(list);
		
		// 같은 값의 원소 지우기.
		list.removeAll(Arrays.asList(30, 40, 50));
		System.out.println(list);
		
		// 원소가 모두 존재하는가 물어보는 containsAll(); >> boolean값
		System.out.println(list.containsAll(Arrays.asList(10, 20)));
		
		// 해당 인덱스번호에 포함되어 있는 원소들을 가지고 있는 *새로운* 리스트를 생성한다.
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);
		System.out.println(list);
	}

}
