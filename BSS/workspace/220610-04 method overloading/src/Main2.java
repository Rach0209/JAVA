import java.util.Scanner;

class Can {
	private String name;

	public Can(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

class VendingMachine { // 상수 활용
	public static final int COLA = 1; // static이 사라지면, 인스턴스의 참조로 접근해야한다.
	public static final int FANTA = 3;
	public static final int SPRITE = 2;
	
	public Can makeCan(int choice) {
		if (choice == COLA) {
			return new Can("콜라");
		} else if (choice == SPRITE) {
			return new Can("사이다");
		} else { // 나머지는 모두 환타
			return new Can("환타");
		}
//		return null; // null 반환 받으면 null에 대응할 것만 만들면 됨.
	}
	// 문자열을 받는 오버로딩 메소드.
	public Can makeCan(String choice) {
		if (choice.equals("Cola")) {
			return new Can("콜라");
		} else if (choice.equals("Sprite")) {
			return new Can("사이다");
		} else { // 나머지는 모두 환타
			return new Can("환타");
		}
	}
}

public class Main2 {

	// 자판기 메소드
	// 정수형 -> 반환Type : Can
	// 1 입력 -> field "콜라"
	// 2 -> field "사이다" ...

	// 문자열 -> 반환Type : Can
	// "Cola" -> field "콜라" ...

	public static void main(String[] args) {
		VendingMachine m = new VendingMachine();
		Can can1 = m.makeCan(VendingMachine.COLA); // static하게 만들어야 클래스 이름으로 접근 가능.
//		m.makeCan(m.COLA); 상수에 static 없을 때. 필드 처럼 // 인스턴스의 참조로 
		
		Can can2 = m.makeCan("Cola");
		
		System.out.println(can1);
		System.out.println(can2.toString());
		
		
	}
}
