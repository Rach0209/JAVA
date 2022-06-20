// 은행 계좌
// 필드 : 잔고 (int)
// 메소드 : 입금(int) : void
//        출금(int) : void >> 출금액이 보유 잔고 이상일 때 예외(부족한 금액이 얼마?)를 발생시켜서 throws...
//        getter() : int

// ********* RuntimeException *********
// RuntimeException은 필드가 message 하나 밖에 없다.
// 그래서 다른 값을 더 추가하려면 상속 받아서 쓸 수 있는 클래스를 만들어준다.



// 메시지를 줄 수 있는 출금예외 만들기
class BankWithdrawException extends RuntimeException {
	private int lack;
	
	public BankWithdrawException(String message, int lack) {
		super(message);
		this.lack = lack;
	}
	
	public int getLack() {
		return lack;
	}
}

class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) throws BankWithdrawException {
		if (balance >= amount) {
			balance -= amount;
		} else { // 출금이 일어나지 않는 상황에 던질 예외
			throw new BankWithdrawException("ㅋㅋ...ㅎㅎ;;ㅈㅅ!!\n님 돈 모자람ㅎㅋㅋ;ㅎㅋ;", amount - balance);
		}
	}

	public int getBalance() {
		return balance;
	}
}

public class Main6 {
	public static void main(String[] args) {
		// 은행 계좌 객체 생성
		BankAccount b = new BankAccount(1000);
		// 입금 / 출금 / 게터 테스트
		b.deposit(1000);
		// 출금 호출 >> 예외 처리 (try - catch)
		try {
		b.withdraw(2500);
		System.out.println(b.getBalance());
		} catch (BankWithdrawException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLack() + "부족함");
		}
	}
}
