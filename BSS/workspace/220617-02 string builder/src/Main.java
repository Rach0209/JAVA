public class Main {
	public static void main(String[] args) {
		// 스트링(문자열)을 만들어 주는 클래스.
//		StringBuilder sb = new StringBuilder("원본");
//		sb.append(",One=");
//		sb.append(1);
//		sb.append(",DoubleValue=");
//		sb.append(255.0);
//		String result = sb.toString();
//		System.out.println(result);
		StringBuilder sb = new StringBuilder("원본");
		sb.append(",One=") // append는 void를 리턴하는 것이 아니라 자기 자신의 참조를 붙여준다.
			.append(1)
			.append(",DoubleValue=")
			.append(255.0);
		
		// 똑같이 문자열 조작가능.
		// 흐름을 타고 내려가서 조금 느림, 서로 장단점이 있음
//		StringBuffer sbuffer; 
		
//		sb.reverse(); 글자 순서 뒤집기
		// 문자 바꾸기
		// (인덱스 번호, 바꿀문자);
		sb.setCharAt(0, 'Q');
		// (인덱스, 인덱스, 문자);
		sb.replace(0, 3, "ㅂㅈㄷㄱ");
		// (인덱스, 문자);
		sb.insert(0, "시작");
		
		String str = "원본";
		str.concat(",one="); // 새로운 참조를 만들어, 그 참조를 반환하는 것, 원본 = str 은 유지된다. 불변.
		
		String result = sb.toString(); // 문자열로 다루고 싶을 때, toString()사용
		System.out.println(result);
		
		
		
//		String str = "원본 문자열";
//		String other = "다른 문자열";
//		String origin = "원본 문자열";
//		
//		String concat = str + other;
//		System.out.println(concat);
		// 문자열의 합연산을 동적 수행하면,
		// 새로운 인스턴스를 생성하기 때문에 false값. => 공간의 비효율적인 사용이 일어남.
//		System.out.println("원본 문자열다른 문자열" == concat);
//		System.out.println(concat.equals("원본 문자열다른 문자열"));
		
		// 자바에서는 컴파일 할 때, 문자열은 최대한 같은 참조로 만들려고 한다.
		// 인스턴스는 공간을 차지하기 때문.
//		System.out.println(str == origin); // true;
		
	}

}
