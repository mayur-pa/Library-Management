package com.quest.user.service;

import com.quest.user.VO.Books;
import com.quest.user.VO.ResponseTemplateVO;
import com.quest.user.entity.BookIssue;
import com.quest.user.entity.User;
import com.quest.user.repository.BookIssueRepository;
import com.quest.user.repository.UserRepository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service

public class UserService<IssuedBook> {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private BookIssueRepository bookIssueRepository;
    
	
    public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
    
    public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userRepository.findByUserId(userId);
	}
    
    public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
    public String deleteUser(int userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
		return "User Deleted";
	}
    public List<User> getallUser() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}
    
    public BookIssue saveBookIssue(BookIssue issuedbook) {
		// TODO Auto-generated method stub
		return bookIssueRepository.save(issuedbook);
	}

    public String saveBook(Books book) {
		// TODO Auto-generated method stub
		 HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<Books> entity = new HttpEntity<Books>(book,headers);
	      return restTemplate.exchange(
	         "http://localhost:8098/books/save", HttpMethod.POST, entity, String.class).getBody();
	   }

   public String deleteBook(int bookId) {
		// TODO Auto-generated method stub
		 HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<Books> entity = new HttpEntity<Books>(headers);
	      System.out.println("userService");
	      return restTemplate.exchange(
	    		  "http://localhost:8098/books/delete/"+bookId, HttpMethod.DELETE, entity, String.class).getBody();
	   }
   public String getallBook() {
		// TODO Auto-generated method stub
		 HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      return restTemplate.exchange(
	    		  "http://localhost:8098/books/get", HttpMethod.GET, entity, String.class).getBody();
	   }
    public String getallSortedBook() {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      return restTemplate.exchange(
	    		  "http://localhost:8098/books/getsortedbook", HttpMethod.GET, entity, String.class).getBody();
	   }
    public String filterBookBySubject(String subject) {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      return restTemplate.exchange(
	    		  "http://localhost:8098/books/getfilterbook/"+subject, HttpMethod.GET, entity, String.class).getBody();
	}
    

	public ResponseTemplateVO getUserWithBooks(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}

