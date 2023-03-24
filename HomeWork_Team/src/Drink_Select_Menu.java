import java.util.Scanner;

public class Drink_Select_Menu {
	Scanner sc = new Scanner(System.in);
	PayMethod payMethod;
	
	public Drink_Select_Menu(PayMethod payMethod) {
		this.payMethod = payMethod;
	}
	
	// drink 생성
	public Drink coke = new Drink("코카콜라", 1800, 10, false, "캔"); // 음료
	public Drink cider = new Drink("사이다", 1500, 10, true, "플라스틱"); // 음료
	public Drink milkis = new Drink("밀키스", 1900, 10, true, "플라스틱"); // 음료
	public Drink cocopalm = new Drink("코코팜", 1000, 10, true, "플라스틱"); // 음료
	
	// 반복해야되는 부분이 많다...
	
	int menu = 0;
	
	public void drinkSelect(int menuNum) {
		switch (menuNum) {
			case 1: if (coke.drinkCntMinus() == 0 ) {break;}
					System.out.println("코카콜라가 나왔습니다");
					this.payMethod.useCash(coke.getDrinkPrice());
					break;
			case 2: if (cider.drinkCntMinus() == 0 ) {break;}
					System.out.println("사이다가 나왔습니다");
					cider.drinkCntMinus();	
					this.payMethod.useCash(cider.getDrinkPrice());
					break;
			case 3: if (milkis.drinkCntMinus() == 0 ) {break;}
					System.out.println("밀키스가 나왔습니다"); 
					milkis.drinkCntMinus();
					this.payMethod.useCash(milkis.getDrinkPrice());
					break;
			case 4: if (cocopalm.drinkCntMinus() == 0 ) {break;}
					System.out.println("코코팜이 나왔습니다");
					cocopalm.drinkCntMinus();
					this.payMethod.useCash(cocopalm.getDrinkPrice());
					break;
			case 5: System.out.println("메뉴로 돌아갑니다"); 
					break;
		}
	}
	
	public void drinkSelectMenu() {
		System.out.println();
		System.out.println("***음료 선택***"); // 음료의 종류가 최대 몇개가 들어갈 수 있는지 설정해줘야 할 듯 
		System.out.println("1. 코카콜라(2300원) : " + coke.getDrinkCnt() + "개 남았습니다"); // -> 이후 음료 선택 -> 결제 
		System.out.println();
		System.out.println("2. 사이다(1500원) : " + cider.getDrinkCnt() + "개 남았습니다");
		System.out.println();
		System.out.println("3. 밀키스(1900원) : " + milkis.getDrinkCnt() + "개 남았습니다");
		System.out.println();
		System.out.println("4. 코코팜(1000원) : " + cocopalm.getDrinkCnt() + "개 남았습니다");
		System.out.println();
		System.out.println("5. 선택 안함");
		System.out.println();
		System.out.println();
		
		do {
			try {
				menu = Integer.parseInt(sc.nextLine());
				if (menu>=1 && menu<=5) {
						if(payMethod.noCash(menu) == 1) { break; }; // 돈이 만약 없을 때
						drinkSelect(menu);
						break;
				} else {
					throw new Exception("음료 선택 번호가 잘못 되었습니다.");
				}
			} catch(Exception e) {
				System.out.println("원인 파일 : " + e.getMessage());
				System.out.println("음료 메뉴 선택 문제 발생");
				System.out.println("1~5까지 번호만 입력해주세요");
			}
		} while (true);
		
	}
	
	
}
