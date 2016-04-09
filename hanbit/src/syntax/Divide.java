package syntax;

import java.util.Scanner;

/**
 * @author USER
 * 2016. 4. 9.
*divide.java
*이현호
* story:


 */
public class Divide {
	public static void main(String[] args) {
		int a=0,b=0,c=0,d=0;
		System.out.println("=나누기=");
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번재 수 입력");
		 a = scanner.nextInt();
		System.out.println("두번째 수 입력");
		 b = scanner.nextInt();
		c= a/b;
		d= a%b;
			System.out.println(a + "/" + b + "="+c+"...."+ d);
	}
}
