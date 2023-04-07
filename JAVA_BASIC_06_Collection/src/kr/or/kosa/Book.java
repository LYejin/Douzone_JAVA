package kr.or.kosa;

public class Book {
	private int bookNumber;
	private String bookTitle;
	private int bookPrice;
	
	public Book(int bookNumber, String bookTitle, int bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "ISBN:" + bookNumber + " 이름:" + bookTitle + " 가격:" + bookPrice;
	}
}
