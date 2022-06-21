import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; // interface에 정의 되어 있는 List
// List는 인터페이스라서 행동으로 정의되어 있다. / 원소를 추가할 수 있다 -> index를 가지고 있다.
// ArrayList 는 구현체. 좀 더 구체적 형태로 사용하기에 복잡하다.
// List가 추상체로 사용할 수 있어서 더 편함.
public class Main3 {
	public static void main(String[] args) {
		// 왼쪽 선언 할 때 제네릭 타입을 적으면 우측은 <>만 적어도 사용가능.
		// List는 추상적인 행동을 모두 정의해 놓음.(interface)
		List<Integer> list = new ArrayList<>();
		// 위의 리스트에 10, 20, 30, 40
		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		// 모든 원소들을 출력해보세요.
		System.out.println(list.toString()); // List역시 Object클래스를 상속하기 때문에 toString존재.
		
		// 원소 변경하기
		list.set(1, 15); // left : index번호 / right : 참조, 바꾸자 하는 값
		System.out.println(list);
		// 찾고자 하는 값의 형태 물어보기. 
		// 원소의 포함 여부를 boolean으로 확인 contains();
		// indexOf(); 인덱스값 있는지 물어보기 있으면 => index번호; 없으면 -1
		// indexOf()는 equals로 같은값을 찾는다.
		System.out.println(list.contains(20));
		System.out.println(list.indexOf(20));
		System.out.println(list.contains(30)); // 있으면 true
		System.out.println(list.indexOf(30)); // 있으면 인덱스 번호.
		
		// 인덱스 번호값의 원소 제거하기. ()안에 해당 원소 index값을 넣어준다.
		list.remove(2);
		System.out.println(list); // List의 사이즈가 줄어듬 = index값 줄어듬.
		// 지워진 값의 우측에 있는 원소들이 왼쪽으로 한칸씩 땡겨온다.
		// 결국 우측 원소들의 index가 하나씩 줄어듬~
		
		// 원소값 삽입하기
		// index번호, 원소값
		list.add(0, 0); // 0번째 index에 0을 집어넣기.
		System.out.println(list); // 집어넣은 원소 기준으로 오른쪽 원소 값들의 index 번호는 하나씩 증가하게됨.
		
		// list의 원소들을 모두 없애버리기.
		list.clear();
		// empty로 만들어줌~ isEmpty()로 t/f 판별가능
		
		// 반복문 사용시 = '지워질때마다' index가 변경되어서, 말끔히 지워지지 않음
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
		
		// 이렇게하면 가능한듯?
//		for (int i = list.size() - 1; i >= 0; i--) {
//			list.remove(i);
//		}
		
		// 모든 원소 지우기 - Iterator 사용
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			iter.next();
			iter.remove();
		}
		
		System.out.println("지운 결과 : " + list);
		System.out.println(list.size() == 0);
		// 리스트가 지워졌는지 확인하는 메소드. isEmpty();
		System.out.println(list.isEmpty());
		
		
		
		
//		// add로 집어넣기.
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		
//		// index로 원소값 가져오기.
//		list.get(0);
//		list.get(1);
//		list.get(2);
//		list.get(3);
	}

}
