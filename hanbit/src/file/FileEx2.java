package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하려는 대상파일을 선택해주세요");
	

		try {
			File file = new File("C:\\Users\\USER\\test\\lotto.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));//true 이어붙이라
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String msg = "";
			while(true){
				System.out.println("[메뉴]1.전송2.읽기 0.종료");
				switch (scanner.next()) {
				
				case "1":
		            System.out.println("===에시지입력====");
					writer.write(scanner.next());
		            writer.newLine();
					writer.flush();
					writer.close();
					 break;
				case "2":
					System.out.println("메세지보기");
					while((msg = reader.readLine()) != null){
						System.out.println(msg);
					}
					break;
				case "0":
					System.out.println("시슽템종료합니다");
					writer.close();
					return;
				default:
					System.out.println("0-2까지입력");
					break;
				}
			}
			


		} catch (IOException e) {
			// 에러가 발생하면 이쪽에서 처리한다.
			e.printStackTrace();
		}
	}
}
