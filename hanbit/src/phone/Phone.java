package phone;

public class Phone {
	private String company, call;// 인스턴스변누-> 힙역역
	public static String KIND = "일반전화";// 스테틱(전역)변수
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}
	@Override
	public String toString() {
		return KIND+ "인 " + this.company + "폰을가지고" 
	         + this.call + "'라고통화함";
	}
	
	
}
