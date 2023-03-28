package kr.or.kosa.dto;

import java.util.Scanner;

public class Cinema {
	private String seatNumber; // 좌석 번호 
	private String resNumber; // 예매 번호 
	private boolean TF = false; // 예매가 되어있는지 
	Scanner sc = new Scanner(System.in);
	
	public Cinema(String seatNumber) {
		this.seatNumber = seatNumber;
		String ran = "";
		for (int i = 0; i < 7; i++) { ran += (int)(Math.random()*10 +1); }
		this.resNumber = ran;
		this.TF = false;
	}
	
	public boolean isTF() {
		return TF;
	}

	public void setTF(boolean tF) {
		TF = tF;
	}

	public String getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	public String getResNumber() {
		return resNumber;
	}
	
	public void setResNumber(String resNumber) {
		this.resNumber = resNumber;
	}
	
	// 예매하기
	public void reservation() {
		int num = -1;
		if (this.TF != true) {
			System.out.println();
			System.out.println("예매 가능합니다. 예매하시겠습니까?");
			System.out.println("네(1), 아니오(2), 초기화면(0) 중 하나를 입력해주세요.");
			num = sc.nextInt();
			switch (num) {
			case 1 : this.TF = true;
					System.out.println("\n예매가 완료되었습니다.");
					System.out.printf("예매한 좌석번호: [%s]/ 예매번호:[%s]", this.seatNumber, this.resNumber);
					System.out.println("감사합니다.");
					break;
			case 2 : System.out.println("\n예매를 중지하고 초기화면으로 돌아갑니다.");
					break;
			case 0 : System.out.println("\n초기화면으로 돌아갑니다.");
					break;
			default : System.out.println("\n올바른 예매번호를 입력해주세요.");
			}
		} else {
			System.out.println("\n이미 예매된 좌석입니다.");
		}
	}
	
	// 예매조회
	public void reservationSearch() {
		System.out.println();
		System.out.printf("고객님이 예매하신 좌석은 %s입니다.\n", this.seatNumber);
	}
	
	// 예매취소
	public void reservationFalse() {
		System.out.printf("고객님이 예매하신 좌석은 %s입니다.\n", this.seatNumber);
		System.out.println();
		System.out.println("예매를 취소하시곘습니까?");
		System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
		int number = sc.nextInt();
		if (number == 1) {
			this.TF = false;
			System.out.println("\n예매가 취소되었습니다. 감사합니다.");
		} else {
			System.out.println("\n초기화면으로 돌아갑니다.");
		}
		
	}
}
