package com.edubridge.fooddeliveryproject.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.fooddeliveryproject.model.User;
import com.edubridge.fooddeliveryproject.service.UserService;

//import antlr.collections.List;

@CrossOrigin(origins="http://localhost:50470")
@RestController //is controller which provides different end points to access the services 

@RequestMapping("/api/user")
public class UserController {
	 
	@Autowired
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
//Register
	@PostMapping("/register")
	public ResponseEntity< User> saveUser(@Valid @RequestBody  User user)
	{
		System.out.println("Wellcome to controller register "+user);
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.CREATED);
	}
//Login
	@PostMapping("/login")
	public  ResponseEntity<User> loginUser( @RequestBody User user)
	{
	 	return new ResponseEntity<User>(userService.loginUser(user),HttpStatus.OK);
	}
	@GetMapping
	public List<User> getUser() 
	{
		return userService.getUser();
	}
	
	 @GetMapping("{emailID}")
	public ResponseEntity<User> getUserByEmailID(@PathVariable("emailID") String emailID)
	{
		return new ResponseEntity<User>(userService.getUserByEmailID( emailID),HttpStatus.OK); 
	}
	 
	 @PutMapping("{emailID}")
	 public ResponseEntity<User> updateUser(@PathVariable("emailID") String emailID, @RequestBody User user)
	 {
		 return new ResponseEntity<User> (userService.updateUser(user, emailID), HttpStatus.OK);
	 }
	 
	 @DeleteMapping("{emailID}")
		public ResponseEntity<String> deleteUser(@PathVariable("emailID") String emailID)
		{
			userService.deleteUser(emailID);
			return new ResponseEntity<String>("User deleted successfully",HttpStatus.OK);
		}
}

	
		