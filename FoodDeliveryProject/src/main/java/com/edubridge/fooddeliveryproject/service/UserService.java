package com.edubridge.fooddeliveryproject.service;

import java.util.List;

//import java.util.List;

import com.edubridge.fooddeliveryproject.model.User;

public interface UserService {
	User saveUser(User user);
	User loginUser(User user);
	//User updateUser(User user, String id);
	List<User> getUser();
	User getUserByEmailID(String emailID);
	//User updateUser(User user, String emailID);
	void deleteUser(String emailID);
	User updateUser(User user, String emailID);
	
	
	
/*	User updateUser(User user,long id);
	List<User> getAllUser();
	User getUserByEmail(User user);
	void deleteUser(User user);
	*/
	
}
