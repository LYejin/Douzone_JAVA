import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		
		//반복문 (while, do ~ while)
//		int i = 10;
//		while (i>=10) { //true
//			// 반드시
//			// 증가감을 통해서 true, false 판단
//
//			// --i; -> 9 
//			System.out.println(i);
//			// --i; -> 10
//		}
		
		// while 1~100까지의 합
		int j = 1;
		int sum = 0;
		while (j<=100) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		
		
		// while(true) {} 메뉴만들어서 ...
		// while로 구구단 만들기
		int i = 1;
		int z = 1;
		while (i <= 9) {
			z = 1;
			while (z <=9) {
				System.out.printf("%d * %d = %d \n", i, z, i*z);
				z++;
			}
			i++; // 마지막 10
		}
		
		// for (;;) {if (조건) break;}
		// while(true) {if(조건) break; }
		// do ~ while : 일단 한버은 강제적으로 수행 ... 그리고 조건을 보고 판단한다
		// do {실행블럭} while (조건판단)
		/*
		 메뉴구성
		 점심 메뉴를 선택하세요
		 1. 짜장
		 2. 짬뽕
		 3번 입력값 하면 잘못된 입력입니다 ...
		 다시 메뉴를 보여주기 
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		int inputData = 0;
		do {
			System.out.print("숫자 입력해 (0~9) : ");
			inputData = Integer.parseInt(sc.nextLine());
		} while (inputData >= 10); // while 조건 true 계속해서 do문을 실행
									// while 조건 false do 실행하지 않는다
		System.out.println("당신이 입력한 숫자는 : " + inputData);
	}

}
