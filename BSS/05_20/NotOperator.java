public class NotOperator {
	public static void main(String[] args) {
		boolean t = true;
		
		// '!' 느낌표인 not 연산자를 줌으로써, 반대로 뒤집음
		t = !t;
		System.out.println(t); // false 출력
		
		!((10 > 3) && (3 == 3)) // ! 때문에 false 출력
		!(!(10 > 3) || (3 == 3)) // false
	}
}