package kr.or.kosa;

import java.util.ArrayList;
import java.util.List;

public class Account { // 계좌 
	private String accountNo; // 계좌번호 
	private String name; // 소유자명 
	private long balance; // 잔고 
	private List<Transaction> transactions = new ArrayList<>(); // 거래 내역 (0개이상)
	
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
	}
	
	public Object getAccountNo() {
		return accountNo;
	}

	public Object getName() {
		return name;
	}
	
	public void deposit(long amount) { // 입금 
		System.out.println(amount + "원 입급하셨습니다.");
		transactions.add(new Transaction("입금", amount, this.balance));
		this.balance += amount;
		System.out.println("현재 잔액은 " + this.balance + "입니다.\n");
	}
	
	public void withdraw(long amount) { // 출금 
		long temp = this.balance - amount;
		if (temp < 0) {
			System.out.println("잔고가 부족해 인출할 수 없습니다.");
			return;
		}
		System.out.println(amount + "원 인출하셨습니다.");
		transactions.add(new Transaction("출금", amount, this.balance));
		this.balance -= amount;
		System.out.println("현재 잔액은 " + this.balance + "입니다.\n");
	}
	
	public long getBalance() { // 잔고 확인 
		return this.balance;
	}

	public Object getAccountNo2() {
		return accountNo;
	}
	
	public List<Transaction> getTransactions() { // 거래내역 보기
		return transactions;
	}

	@Override
	public String toString() {
		return "[계좌번호 : " + this.accountNo + ", 소유자 명 : " + this.name + ", 잔액 : " + this.balance + "]";
	}

	public int getNum() {
		return transactions.size();
	}
	
	
}
