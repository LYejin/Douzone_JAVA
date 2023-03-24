import java.util.Scanner;

public class DoWhileMenu {
	Scanner sc = new Scanner(System.in);
	
	public int displayMenu() {
		System.out.println("**************");
		System.out.println("***음료 자판기***");
		System.out.println("1.음료 고르기"); // 완료 
		System.out.println();
		System.out.println("2.현금 넣기"); // 만들기 
		System.out.println();
		System.out.println("3.거스름돈 빼기");
		System.out.println();
		System.out.println("4.프로그램 종료");
		System.out.println();
		
		int menu = 0;
		
		do {
			try {
				menu = Integer.parseInt(sc.nextLine()); //1 or 2 입력 
				if(menu >= 1 && menu <= 4) {
					break; //do~while 탈출
				}else {
					//1보다 작고 4 보다 큰값
					//나는 실제 오류가 아니지만 (예외가 아니지만)
					//이런 상황을 예외를 만들 수 있어요
					throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
				}
			}catch (Exception e) {
				System.out.println("원인파일 : " + e.getMessage());
				System.out.println("메뉴 선택 문제 발생");
				System.out.println("1~4까지 번호만 입력해주세요");
			}
		} while(true);
		
		//1~4까지 중 하나를 선택했다면
		return menu;
	}
}
