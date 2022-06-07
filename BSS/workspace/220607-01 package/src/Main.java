// package
// package는 folder directory이다.
import first.InPackageClass; // import 추가하면 사용 가능. ex) import java.util.Scanner;
import first.second.AnotherClass; // 클래스를 묶어서 외부로 보낼 수 있음. 그 파일을 import 한 것이라 같은 폴더에 있지 않아도 사용가능하다.

public class Main {
	public static void main(String[] args) {
		InPackageClass test = new InPackageClass(); // 자바(JAVA)에서는 클래스를 찾을 때 같은 패키지에서 먼저 찾고, 없다면 컴파일 에러. -- import로 해결 --
		
		AnotherClass test2 = new AnotherClass();
		test2.number = 10; // public한 필드의 접근 가능하다.
//		test2.mySecret = 22; // private한 필드라 접근 불가능.
		// default 접근 제한자 or package 접근 제한자 (AnotherClass안에 int test;)
//		test.test = 33; // 접근 제한자가 적혀 있지 않아도 의미가 있는 접근제한자임. 접근불가.
	}
}
