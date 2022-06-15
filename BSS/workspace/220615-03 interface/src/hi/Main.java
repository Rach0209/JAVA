package hi;
public class Main {
	public static void main(String[] args) {
		// 한국학생 생성자
		IKorean k = new IKorean("안녕충", 17);
		// 오버라이드한 추상메소드 호출
		k.sayHi();
		System.out.println(k.toString());
		System.out.println();
		
		// 영국학생 생성자
		IBritish b = new IBritish("HelloMan", 15);
		// 오버라이드한 추상메소드 호출
		b.sayHi();
		System.out.println(b.toString());
		System.out.println();
		
		// 미국인 생성자
		American usa = new American();
		// 오버라이드한 추상메소드 호출
		usa.sayHi();
		
		// 각각 타입을 하나의 배열로 사용
		// 모두 upcasting이 일어남
		// 객체(Object)가 아닌 인터페이스에 배열로 담기
		IGreeting[] arr = new IGreeting[3];
		// 인터페이스는 참조는 가능하지만 생성은 불가능하다.(new ~~~ () 불가능);
		arr[0] = k;
		arr[1] = b;
		arr[2] = usa;
		
		for (int i = 0; i < arr.length; i++) {
//			Object[] arr = new Object[3]; // 오브젝트로 배열만들었을 때	
//			arr[i].sayHi(); // Object이기 때문에 인사 행동을 할 수 없음.
			arr[i].sayHi(); // 인터페이스 배열에 담으면 인사 행동 가능.
		}
	}

}
