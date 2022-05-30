class Point {
	private int x, y;
	// 생성자
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	// setter 는 값의 변경을 위한 것. 값은 보이게, 변경은 X -> getter만 사용.//
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

class Circle {
	private int radius = 0;
	private Point center; // has-a 관계. 클래스를 필드로 가지는 관계;
	
	// 생성자
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	
	// 중심점 getter
	public Point getPoint() {
		return center;
	}
	public void setPoint(Point p) {
		center = p;
	}
}
	
public class CircleTest {
	public static void main(String[] args) {
		// Circle 객체를 생성하고 초기화한다.
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		
		System.out.println(p.getX());
		System.out.println(c.getPoint().getX());
	}
}
