package com.quest.user.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookIssue {


		 @Id
		 @GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private int bookId;
		private LocalDate issueDate= LocalDate.now();
		private LocalDate returnDate=issueDate.plusDays(15);
		private int userId;
		public int getBookId() {
			return bookId;
		}
		public BookIssue() {
			super();
		}
		public BookIssue(int id, LocalDate returnDate) {
			super();
			this.id = id;
			this.returnDate = returnDate;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public LocalDate getReturnDate() {
			return returnDate;
		}
		public void setReturnDate(LocalDate returnDate) {
			this.returnDate = returnDate;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public BookIssue(int bookId, LocalDate issueDate, int userId) {
			super();
			this.bookId = bookId;
			this.issueDate = issueDate;
			this.userId = userId;
		}
	
		public LocalDate getIssueDate() {
			return issueDate;
		}
		public void setIssueDate(LocalDate issueDate) {
			this.issueDate = issueDate;
		}
		
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
	}

