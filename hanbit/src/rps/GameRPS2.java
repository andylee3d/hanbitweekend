package rps;

import java.util.Scanner;

public class GameRPS2 {
	public static void main(String[] args) {
		
		System.out.println("===가위 바위 보 게임===");
		System.out.println("===가위 :1, 바위:2, 보자기:3");
		Scanner scanner = new Scanner(System.in);
		//-----------[가공해야할  데이터 입력 부분]-------------------
		int sccisors = 1, rock = 2, paper = 3, rpsValue = 0, comValue = 0;
		String result = " ";
		rpsValue = scanner.nextInt();
		comValue = (int) (Math.random() * 3 + 1);
		switch (rpsValue) {
		case 1:
			if (comValue == 1) {
				result = "사용자 가위, 컴퓨터 가위: 비김";
			} else if (comValue == 2) {
				result ="사용자 가위, 컴퓨터 바위:패배";
			} else {
				result ="사용자 가위, 컴퓨터 보자기:승리";
			}
			break;
		case 2:
			if (comValue == 1) {
				result ="사용자 바위, 컴퓨터 가위:승리";
			} else if (comValue == 2) {
				result ="사용자 바위, 컴퓨터 바위:비김";
			} else {
				result ="사용자 바위, 컴퓨터 보자기:패배";
			}
			break;

		case 3:
			if (comValue == 1) {
				result ="사용자 보자기, 컴퓨터 가위:패배";
			} else if (comValue == 2) {
				result ="사용자 보자기, 컴퓨터 바위:승리";
			} else {
				result ="사용자 보자기, 컴퓨터 보자기:비김";
			}
			break;
	default: System.out.println(result);
			break;
			}
			//--------------------[결과가 보여지는 부분]-----------
	
			System.out.println();
		}
	}


