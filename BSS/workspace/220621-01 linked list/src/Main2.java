import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		// LinkedList는 추가 삭제가 많을 때 사용하면 좋음.
		// ArrayList는 모든 원소를 순환할 때, 모든 원소에 빨리 접근할 때 용이.
		List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
		
		list.remove(0);
		
		list.remove("C");
		
		System.out.println(list);
		// 추가와 삭제가 빈번해서, 첫번째원소, 마지막원소의 추가와 제거 메소드가 추가되어있음
		LinkedList<String> down = (LinkedList<String>) list;
		down.addFirst("asdf");
		// Queue => 선입선출
		down.removeFirst();
		
		System.out.println(down.getFirst());
		System.out.println(down);
	}

}
