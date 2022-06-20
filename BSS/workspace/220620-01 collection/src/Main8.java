import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		// 합, 평균
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = list.get(i);
			sum += sum;
		}
		System.out.println("합: " + sum);
		int average = sum / list.size();
		System.out.println("평균: " + average);

		// 정수 57이 리스트에 있는지? 있으면 몇 번째 index에 위치하는지?
		System.out.println(list.contains(57));
		System.out.println(list.indexOf(57));
		// iterator 사용		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int iter = iterator.next();
			if (iter == 57) {
				System.out.println("index번호: " + list.indexOf(iter));
			}
		}
		// 정수 23의 개수
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 23) {
				count++;
			}
		}
		System.out.println("23의 개수: " + count);
		
		// 중복되는 원소 23을 '하나' 삭제하기
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			int value = iter.next();
			if (value == 23) {
				iter.remove();
				break;
			}
		}
		System.out.println("iterator사용해서 '23'하나 지우기: " + list);
		
		// indexOf();써서 지우기~
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		// 오른쪽부터 찾기 lastIndexOf(); 왼쪽부터 찾기 IndexOf();
		// 오른쪽 23 지우기.
		int index = list2.lastIndexOf(23); // auto-boxing되어서 밑에처럼 해주지 않아도 됨.=> lastIndexOf(Object o)자체가 객체의 형태를 가짐
		list2.remove(index);
		System.out.println("오른쪽 23지우기: " + list2);
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		list3.remove(Integer.valueOf(23)); // List는 Integer값을 들고 있기 때문에, Integer.valueOf()를 사용해준다.
		// 객체의 형태로 변형시켜서 지우기~
		System.out.println("remove사용해서 바로 지우기(왼쪽부터해서 처음꺼): " + list3);
	}

}
