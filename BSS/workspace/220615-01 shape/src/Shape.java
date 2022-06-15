// 도형 클래스
// x좌표
// y좌표

// 넓이 구할 수 있음. => 도형은 너무 추상적 => 동작 정의 불가.

// 공통점을 표현 하기 위한 추상 클래스

// *********** 추상 클래스 *************
// 추상 메소드가 존재하기 때문에 클래스도 추상화
public abstract class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// ****************** 추상 메소드 (abstract method) *****************
	// * 추상 메소드는 일반적인 클래스에는 존재 할 수 없다.!!!
	// 추상적인 동작을 가지고 있기에, 메소드의 구현이 없어서 미완성 객체가 되어버린다.
	// => 클래스에 추상화 시켜주어야 함. public class Shape => public abstract class Shape 추상 클래스로 변경
	// 메소드 Body 없음.
	// 구체적인 동작이 없다. (= 동작이 구체적이지 않음.)
	public abstract int getArea(); // 메소드 head만 존재.
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
}
