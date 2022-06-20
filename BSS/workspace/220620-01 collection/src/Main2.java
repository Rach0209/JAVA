import java.util.ArrayList;
// <> generic 제네릭
public class Main2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); // Integer만 집어넣고 쓰겠다!!
		// 객체이기 때문에 int로 사용할 수 없다.
		list.add(10); // Double 로 사용하고 싶으면, 원시형 더블 타입 10.0 으로 변환해주면 가능하다.
		list.add(20);
		list.add(30);
		list.add(40);
	
//		list.add("asdf"); // 불가능.
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i); // 객체를 참조하기 때문에 에러; => <Integer> 제네릭을 사용해서 해결가능.
								// int 형만 넣을 것이기 때문에 연산이 가능해진다.
		}
		System.out.println(sum);
	}
}
