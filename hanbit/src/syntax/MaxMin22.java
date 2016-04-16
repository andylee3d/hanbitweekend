package syntax;

import java.util.Scanner;

public class MaxMin22 {
     public static void main(String[] args) {
    		System.out.println("===점수를 입력하면 최고점,최저점이 출력됩니다.(만점 100, 0점 0) ===");
    		System.out.println("총 5명의 점수만 입력이 가능합니다. 입력해 주세요");
    		
    		int max=0,min=100;   
    		Scanner scanner = new Scanner(System.in);
    		int[]scores = new int[5];
            for (int i = 0; i < scores.length; i++) {
	              scores[i] = scanner.nextInt();
    }
    	    
            for (int i = 0; i < scores.length; i++) {
				System.out.println(scores[i]+"\t");
			}
            for (int i = 0; i < scores.length; i++) {
				if (scores[i]>0) {
					max = scores[i];
				}
				if (scores[i]>100) {
					min=scores[i];
				}
			}
            
    		System.out.println("최고점 :"+max+", 최저점: "+min);
    		
	}
}
