package Lotto;

public class LottoBean {
	private int money; 
	private int number;
	//ALT+SHFT+S + R
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNumber() {
		setNumber();//this.생략
		return number;
	}
	public void setNumber() {
		this.number = (int) (Math.random()*45+1);
	}
	
}
