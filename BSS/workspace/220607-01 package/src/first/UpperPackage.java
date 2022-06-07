package first;

import first.second.AnotherClass;

public class UpperPackage {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.number = 11;
//		a.mySecret = 22; // 접근 불가.
//		a.test = 33;
	}
}
