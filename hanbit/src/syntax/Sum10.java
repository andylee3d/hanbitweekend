package syntax;

/**
 * @author USER
 * 2016. 4. 16.
*Sum10.java
*이현호
* story:1부터 10까지의합


 */
public class Sum10 {
	public static void main(String[] args) {
		int oddSum = 0, evenSum = 0;
		//sum=1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		for (int i = 1; i <= 10; i+=2) { //int 시작값 arg legth 끝값
			oddSum += i; //+는 누적
			//System.out.print(i+"\t");
		}
		System.out.println("1부터 10홀수의합="+oddSum);
		for (int i = 2; i <= 10; i+=2) { 
			evenSum += i;
		}
		System.out.println("1부터 10짝수의합="+evenSum);
	}
}
