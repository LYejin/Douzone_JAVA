import java.util.Scanner;

//class BankUser {
//		public int balance;
//}

public class Ex11_Statement_Quiz {
	public static void main(String[] args) {
		// 메뉴를 보여주고 사용자에 선택 ...
		// 원하시는 메뉴를 선택하지 않으면 강제로 다시 메뉴를 보여주세요
		
		//1.예금 -> 예금 넣어주기 
		//2.출금
		//3.잔고
		//4.종료
		
		//예금 처리
		//잔액 변수를 생성 (balance)
		//예금 처리 +로 누적
		//출금 처리 -로 누적
		//잔고	balance 누적
		//종료	프로그램 끝 (함수의 종료, 프로그램의 강제 종료)
		
		
		/// 내가 작성한 거 
//		int input = 0;
//		int output = 0;
//		BankUser user1 = new BankUser();
//		
//		Scanner sc = new Scanner(System.in);
//		int exit = 1;
//		
//		
//		System.out.println("안녕하세요. 더존은행입니다.");
//		
//		do {
//			System.out.print("어떤 작업을 수행하시길 원하십니까?(예금, 출금, 잔고, 종료 입력) : ");
//			
//			String answer = sc.nextLine();
//			
//			switch (answer) {
//				case "예금" : System.out.print("예금입니다. 금액을 적어주세요 : "); 
//							input = Integer.parseInt(sc.nextLine()); 
//							user1.balance += input; 
//							break;
//				case "출금" : System.out.print("출금입니다. 금액을 적어주세요 : "); input = Integer.parseInt(sc.nextLine()); user1.balance -= input; break;
//				case "잔고" : System.out.println("잔고입니다. 잔고를 확인하세요 : " + user1.balance); break;
//				default : System.out.println("잘못된 입력입니다. 다시 입력해주세요"); continue;
//			}
//			
//			System.out.print("프로그램을 종료하시려면 0을 입력해주세요(계속 진행 원할시 0과 다른 숫자 입력) : ");
//			exit = Integer.parseInt(sc.nextLine());
//		} while (exit !=0 );
//		
//		System.out.println("더존은행을 이용해주셔서 감사합니다!");
		
		// 진호조장님이 작성한 코드 
		
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		int input;
		int output;
		
		System.out.println("안녕하세요");
		System.out.println("진호네 금고입니다");
		while(true) {			
			System.out.println("1.예금 2.출금 3.잔고 확인 4.종료");
			System.out.print("원하시는 메뉴를 선택해주세요 : ");
			
			
			int menu = Integer.parseInt(sc.nextLine());
			if(menu==1) {
				System.out.println();
				System.out.println("예금을 선택하셨습니다");
				System.out.print("금액을 입력해주세요 : ");
				input = Integer.parseInt(sc.nextLine());
				System.out.println(input + "원이 예금 되었습니다");
				System.out.println();
				balance += input;
			}else if(menu==2) {
				System.out.println();
				System.out.println("출금을 선택하셨습니다");
				System.out.print("금액을 입력해주세요 : ");
				output = Integer.parseInt(sc.nextLine());
				if((balance-output)<0) {
					System.out.println();
					System.out.println("잔액이 부족합니다");
					System.out.println("메뉴로 돌아갑니다");
					System.out.println();
				}else {
					System.out.println(output + "원이 출금 되었습니다");
					System.out.println();
					balance -= output;
				}
			}else if(menu==3) {
				System.out.println();
				System.out.println("잔액 조회를 선택하셨습니다");
				System.out.println("현재 잔액은 " + balance + "원 입니다");
				System.out.println();
			}else if(menu==4) {
				System.out.println();
				System.out.println("프로그램을 종료합니다");
				System.out.println("이용해주셔서 감사합니다");
				break;
			}else {
				System.out.println();
				System.out.println("잘못된 입력입니다");
				System.out.println("메뉴를 다시 선택해주세요");
				System.out.println();
			}
			
			//개발자가 선호하는 코드
			// boolean으로 false를 만들어 마지막에 if문으로 break 건다
		}
		
		
		}
		
		
	}

