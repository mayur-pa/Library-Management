package com.quest.user.VO;

import com.quest.user.entity.User;


public class ResponseTemplateVO {

    private User user;
    private Books books;
	public User getUser() {
		return user;
	}
	public ResponseTemplateVO() {
		super();
	}
	public ResponseTemplateVO(User user, Books books) {
		super();
		this.user = user;
		this.books = books;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
}
