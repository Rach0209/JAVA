// 자식 클래스
// 추상 클래스를 상속하는 추상 클래스도 생성 가능
public abstract class MySubClass extends MyClass{
	
	// @Override 막기 => final 메소드
	// 더 이상 상속 불가하게 함 => 
//	public final void myMethod() {
	 
	@Override
	public void myMethod() {
		System.out.println("자식 클래스에서 구현되었슴다.");
	}
	
	public abstract void myMethod2();
}
