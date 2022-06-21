import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// Queue
public class Main3 {
	public static void main(String[] args) {
		// LinkedList는 List의 구현체 이면서 Queue의 특징을 구현한 구현체이다.
		// Queue = 선입선출을 할때 주로 사용; 집어넣고, 제일 앞에 원소 가져올때.
		// Queue가 인터페이스화 되어 있어서, Queue의 동작만 가져올 수 있다.
		Queue<String> queue = new LinkedList<>();
		
		// 똑같은 행동.
		List<String> list = new LinkedList<>();
		list.add("ㅁㄴㅇㄹ");
		list.remove(0);
		
		// 추상적 행동 몇가지 추가
		queue.add("원소1");
		// queue에만 있는 추상 메소드.
		queue.offer("원소2");
		
		System.out.println(queue);
		// 원소 제일 앞에 있는 원소가 반환됨. poll, remove;
		// poll() => 원소가 없으면 null 반환
		// remove() => 원소가 없으면 예외 발생
		String elem1 = queue.poll();
		String elem2 = queue.remove();
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());
	}

}
