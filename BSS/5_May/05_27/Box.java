// 모든 현실의 객체(object) -> 객체로 보는 시선에서 시작.
// 물건, 아이디어, 세상의 모든 것.

// 상태와 동작으로 나타낼 수 있다.
// 값/상태 => 변수
// 동작 => 메소드

// 객체 -> 코드
// 코드 -> 객체로
// 객체들간에 메시지를 주고 받으며 프로그램의 흐름을 만들어 내는 방식

// 객체 지향 프로그래밍 // 이전까지는 절차적 프로그래밍
// 확장과 수정 용이

// TestBox.java에서 현재 Box.class를 불러와서 사용
public class Box {
	// 값 / 상태 -> 멤버변수 (member variable) / 필드 (fields)
	int length;
	int width;
	int height;
	int volume = length * width * height; // TestBox에서 출력값 0
	// 메소드 -> 기능 or 동작 === 이름을 만들 수 있다.
	public void printAllState() {
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
	}
	
	// 박스는 자기자신의 부피를 구해서 정수형 값으로 알려줄 수 있음. (반환)
	
	public int getVolume() {
		return width * length * height;
	}
	
}