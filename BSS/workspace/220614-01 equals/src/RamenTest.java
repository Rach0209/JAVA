// 컵라면
// 제조사
// 이름
// 가격

// 생성자, 게터세터

// Override
// toString
// equals - 제조사와 이름이 같으면 같은 컵라면. 가격 상관 없음.

public class RamenTest {
	public static void main(String[] args) {

		CupRamen ramen1 = new CupRamen("농심", "육개장 사발면", 900);
		CupRamen ramen2 = new CupRamen("삼양", "육개장", 950);
		CupRamen ramen3 = new CupRamen("농심", "육개장 사발면", 1250);
		
		// 기본적으로 객체이름을 출력하면 .toString()이 호출되는데, 기본형 @Id102938 <-이런식
		// 클래스에서 toString()의 리턴값을 오버라이딩 해주면 원하는 값으로 나온다.
		// 명시적으로 적지 않아도, toString()이 호출됨.
		System.out.println(ramen1);
		System.out.println(ramen2.toString());
		System.out.println(ramen3.toString());
		
		System.out.println("ramen1(농심, 육개장 사발면) ramen2(삼양, 육개장) 비교");
		if (ramen1.equals(ramen2)) {
			System.out.println("같은 라면임.");
		} else {
			System.out.println("다른 라면임!!");
		}
		
		System.out.println("ramen1(농심, 육개장 사발면) ramen3(농심, 육개장 사발면) 비교");
		if (ramen1.equals(ramen3)) {
			System.out.println("같은 라면임~");
		} else {
			System.out.println("다른 라면임~");
		}
	}
}
