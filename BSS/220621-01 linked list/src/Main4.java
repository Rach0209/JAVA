import java.util.Deque;
import java.util.LinkedList;
// Queue / Deque(Stack)은 통로가 하나.
// Stack / 후입선출
// Deque로 사용

// 하나의 목적을 가진 하위 리스트(Queue, Deque 등)로 사용하는게 편리하다. 
// LinkedList로 사용하면 추가하는 메소드만해도 5개이상이 생김.
public class Main4 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();
		// 원소 넣기 => push();
		stack.push("10");
		stack.push("20");
		stack.push("30");
		// 원소 빼기 => pop();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
