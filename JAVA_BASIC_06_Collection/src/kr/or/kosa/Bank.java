package kr.or.kosa;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts = new ArrayList<>(); // 계좌 (0개이상)
	private int totalAccount; // 총계좌수 
	
	
	public void addAccount(String accountNo, String name) { //계좌 생성 
		accounts.add(new Account(accountNo, name));
	}
	
	public Account getAccount(String accountNo) { // 계좌 찾기 (계좌번호로)
		for (Account account : accounts) {
			if (account.getAccountNo2().equals(accountNo)) {
				return account;
			}
		}
		return null;
	}
	
	public List<Account> findAccounts(String name) { // 계좌 찾기 (소유자명으로) 계좌가 여러 개일 수 있음
		List<Account> findAccounts = new ArrayList<>();
		for (Account account : accounts) {
			if (account.getAccountNo2().equals(name)) {
				findAccounts.add(account);
			}
		}
		return findAccounts;
	}
	
	public List<Account> getAccounts() { // 계좌 목록 보기 
		return accounts;
	}
	
	public int getTotalAccount() { // 총계좌수 반
		return totalAccount;
	}
}
