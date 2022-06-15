public class Triangle extends Shape {
	private int base; // 삼각형 추가 특징 밑변, 높이 생성;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	@Override // 부모 클래스인 추상 클래스에서 없었던 body가 생김.
	public int getArea() {
		return base * height / 2;
	}
	
}
