package syntax;

import java.util.Scanner;

/**
 * @author USER
 * 2016. 4. 9.
*minus.java
*이현호
* story: 연산자 뺑셈 문법


 */
public class Minus {
	public static void main(String[] args) {
		System.out.println("정수뺄셈");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째정수 입력");
		int a = scanner.nextInt();
		System.out.println("두번째 정수 입력");
        int b = scanner.nextInt();
        int c = a - b;
        System.out.println(a + "-" + b + "="+c);
		
	}
}
