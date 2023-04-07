package kr.or.kosa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Transaction { // 거래 내역 
	Calendar nowCalendar = Calendar.getInstance();
	Date nowDate = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	String strNowDate = sdf.format(nowDate);
	
	private String transactionData; // 거래일 -> 2020sus 08월 26일 
	private String transactionTime; // 거래시간 -> 11시 53분 
	private String kind; // 구분 (임급 또는 출금) -> 구분...?
	private long amount; // 거래 금액 -> 거래금액 받아와서 
	private long balance; // 잔고 -> 잔고 수정 보여주기 식 
	
	// 구분으로 받아와서 거래 금액 만큼 빼주고 더하고 
	public Transaction(String kind, long amount, long balance) {
		this.transactionData =  nowCalendar.get(Calendar.YEAR) + "년" + (nowCalendar.get(Calendar.MONTH) + 1) + "월" + nowCalendar.get(Calendar.DAY_OF_MONTH) + "일" ;
		this.transactionTime = strNowDate;
		this.balance = 0;
		this.kind = kind;
		if (kind.equals("입금")) {
			this.balance = balance + amount;
		} else if (kind.equals("출금")) {
			this.balance = balance - amount;
		} else {
			System.out.println("입금, 출금에 오류가 생겼습니다.");
		}
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "[" + transactionData + transactionTime + " "
				+ kind + "금액 : " + amount + " 잔고 : " + this.balance + "]";
	}
	
	
}
