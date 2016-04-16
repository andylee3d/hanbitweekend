package syntax;

/**
 * @author USER 2016. 4. 9. calc.java 이현호 story:브랜치 예제(switch case)
 */
public class Calculator {
	public String execute(int a, String op,int b ){
		String result = "";		
		switch (op) {
		case "+":
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case "-":
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case "*":
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		case "/":
			System.out.println(a + "/" + b + "=" + (a / b)+ "...." + (a % b));
			break;
			
			

		default:System.out.println("연산기호를 잘못 입력");
			break;
		}
		return result;
	}
}
