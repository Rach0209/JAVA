import java.time.LocalDate;

interface LeafletHandler {
	// 전단지는 문자열을 반환하게함
	String give();
}

// 위의 인터페이스를 구현하는 클래스를 작성하세요. 추상메소드를 오버라이드 해야합니다. 구현 바디는 (전화번호 문자열 반환)
// 일수 광고 전단지 제공자
// 전화번호가 포함되어야함.
class LoanAD implements LeafletHandler {
	private String phone;

	public LoanAD(String phone) {
		super();
		this.phone = phone;
	}
	// 문자열 반환
	@Override
	public String give() {
		return phone;
	}
}
// 선거 광고 전단지 제공자
// 선거 날짜가 포함되어야함.
class VoteAD implements LeafletHandler {
	private LocalDate day;

	public VoteAD(LocalDate day) {
		super();
		this.day = day;
	}
	// 날짜를 필드로 가지고 있다가 문자형태로 변환하여 반환
	@Override
	public String give() {
		return "투표날짜: " + day.toString();
	}
}
// -----------------
// 광고대행사
// 일수광고/선거광고 그때그때마다;

// 인터페이스 구현체들을 필드로 가지는 클래스 생성 - 광고대행사
class AdCompany {
	LeafletHandler ad;

	public AdCompany(LeafletHandler ad) {
		super();
		this.ad = ad;
	}

	public LeafletHandler getAd() {
		return ad;
	}

	public void setAd(LeafletHandler ad) {
		this.ad = ad;
	}
	// 콘솔창에 광고할거임
	public void consoleAD() {
		System.out.println(ad.give());
	}
}
public class Main {
	public static void main(String[] args) {
		AdCompany company = new AdCompany(new LoanAD("010-0002-4434"));
		company.consoleAD();
		
		company.setAd(new VoteAD(LocalDate.now()));
		company.consoleAD();
		
		
//		LeafletHandler h1 = new 일수광고();
//		String 일수광고문자열전화번호포함 = h1.give();
//		
//		LeafletHandler h2 = new 선거광고();
//		String 선거날자가포함된광고 =  h2.give();
//		
//		광고대행사 p = new 광고대행사(일수광고);
//		p.광고() <<< 일수광고
//		
//		p.set고객(선거광고);
//		p.광고() <<< 선거광고
	}

}
