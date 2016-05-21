package Lotto;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
     private int[] lotto;
     public Lottery() {
		// 생성자---> 객체생성 ---->인스턴스 변수  파란색 로또 메소들의 공유 변수
    	 lotto = new int[6];
    	 
	}
	public int[] getLotto() { // 추첨한것이어서 바뀌면 안됨
		this.setLotto();
		return lotto;
		
	}
	public void setLotto() {
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]= 0;
			
		}
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random()*45+1);
			System.out.println("로또추첨중...."+num);
			boolean exist = false;
			for (int j = 0; j < lotto.length; j++) {
				//중복체크
				if (num == lotto[j]) {
					exist = true; // 중복이란뜻
					break;
				}
			}
			if (exist) {
				i--;
				continue;
			}else {
				lotto[i] = num;
			}

		}
		Arrays.sort(lotto);
	}

	
}
