import java.util.Scanner;

public class DrinkMain {

	public static void main(String[] args) { // 메인은 적게 만드는게 좋타
		DoWhileMenu menu = new DoWhileMenu();
		PayMethod payMethod = new PayMethod();
		Drink_Select_Menu drinkSelectMenu = new Drink_Select_Menu(payMethod);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			switch (menu.displayMenu()) {
				case 1: drinkSelectMenu.drinkSelectMenu(); // 음료 선택 
						break;
				case 2: System.out.println("자판기에 넣을 현금을 입력해주세요 : ");
						int num = Integer.parseInt(sc.nextLine());
						payMethod.inputCash(num);
						break;
				case 3: payMethod.outputCashPrint();
						break;
				case 4: System.out.println("프로그램 종료");
			    		//return;  >> main 함수 종료
			    		System.exit(0); //프로그램 종료(kill)
			}
		}

	}

}
