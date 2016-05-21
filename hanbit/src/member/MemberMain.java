package member;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MemberService service = new MemberServiceImpl();
		System.out.println();
		while (true) {
			System.out.println("[메뉴]1.회원가입 2.로그인 3.미이페이지 4.수정 5.탈퇴 6.조회(ID) 7.조회(성별) 8.조회이름 0.로그아웃");
			switch (s.next()) {
			case "1":
				System.out.println("이이디, 비번, 이름, 성별");
				MemberBean m = new MemberBean(s.next(), s.next(), s.next(), s.next());
				System.out.println(service.join(m));
				break;
			case "2":
				System.out.println("이이디, 비번");
				System.out.println(service.login(s.next(), s.next()));
				break;
			case "3":
				System.out.println(service.detail().toString());
				break;
				
			case "4":
				System.out.println("비번");
				MemberBean m2 = new MemberBean();
				m2.setPwd(s.next());
				service.update(m2);
				break;
			case "5":
				service.delete();
				break;
			case "6":
				System.out.println("조회 ID");
				System.out.println(service.finfByID(s.next()).toString());
				break;
			case "7":
				System.out.println("조회 성별:남자이면M, 여자이면w");
				System.out.println(service.countByGen(s.next()) + "명");
				break;
			case "8":
				System.out.println("조회 이름");
				System.out.println(service.findByName(s.next()));
				break;
			case "0":
				System.out.println("로그아웃.");
				return;

			default:
				System.out.println("1-6까지만 입력하세요");
				break;
			}
		}

	}

}
