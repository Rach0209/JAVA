public class Box {
	int width;
	int length;
	int height;
	// 기본 생성자는 생략 가능. 생성자가 있다면 기본생성자를 만들어줘서 자식에서 호출 가능.
	public Box() {}
	
	public Box(int width, int length, int height) { // 생성자.
		this.width = width;
		this.length = length;
		this.height = height;
	} // 자식 클래스에 컴파일 에러가 발생한다.

//	public Box() {
//		width = 5;
//		length = 5;
//		height = 5;
//	}
	
	public int getVolume() {
		return width * length * height;
	}
}
