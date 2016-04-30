package kaup;

public class Kaup {
	
	public String showStatus(int index){
		String result = "";
		// 코드를 완성하시오
		if(index >= 30) result = "비만";
		else if(index >= 24) result = "과체중";
		else if(index >= 20) result = "정상";
		else if(index >= 15) result = "저체중";
		else if(index >= 13) result = "마름";
		else if(index >= 10) result = "영양실조";
		else result = "소모증";
		
		return result;
	}
	
	public int calcIndex(double weight, double height){
		/**
		 * To. 선생님
		 * 제공해 주신 공식을 그대로 사용하면 형변환시 0이 되어버리는 현상이 있습니다.
		 * 이에 산술영역을 ()로 감싸고 형변환 해보니 정상적인 결과가 출력됩니다.
		 * 어떤 차이가 있는 것인지 질문드립니다.
		 */
		//int idx = (int)(weight/(height*height))*10000;
		int idx = (int)((weight/(height*height))*10000);
		//System.out.println(idx);
		return idx;
	}
}
