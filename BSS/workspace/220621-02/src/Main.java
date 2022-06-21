import java.util.ArrayList;
import java.util.List;

// x,y 좌표를 나타내는 클래스 생성
class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	// equals의 재정의를 해주지 않으면 동등함 비교 불가능
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Point2D))
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}

public class Main {
	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		// 0, 0 추가 - 생성자 사용
		list.add(new Point2D(0, 0));
		// 5, 5
		list.add(new Point2D(5, 5));

		Point2D p = list.get(0);
		System.out.println(p);
		
		Point2D p2 = list.get(1);
		System.out.println(p2);
		
		// 리스트에 0,0 좌표 객체가 있는지??
		// 리스트에 0,0 좌표 객체의 인덱스는?
		
		// 모든 객체는 동등함을 알려줄 수 있는 equals가 있다.
		// equals를 호출해서 비교. 오버라이드를 하지 않으면 같은 참조로 인식 하지 않아서 false
		// equals를 재정의해서 동등함을 알려줄 수 있다.
		System.out.println("오버라이드 후 : " + new Point2D(0, 0).equals(new Point2D(0, 0)));
		
		System.out.println(list.contains(new Point2D(0, 0)));
		System.out.println(list.indexOf(new Point2D(0, 0)));
		
		System.out.println(list.remove(new Point2D(5, 5)));
		
		System.out.println(list);
	}

}
