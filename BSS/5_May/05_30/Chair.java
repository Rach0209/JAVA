// 의자 클래스
// 제조사
// 생산일자
// 가격
// 모델명

// 초기화 할 수 있는 생성자

// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보세요.

public class Chair {
		String madeBy;
		String date;
		int price;
		String model;
		
	public Chair(String mB, String d, int p, String m) {
		madeBy = mB;
		date = d;
		price = p;
		model = m;
	}
	
	void printAll() {
		System.out.println(madeBy);
		System.out.println(date);
		System.out.println(price);
		System.out.println(model);
	}
	
	public static void main(String[] args) {
		Chair chair = new Chair("불편함", "2022.04.", 50000, "안 편한 강의실 의자 - 그냥 쓰세요");
		Chair c2 = new Chair("허먼밀러", "2019-10-21", 2120000, "뉴 에어론");
		// chair.madeBy = "불편함";
		// chair.date = "2022.04.";
		// chair.price = 50000;
		// chair.model = "안 편한 강의실 의자 - 그냥 쓰세요";
		
		chair.printAll();
		c2.printAll();
	}
} 