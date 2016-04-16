package grade;

import java.util.Scanner;

/**
 * @author USER
 * 2016. 4. 16.
*GrameMain.java
*이현호
* story:성적표 프로그램


 */
public class GrameMain {
	/**
	 [문제]
	 과목별 점수를 입력 받아 총점 평균 학점을 구하는 프로그램을 완성하시오
	 (과목은  국,영,수)
	 **/
public static void main(String[] args) {
	// -----(1)변수 선언 영역
	Scanner scanner = new Scanner(System.in);
	Grade grade = new Grade();
	int kor=0,eng=0,math=0, total=0, avg=0;
	String name="";
    // --(2)파라미터 입력 영역--
	System.out.println("이름: [], 국어:[], 영어[],수학[] ");
	name = scanner.next();
	System.out.println("국어,영어,수학점수 입력");
	kor = scanner.nextInt();
	eng = scanner.nextInt();
	math =scanner.nextInt();
	//-------(3)메소드 호출
	total = grade.getTotal(kor, eng, math);
	avg = grade.getAvg(total);
	//--------(4)리턴값출력영역
	System.out.println("name+ 총점은 "+total+"이고 ,평균은 "+avg+"이다.");
}
}
