package com.quest.books.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quest.books.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

	Books findBooksByBookId(int bookId);

	List<Books> findBySubject(String subject);




}
