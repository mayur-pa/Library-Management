package com.quest.books.controller;

import com.quest.books.model.Books;
import com.quest.books.service.BooksService;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")

public class BooksController {

    @Autowired
    private BooksService booksService;

    //add book
    @PostMapping("/save")
	public Books saveBook(@RequestBody Books book) {
		return booksService.saveBook(book);
	}
    //find book by id
	@GetMapping("/{id}")
	public  Books getBookById(@PathVariable("id") int bookId) {
		
		return booksService.findBookById(bookId);
	}
	
	//update book
	@PutMapping("/update")
	public Books updateBook(@RequestBody Books book) {
		return booksService.updateBook(book);
	}

	//delete book
	@DeleteMapping("/delete/{bookId}")
	public String delete(@PathVariable(value = "bookId",required = true) int bookId)
	{
		System.out.println("BookController");
		return booksService.deleteBook(bookId);
	}
	
	//filter sort by subject
	@GetMapping("/getfilterbook/{subject}")
	public List<Books> getfilterBookBySubject(@PathVariable("subject") String subject) {
		List<Books> list=booksService.getfilterBookBySubject(subject);
		return list;
	}
	
	@GetMapping("/get")
	public List<Books> getallBookDetails() {
		return booksService.getallBook();
	}
	
 	
}
