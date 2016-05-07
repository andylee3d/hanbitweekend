package phone;

public class CelPhone extends Phone{
	private boolean portable;//이동성 가지고 다닐수 있느냐  없느냐
	private String move;
	public final static String KIND = "휴대폰";
	
	
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("폰을 가지고 다실수 있음");
		}else {
			this.setMove("폰을 가지고 다실수 없음");
		}
		this.portable = portable;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		
		this.move = move;
	}
	
	@Override
	public String toString() {
		return KIND+"이기때문에   "+ move+","+ super.getCompany() + "폰을가지고" 
		         + super.getCall() + "'라고통화함";
	}
	
	
}
