// 삼각형
// 중심점(x, y)
// 밑변
// 높이

// 넓이를 구해서 알려줄 수 있음.

// 직사각형
// 중심점(x, y)
// 가로
// 세로

// 넓이를 구해서 알려줄 수 있음.

// 원
// 중심점(x, y)
// 반지름

// 넓이를 구해서 알려줄 수 있음.

// 겹치는 부분  => 중심점(x, y) , 넓이 구해서 알려주기.
// >>> 상속 시키기.
public class Main {
	public static void main(String[] args) {
		// 추상 클래스는 인스턴스화 시킬 수 없다.
		// 구체적 동작이 없기 때문.
//		Shape s1 = new Shape();
//		Shape s2 = new Shape(10, 20);
		
		Triangle t = new Triangle(0, 0, 5, 5);
		System.out.println(t.getArea());
		
		// * 추상클래스가 하나의 type으로 사용됨 *
		// 삼각형을 도형의 형태로 사용
		// up-casting 해서 출력하기.
		// 자식 클래스의 메소드 호출하여 넓이 구하기
		Shape s = t;
		System.out.println(s.getArea());
		
		Rectangle r = new Rectangle(0, 0, 5, 5);
		Shape r1 = new Rectangle(0, 0, 10, 10);
		System.out.println("사각형 " + r.getArea());
		System.out.println("도형형태 " + r1.getArea());
		
		Circle c = new Circle(0, 0, 5);
		Shape c1 = new Circle(0, 0, 5);
		System.out.println("원 " + c.getArea());
		System.out.println("도형형태 " + c1.getArea());
	}
}
