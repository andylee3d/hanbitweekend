package syntax;

import java.util.Scanner;

/**
 * @author USER 2016. 4. 9. calc.java 이현호 story:브랜치 예제(계산기 프로그램)
 */
public class Calc2 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		String op = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산자 종류를입력(+,-,*,/ 입니다)");
		op = scanner.next();
		if (op.equals("+")) {
			System.out.println("=두 수의 더하기 프로그램=");
			System.out.println("첫번째 정수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 정수 입력");
			b = scanner.nextInt();
			c = a + b;
			System.out.println(a + "+" + b + "=" + c);

		} else if (op.equals("-")) {
			System.out.println("정수뺄셈");
			System.out.println("첫번째정수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 정수 입력");
			b = scanner.nextInt();
			c = a - b;
			System.out.println(a + "-" + b + "=" + c);

		} else if (op.equals("*")) {
			System.out.println("=곱셈문법=");
			System.out.println("첫번재 수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 수 입력");
			b = scanner.nextInt();
			c = a * b;
			System.out.println(a + "*" + b + "=" + c);

		} else if (op.equals("/")) {
			System.out.println("=나누기=");
			System.out.println("첫번재 수 입력");
			a = scanner.nextInt();
			System.out.println("두번째 수 입력");
			b = scanner.nextInt();
			c = a / b;
			d = a % b;
			System.out.println(a + "/" + b + "=" + c + "...." + d);

		} else {
			System.out.println("연산기호를 잘못 입력");
		}
	}
}
