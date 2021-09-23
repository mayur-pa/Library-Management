package com.quest.user.VO;



public class Books {

	private Long bookId;
    private String bookName;
    private String subject;
    private int quantity;
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(Long bookId, String bookName, String subject, int quantity) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.subject = subject;
		this.quantity = quantity;
	}
  


}
