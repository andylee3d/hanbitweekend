package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone phone = new Phone();
		CelPhone celPhone = new CelPhone();
		Iphone iphone = new Iphone();
		AndroidPhone androidPhone = new AndroidPhone();
		while(true){
			System.out.println("[메뉴]1.일반폰 2.휴대폰 3.아이폰 4.안드로이드 0.종료");
			switch (scanner.next()) {
			case "1":
				System.out.println("어느회사제품?");
				phone.setCompany(scanner.next());
				System.out.println("통화내용?");
				phone.setCall(scanner.next());
				System.out.println(phone.toString());
				break;
			case "2":
				System.out.println("어느회사제품?");
				celPhone.setCompany(scanner.next());
				System.out.println("통화내용?");
				celPhone.setCall(scanner.next());
				//System.out.println("휴대가능?");
				celPhone.setPortable(true);
				System.out.println(celPhone.toString());
				break;
			case "3":
				System.out.println("TO. ?");
				System.out.println("문자내용?");
				iphone.setData(scanner.next(),scanner.next());
				System.out.println(iphone.toString());
				break;
			case "4": 
				
				System.out.println("TO ?");
				System.out.println("몇인치 ?");
				System.out.println("문자내용?");
				androidPhone.setData(scanner.next(),scanner.next(),scanner.next());
				System.out.println(androidPhone.toString());
				
				break;
			case "0":System.out.println("종료");return;

			default: System.out.println("0-2까지번호만 입력바랍니다");
				break;
			}
		}
		
		
		
	}
}
