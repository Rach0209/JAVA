public class ColorBox extends Box {
	String color;
	
//	public ColorBox() {  
//		// 부모 클래스의 생성자부터 호출 된다.
//		super(); // 부모의 생성자를 호출하게끔 되어 있다.
// 		// 부모의 클래스에 생성자(파라미터 값 존재)가 만들어져있다면, 자식은 기본 생성자를 호출 할 수 없다.
		// 해결 방법 => 부모클래스에 기본 생성자를 만들어준다.
	
//		this.color = null;
//	} // 이 과정이 생략 되어있음.
	
	// 또는, 4개의 필드를 모두 초기화 하는 방법
	public ColorBox(int width, int length, int height, String color) {
		super(width, length, height); // 기본 생성자 호출.
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}	
}
