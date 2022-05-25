public class StringMethods {
	public static void main(String[] args) {
		String hello = "Hello";
		
		// index 값을 찾아서 출력해줘;
		int index = hello.indexOf("o");
		System.out.println(index); // 4
		
		// index값은 -(음수)가 나올 수 없다 ; 값이 없으면 무조건 -1로 출력;
		int notFound = hello.indexOf("a");
		System.out.println(notFound); // -1 
		
		// 붙어있는 단어들은 찾을 수 있지만, 멀리 떨어진 글자는 따로따로 해야함;
		int index2 = hello.indexOf("ll");
		System.out.println(index2); // 2 
		
		// 찾는 시작점을 설정할 수 있음
		int index4 = hello.indexOf("l", 2);
		System.out.println(index4); // 2
		
		// 오른쪽에서부터 먼저오는 l을 찾는다; lastIndexOf가 아닌 기본 indexOf 는 왼쪽부터;
		int index3 = hello.lastIndexOf("l");
		System.out.println(index3); // 3 
		
	}
}