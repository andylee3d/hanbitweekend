package syntax;

import java.util.Scanner;

/**
 * @author USER
 * 2016. 4. 16.
*InputSum.java
*이현호
* story:1부터 입력된 수까직 누적되는 합계


 */
public class InputSum {
	public static void main(String[] args) {
		/**
		 [문제]
		 for-loop 으로 입력된 값들의 힘을 구하는 연산식을 완성하시오
		 * */
		System.out.println("1부터누적되는 합계를 구할 마지가막수를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt(),sum = 0;
		for (int i = 0; i <= limit; i++) {
			sum += i;
			
		}
		
		System.out.println("1부터 "+limit+"까지의 합="+sum);
		
	}
}
