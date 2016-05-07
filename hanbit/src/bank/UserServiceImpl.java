package bank;

public class UserServiceImpl implements UserService{
/*
	변수의종류
	1.지역변슈:메소드 안에 선언+반드시 초기화
	2.인스턴스 변수: 클래스 안에 선언+초기ㅗ하를 하니 않는다
	3.스테틱(전역)변수:프로넥트 어디등 호출가능, 단 클래스이름 . 메소드이름() Math.random()
	*/
	AccountBean account ;
	@Override
	public String openAccount(String name, int password, int money) {
		// 계좌계설
		account = new AccountBean();
		account.setOwnerName(name);
		account.setPassword(password);
		account.setRestMoney(money);
		
		return account.toString();
		
	}

	@Override
	public String searchRestMoney() {
		// 잔액조회
		return String.valueOf(account.getRestMoney());//int타입-string타입변경
	}

	@Override
	public String deposit(int money) {
		// 예금
		account.setRestMoney(account.getRestMoney()+money);
		return "입금후 잔액은"+account.getRestMoney();
	}

	@Override
	public String withdraw(int money) {
		// 출금
		String message = "";
		if (account.getRestMoney()>=money) {
			account.setRestMoney(account.getRestMoney()+money);
			message="출금후 잔액"+account.getRestMoney();
		}else {
			message=" 잔액 부족합니다";
		}
		account.setRestMoney(account.getRestMoney()-money);
		return message;
	}

	@Override
	public String closeAccount() {
		// 계좌해지
		account = null;
		return "해지되었습니다";
	}

}
