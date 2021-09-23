package com.quest.user.controller;

import com.quest.user.VO.Books;
import com.quest.user.VO.ResponseTemplateVO;
import com.quest.user.entity.BookIssue;
import com.quest.user.entity.User;
import com.quest.user.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController<ResponseTemplate> {

    @Autowired
    private UserService userService;
    @Autowired
	   RestTemplate restTemplate;
    

   @PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/getuser/{id}")
	public User getUserByID(@PathVariable("id")int userId) {
		return userService.getUserById(userId);
		}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/deleteuser/{userId}")
	public String deleteUser(@PathVariable(value = "userId",required = true) int userId)
	{
		return userService.deleteUser(userId);
	}

	@GetMapping("/getalluser")
	public List<User> getallUserDetails() {
		return userService.getallUser();
	}
	@PostMapping("/bookissue")
	public BookIssue saveIssuedBook(@RequestBody BookIssue issuedbook) {
		return userService.saveBookIssue(issuedbook);
	}
	
	@PostMapping("/saveBook")
	public String saveBook(@RequestBody Books book) {
		System.out.println("saveBook userControl");
		return userService.saveBook(book);	
		
	}
	
	@DeleteMapping("/userdeleteBook/{bookId}")
		public String deleteBook(@PathVariable(value = "bookId",required = true) int bookId)
		{
			System.out.println("Controller");
		return userService.deleteBook(bookId);
		}
	
	@GetMapping("/getallbook")
	public String getallBookDetails() {
		return userService.getallBook();
	}
	
	
	@GetMapping("/getallsortedbook")
	public String getSortedBookDetails() {
		return userService.getallSortedBook();
	}
	
	@GetMapping("/filterbook/{subject}")
	public String filterBookBySubject(@PathVariable(value = "subject",required = true) String subject)
	{
		return userService.filterBookBySubject(subject);
	} 
	
}
