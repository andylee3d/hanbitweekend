package Lotto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		LottoBean hong = new LottoBean();
		LottoService service = new LottoServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마치를 구입하십니까?");
		hong.setMoney(scanner.nextInt());
		service.setLottos(hong);
		int[][] lottos = service.getLottos();
		for (int i = 0; i < lottos.length; i++) {
			service.sort(lottos[i]);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.print(lottos[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
}


