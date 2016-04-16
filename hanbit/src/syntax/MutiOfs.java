package syntax;

/**
 * @author USER
 * 2016. 4. 16.
*MutiOfs.java
*이현호
* story: 1부터 100까지 5의 배수의 합과 갯수


 */
public class MutiOfs {
	/**
	 [문제]
	 sum: 배수의합 
	 count:배수의 갯수
	 일때 1부터 100까지의 범위내의 5의 배수의 합과 갯수를 구하시오
	 **/
    public static void main(String[] args) {
       int sum=0, count=0;
	   for (int i = 1; i <= 100; i++) {
		   if (i%5==0) {
			   sum += i;
			   count ++;
		}
		
	}
	  System.out.println("5의배수의합 : "+sum+",이고 갯수 : " +count);
	   
}
}
