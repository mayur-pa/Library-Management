package com.quest.user.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import com.quest.user.VO.Books;
import com.quest.user.entity.User;
import com.quest.user.service.UserService;

public class UserControllerTests {

	@InjectMocks
	UserController lg=new UserController();
	
	@Mock
	UserService service;
	
	@Mock
	RestTemplate restTemp;
	

    @Before
    public void setUp() throws Exception {

         MockitoAnnotations.initMocks(this);
         
    }
	
    @Test
	public void saveUserTest() {
		User user = new User();
        when(service.saveUser(user)).thenReturn(user);
        User usr=lg.saveUser(user);
        assertNotNull(usr);
	}
	
    @Test
	public void getUserByIDTest() {
    	User user= new User();
		when(service.getUserById(3)).thenReturn(user);
		User usr=lg.getUserByID(3);
		assertNotNull(usr);
	}
    
    @Test
	public void updateUserTest() {
    	User user= new User();
		when(service.updateUser(user)).thenReturn(user);
		User usr=lg.updateUser(user);
		assertNotNull(usr);
	}
    
    @Test
	public void deleteUserTest() {
		when(service.deleteUser(3)).thenReturn("Delete Done");
		String usr=lg.deleteUser(3);
		assertEquals(usr, "Delete Done");
	}
    
    @Test
	public void getAllUserDetailsTest() {
		List<User> list=new ArrayList<User>();
		when(service.getallUser()).thenReturn(list);
		List<User> usr=lg.getallUserDetails();
		assertNotNull(usr);
	}
  
	@Test
	public void saveBook() {
		Books book=new Books();
	when(service.saveBook(book)).thenReturn("Added");
		String books=lg.saveBook(book);
		assertNotNull(books);
		}
	
	@Test
	public void deleteBookTest() {
		when(service.deleteBook(3)).thenReturn("Delete Done");
		String books=lg.deleteBook(3);
		assertNotNull(books);
		}
	
	
}
