package kr.or.kosa;

import java.util.Scanner;

public class FlowChart {
	
	public static void main(String[] args) {
		int unit = 10000; //화폐단위 
		int num = 0; // 화폐매수 
		int sw = 0; // 스위칭 변수, 화폐의 다음 단위를 위해 
		int money; // 입력받는 금액 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("돈을 입력해주세요 : ");
		money = Integer.parseInt(sc.nextLine());
		
		
		while (true) {
			num = (int) (money/unit);
			System.out.printf("%d %d개 \n", unit, num);
		
			if (unit<=1) break;	
			
			money = money - (unit*num);
			if (sw == 0) {
				unit = unit/2;	
				sw=1;
			} else {
				unit = unit/5;	
				sw=0;
			} 
		}
	}
}
