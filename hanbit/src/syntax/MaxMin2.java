package syntax;

import java.util.Scanner;

/**
 * @author USER
 * 2016. 4. 16.
*MaxMin2.java
*이현호
* story:
 */
public class MaxMin2 {
	public static void main(String[] args) {
		 System. out.println( "===점수를 입력하면 최고점,최저점이 출력됩니다 ===");
         System. out.println( "총 3명의 점수만 입력이 가능합니다. 입력해 주세요");
	int max=0;
	Scanner scanner = new Scanner(System.in);
	int[]scores = new int[3];
	scores[0]= scanner.nextInt();
	scores[1]= scanner.nextInt();
	scores[2]= scanner.nextInt();
    if ((scores[0]> scores[1])&&(scores[0]> scores[2])) {
		  max=scores[0];
	}else if ( scores[1]> scores[2]) {
		  max=scores[1];
		
	}else {
		  max=scores[2];
		  
	}
    System. out.println( max);
	}
}
