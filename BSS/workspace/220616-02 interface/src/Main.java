class MyClass {
	
	public int fields = 10000;
	
	static { // static은 정적표현; 클래스를 로드하는 시점에 전부 만들어진다. 그래서 먼저 출력됨.
		System.out.println("테스트테스트");
		MyClass2.hello();
	}
	public static int num; // JVM은 기본적으로 변수부터 만들기 때문에,
	// num이 밑에 있지만 MyClass2클래스에서 메소드가작동한다.
}

class MyClass2 {
	static void hello() {
		System.out.println(MyClass.num);
		System.out.println(new MyClass().fields); 
		// 여기서 fields 변수는 생성자로 만들어 주었을때 동적으로 작동
	}
}

public class Main {
	public static void main(String[] args) {
//		System.out.println(Days.NUM); //NUM 은 static(정적)이다.
//		Days.num = 100; // 값이 변경되지 않음. => 상수 형태.
		
		// 메소드도 공간을 잡아 먹는다.
		// 미리 만들어진 메소드를 JVM이 호출한다. 정적 static
		
		// 클래스에 정의된 메소드는 객체가 만들어질 때 만들어진다. 동적
		
		
		System.out.println("시작~~");
		MyClass2.hello(); // class를 로드할 때, static void hello() - 최초로 정적 메소드가 만들어짐
		
	}
}
