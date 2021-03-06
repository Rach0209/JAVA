// 회원 관리 프로그램
// 회원을 콘솔 입력으로 등록할 수 있게. 최대 10명
// 중복 등록이 되면 안 됨. (이름, 키, 몸무게가 동일하면 중복입니다.)
// 기준에 따라 집계를 해서 목록을 보여줘야 합니다.

// 나의 기준 : 몸무게 정렬, 비만 (저체중 ~ 고도 오름차순)기준

// 회원
// 이름
// 키
// 몸무게

// BMI 지수
// BMI = 몸무게(kg) / 키^2(m);

// 비만 기준
// 고도 비만 : 35 이상
// 중도 비만 (2단계 비만) : 30 이상 - 35 미만
// 경도 비만 (1단계 비만) : 25 이상 - 30 미만
// 과체중 : 23 - 25 미만
// 정상 : 18.5 이상 - 23 미만
// 저체중 : 18.5 미만



public class HealthTest {
	public static void main(String[] args) {
		MemberManage m = new MemberManage();
		
		m.start();
	}
}
