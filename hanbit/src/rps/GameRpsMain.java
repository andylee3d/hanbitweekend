package rps;

import java.util.Scanner;

public class GameRpsMain {
    public static void main(String[] args) {
    	System.out.println("===가위 바위 보 게임===");
    	System.out.println("===가위 :1, 바위:2, 보자기:3");
    	Scanner scanner = new Scanner(System.in);
    	int scan = scanner.nextInt();
		String  result = "";
		//-----------데이터입력----------
		GameRps gameRps= new GameRps();
		result= gameRps.play(scan);
		//---------데이터 출력-----------
    	
    	System.out.println(result);
		
		
}
}
