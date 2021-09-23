package com.quest.books.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.quest.books.model.Books;
import com.quest.books.repository.BooksRepository;

class BooksServiceTests {

	@InjectMocks
	BooksService lg=new BooksService();

	@Mock
	BooksRepository booksRepo;

	@BeforeEach
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void saveBook() {
		Books book=new Books();
		when(booksRepo.save(book)).thenReturn(book);
		Books bk=lg.saveBook(book);
		assertNotNull(bk);
	}

	@Test
	public void findBookByIdTest() {
		Books book= new Books();
		when(booksRepo.findBooksByBookId(3)).thenReturn(book);
		Books bk=lg.findBookById(1);
		assertNotNull(bk);
	}

	@Test
	public void updateBookTest() {
		Books book= new Books();
		when(booksRepo.save(book)).thenReturn(book);
		Books bk=lg.updateBook(book);
		assertNotNull(bk);
	}

	@Test
	public void deleteBookTest() {
		//when(springRepo.deleteById(1)).thenReturn("deleted");
		String bk=lg.deleteBook(3);
		assertEquals(bk, lg.deleteBook(3));

	}

	@Test
	public void getfilterBookBySubjectTest() {
		List<Books> list=new ArrayList<Books>();
		when(booksRepo.findBySubject("Science")).thenReturn(list);
		List<Books> bk=lg.getfilterBookBySubject("Science");
		assertNotNull(bk);
	}

}

