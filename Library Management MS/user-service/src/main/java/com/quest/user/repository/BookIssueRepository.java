package com.quest.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quest.user.entity.BookIssue;


public interface BookIssueRepository extends JpaRepository<BookIssue, Integer>{
	
}

