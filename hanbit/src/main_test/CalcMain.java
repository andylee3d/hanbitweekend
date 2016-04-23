package main_test;

import java.util.Scanner;

import grade.GradeBean;
import syntax.Calculator;


/**
 * @author USER
 * 2016. 4. 16.
*CalcMain.java
*이현호
* story:


 */
public class CalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0;
		String op = "",result="";
		System.out.println("첫번째 정수 입력");
		a = scanner.nextInt();
		System.out.println("연산자 종류를입력(+,-,*,/ 입니다)");
		op = scanner.next();
		System.out.println("두번째 정수 입력");
		b = scanner.nextInt();
		
		//-------------------------데이터 입력---------------
		 Calculator calculator= new Calculator();
		result = calculator.execute(a, op, b);
		//-------------------------리턴값출력-------------
		
		System.out.println(result);
		
	 System.out.println("총점을 구하시오");
		GradeBean grade = new GradeBean();
		
				
				System.out.println("홍길동의 총점은 "+0+"이고 ,평균은 "+0+"이다");
				
	}
}
