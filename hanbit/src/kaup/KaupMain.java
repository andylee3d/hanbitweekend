package kaup;

import java.util.Scanner;

public class KaupMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Kaup kaup = new Kaup();
		String name = "";
		int height = 0, weight = 0;
		while (true) {
			System.out.println("=== 카우프 지수 구하기 프로그램=====");
			System.out.println("[메뉴]1.계속2.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1:break;
			case 2:break; 

			default:System.out.println("1,2번만 선택이 가능합니다");
				break;
			}
					
					name = scanner.next();
			height = scanner.nextInt();
			weight = scanner.nextInt();

			KaupBean kaup = new KaupBean();
			kaup.setName(name);
			kaup.setWeight(weight);
			kaup.setHeight(height);

			System.out.println("");
		}

	}
}