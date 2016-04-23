package kaup;

public class KaupServiceImpl implements KaupService {

	@Override
	public int getIndex(KaupBean kaup) {
		int idex = (int) ((kaup.getWeight()) / (kaup.getHeight()*kaup.getHeight()) * 10000);
		return idex;
	}

	@Override
	public String getResult(int idex) {
		String  result = "";
		if (idex>=30) {
			result = "비만입니다";
		}else if (idex>=24&& idex<24) {
			result = "과체중입니다";
		}else if (idex>=20 && idex>20) {
			result = "정상입니다";
		}else if (idex>=24&& idex<15) {
			result = "저체중";
		}else if (idex>=24&& idex<13) {
			result = "마름";
		}else if (idex>=24&& idex<10) {
			result = "영양실조";
		}else if (idex>=24&& idex<30) {
			result = "소모증";
		
		}
			
		return null;
	}

}
