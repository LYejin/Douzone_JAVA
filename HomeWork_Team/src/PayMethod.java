import java.util.Scanner;

public class PayMethod {
	private int cash; // 현금
	
	public int getCash() {
		return cash;
	}
	
	public void getCashPrint() {
		System.out.println("현재 남은 금액은 " + this.cash + "입니다");
		System.out.println();
	}
	
	public void outputCashPrint() {
		System.out.println(cash + " 출금합니다");
		useCash(cash);
		System.out.println();
	}
	
	public void inputCash(int cash) {
		this.cash += cash;
		System.out.println();
	}
	
	public int noCash(int menuNum) { 
		int i = 0;
		switch (menuNum) {
			case 1: if (this.cash < 1800) { System.out.println("돈이 부족합니다."); getCashPrint(); i=1;}
				break;
			case 2: if (this.cash < 1500) { System.out.println("돈이 부족합니다."); getCashPrint(); i=1;}
				break;
			case 3: if (this.cash < 1900) { System.out.println("돈이 부족합니다."); getCashPrint(); i=1;}
				break;
			case 4: if (this.cash < 1000) { System.out.println("돈이 부족합니다."); getCashPrint(); i=1;}
				break;
			default : i=0; break;
		}
		return i;
	}
	
	public void useCash(int cash) {
		this.cash -= cash;
		System.out.println("현재 남은 금액은 " + this.cash + "입니다");
	}
}
