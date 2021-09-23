package com.quest.books.service;

import com.quest.books.model.Books;
import com.quest.books.repository.BooksRepository;
import java.util.List;
import java.awt.print.Book;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BooksService {

    @Autowired
    private BooksRepository booksRepository;
    
    public Books saveBook(Books book) {
		// TODO Auto-generated method stub
		return booksRepository.save(book);
	}

 public Books findBookById(int bookId) {
		// TODO Auto-generated method stub
		return booksRepository.findBooksByBookId(bookId);
	}
 
 public Books updateBook(Books book) {
		// TODO Auto-generated method stub
		return booksRepository.save(book);
	}

	public String deleteBook(int bookId) {
		booksRepository.deleteById(bookId);
		// TODO Auto-generated method stub
		return "Delete Done";
	}
	
public List<Books> getfilterBookBySubject(String subject) {
		// TODO Auto-generated method stub
		 return booksRepository.findBySubject(subject);
	}

	
	public List<Books> getallBook() {
		// TODO Auto-generated method stub
		return (List<Books>) booksRepository.findAll();
	}

	

}
