package com.saurabhchallenges.akash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saurabhchallenges.akash.entity.User;

@Service
public interface CRUDService {

	List<User> getAllUsers();

	boolean createNewUser(User user);

	User getUser(Long id);
	
}
