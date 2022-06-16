package zoomanage;

// 동물원 관리

// 동물 - 종, 나이, 무게					- 클래스 생성

// 직원 - 역할(조련사, 경영 등등), 이름		
// 조련사는 동물을 1마리만 담당합니다.

// 관리하는 동물은 육식/초식으로 나누어서 관리		- 인터페이스화 / 육식동물(carnivore) 초식동물(herbivore)
// 주식으로 분류하여 동물 목록을 볼 수 있음.		
// 조련사 담당에 따라 동물 목록을 볼 수 있음. (담당자가 없는 동물도 볼 수 있어야 함)

public class Main {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		
		z.atStart();
	}
}
