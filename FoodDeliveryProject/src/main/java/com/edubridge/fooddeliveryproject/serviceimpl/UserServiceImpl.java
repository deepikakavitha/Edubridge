package com.edubridge.fooddeliveryproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.fooddeliveryproject.exception.UserNotFoundException;
import com.edubridge.fooddeliveryproject.model.User;
import com.edubridge.fooddeliveryproject.repository.UserRepository;
import com.edubridge.fooddeliveryproject.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
private UserRepository userRepository;
	
	 public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
 
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}
	@Override
	public User loginUser(User user) {
		
		return this.userRepository.findByEmailIDAndPassword(user.emailID,user.password).orElseThrow(()->new UserNotFoundException("User ", "EmailId", user.emailID+" and password "+user.password) );
	}
	

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserByEmailID(String emailID) {
		// TODO Auto-generated method stub
		return userRepository.findByEmailID(emailID).orElseThrow(()->new UserNotFoundException("User","EmailID",emailID));

	}

	@Override
	public void deleteUser(String emailID) {
		// TODO Auto-generated method stub
		  userRepository.findByEmailID(emailID).orElseThrow(()->new UserNotFoundException("User","EmailID",emailID));
		  userRepository.deleteByEmailID(emailID);
	}

	@Override
	public User updateUser(User user, String emailID) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public User updateUser(User user, String emailID) {
		// TODO Auto-generated method stub
		User existingBooking=userRepository.findByEmailID(emailID).orElseThrow(()->new UserNotFoundException("User","EmailID",emailID));
		existingUser.setfirstName(user. getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setPassword(user.getPassword());
		existingUser.setRole(user.getRole());
		existingUser.setMobile_No(user.getMobile_No());
		existingUser.setState(user.getState());
		existingUser.setZipCode(user.getZipCode());
		existingUser.setStreet (user.getStreet());
		existingUser.setCity(user.getCity());
		userRepository.save(existingUser);
		return existingUser;
	} */

	
}

