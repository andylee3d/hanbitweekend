package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하려는 대상파일을 선택해주세요");

		try {
			File file = new File("C:\\Users\\USER\\test\\lotto.txt");
			FileWriter writer = new FileWriter(file,true);//true 이어붙이라
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// 에러가 발생하면 이쪽에서 처리한다.
			e.printStackTrace();
		}
	}
}
