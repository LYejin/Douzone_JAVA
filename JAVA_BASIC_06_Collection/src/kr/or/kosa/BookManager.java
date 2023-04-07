package kr.or.kosa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookManager {
	HashMap<Integer, Book> hsBook; // <ISBN, Book>
	Scanner sc = new Scanner(System.in);
	
	public BookManager() {
		hsBook = new HashMap<>();
	}
	
	// 도서 추가
	public void bookAdd(int ISBN, String title, int price) {
		if (hsBook.containsKey(ISBN)) {
			System.out.println("존재하는 ISBN 코드입니다. 다른 ISBN 코드를 사용해 주세요.");
		} else {
			hsBook.put(ISBN, new Book(ISBN, title, price));
			Book book = hsBook.get(ISBN);
			System.out.println(book + " 생성하였습니다.");
		}
	}
	
	
	// 도서 삭제 
	public void bookRemove(int ISBN) {
		hsBook.remove(ISBN);
	} 
	
	
	// 도서 검색
	public void bookSearch(int ISBN) {
		if (hsBook.containsKey(ISBN)) {
			Book book = hsBook.get(ISBN);
			System.out.println("검색 결과>>"+book);
		} else {
			System.out.println("찾는 도서가 없습니다");
		}
	} 
	
	// 도서 목록 
	public void bookList() {
		System.out.println("도서 수:" + hsBook.size());
		for(Map.Entry m : hsBook.entrySet()) {
			System.out.println(m.getValue());
		}
	} 
	
	// ISBN 목록
	public void ISBNList() {
		System.out.println("도서 수:" + hsBook.size());
		for(Map.Entry m : hsBook.entrySet()) {
			System.out.println(m.getKey());
		}
	} 
	
	public void Run() { // 실행문
		int num =-1;
		
		while (num != 0) {
			System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료");
			num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1 : // 추가 
				System.out.print("추가할 도서 ISBN:");
				int book = Integer.parseInt(sc.nextLine());
				System.out.print("도서 제목:");
				String title = sc.nextLine();
				System.out.print("가격:");
				int price = Integer.parseInt(sc.nextLine());
				bookAdd(book, title, price);
				break;
			case 2 : // 삭제 
				System.out.print("삭제할 도서 ISBN:");
				int bookRemoveISBN = Integer.parseInt(sc.nextLine());
				bookRemove(bookRemoveISBN);
				System.out.println("삭제했습니다.");
				break;
			case 3 : // 검색 
				System.out.print("검색할 도서 ISBN:");
				int bookSearchISBN = Integer.parseInt(sc.nextLine());
				bookSearch(bookSearchISBN);
				break;
			case 4 : // 도서 목록 
				bookList();
				break;
			case 5 : // ISBN 목록 
				ISBNList();
				break;
			case 0 :
				System.out.println("종료합니다.");
				System.exit(0);
				break;
			default :
				System.out.println("메뉴에 있는 번호를 선택해주세요");
			
		}
			
		}
	}
}
