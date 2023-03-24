
public class Drink {
	private String drinkType; // 음료 종류
	private int drinkCnt; // 음료 수량
	private int drinkPrice; // 음료 가격
	private boolean drinkHead; // 음료 뚜껑
	private String drinkBody; // 음료 재질

	public Drink(String drinkType, int drinkPrice, int drinkCnt, boolean drinkHead, String drinkBody) { // 기본 설정
		this.drinkType = drinkType;
		this.drinkPrice = drinkPrice;
		this.drinkCnt = drinkCnt;
		this.drinkHead = drinkHead;
		this.drinkBody = drinkBody;
	}

	public int drinkCntMinus() {
		if (drinkCnt <= 0) {
			System.out.println("음료 없습니다. 다른 음료를 선택해주세요."); // 남은 음료가 0개
			return 0;
		} else {
			drinkCnt--; // 남은 음료가 1개 이상
			return 1;
		}
	}

	public int getDrinkCnt() {
		return drinkCnt;
	}

	public void setDrinkCnt(int drinkCnt) {
		this.drinkCnt = drinkCnt;
	}

	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	public void setDrinkPrice(int drinkPrice) {
		this.drinkPrice = drinkPrice;
	}

	public int getDrinkPrice() {
		return drinkPrice;
	}
}
