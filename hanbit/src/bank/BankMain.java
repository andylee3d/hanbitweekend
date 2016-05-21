package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// 외부의값을 불른다 scanner
		UserService userService = new UserServiceImpl();
		AdminService aService = new AdminServiceImpl(100);
		// System.out.println("통장몇개관리");
		while (true) {
			System.out.println("1.통장계설 2.입금 3. 출금 4. 잔액조회 5.해지 0.종료");
			System.out.println("101.통장개설 102.조회(계좌) 103. 조회(이ㅡ름) 104.계좌수 105.해지0.종료");
			switch (scanner.next()) {
			case "1":
				System.out.println("통장을 개설하시려면 성함,비번,초기 입금액을 입력하세여");
				System.out.println(userService.openAccount(scanner.next(), scanner.nextInt(), scanner.nextInt()));
				break;
			case "2":
				System.out.println("입금액?");
				System.out.println(userService.deposit(scanner.nextInt()));
				break;
			case "3":
				System.out.println("출금액? ");
				System.out.println(userService.withdraw(scanner.nextInt()));
				break;
			case "4":
				System.out.println("잔액?");
				System.out.println(userService.searchRestMoney());
				break;
			case "5":
				System.out.println("해지합니다");
				System.out.println(userService.closeAccount());
				break;
			case "101":
				System.out.println("통장을 개설하시려면 성함,비번,초기 입금액을 입력하세여");
				System.out.println(aService.openAccount(scanner.next(), scanner.nextInt(), scanner.nextInt()));
				break;
			case "102":
				System.out.println("조회계좌번호 ?");
				AccountBean a = aService.searchAccountByAccountNo(scanner.nextInt());
				System.out.println((a == null) ? "조회하려는 계좌 존재무" : a.toString());
				break;
			case "103":
				System.out.println("조회계좌   이름?");
				AccountBean[] arr = aService.searchAccountsByName(scanner.next());
				if (arr.length == 0) {
					System.out.println("조회하려는 이름이 존재하지 않습니다.");
				} else {

				}
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);

				}

				break;
			case "104":
				System.out.println("계좌수?" + aService.countAll());
				break;
			case "105":
				System.out.println("해지번호?");
				System.out.println(aService.closeAccount(scanner.nextInt()));
				break;
			case "0":
				System.out.println("*종료*");
				return;
			default:
				System.out.println("메뉴에 있는 번호 이력");
				break;

			}
		}
	}
}
