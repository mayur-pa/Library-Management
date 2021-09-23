package com.quest.books.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.quest.books.model.Books;
import com.quest.books.service.BooksService;

class BooksControllerTests {

	@InjectMocks
	BooksController lg=new BooksController();
	
	@Mock
	BooksService service;
	
	@BeforeEach
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
    }
	@Test
	public void saveBook() {
		Books book=new Books();
	when(service.saveBook(book)).thenReturn(book);
		Books bk=lg.saveBook(book);
		assertNotNull(bk);
	}
	
	 @Test
		public void getBookByIdTest() {
	    	Books book= new Books();
			when(service.findBookById(3)).thenReturn(book);
			Books bk=lg.getBookById(3);
			assertNotNull(bk);
		}
	 @Test
		public void updateBookTest() {
	    	Books book= new Books();
			when(service.updateBook(book)).thenReturn(book);
			Books bk=lg.updateBook(book);
			assertNotNull(bk);
		}
	 
	 @Test
		public void deleteBookTest() {
		when(service.deleteBook(1)).thenReturn("Delete Done");
			String bk=lg.delete(1);
			assertEquals(bk, "Delete Done");
		}
	 
		 @Test
			public void getFilterBookBySubject() {
			 List<Books> list=new ArrayList<Books>();
				when(service.getfilterBookBySubject("Science")).thenReturn(list);
				List<Books> bk=lg.getfilterBookBySubject("Science");
				assertNotNull(bk);
			}

}
