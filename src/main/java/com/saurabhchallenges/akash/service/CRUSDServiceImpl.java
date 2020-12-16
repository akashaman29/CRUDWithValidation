package com.saurabhchallenges.akash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurabhchallenges.akash.entity.User;
import com.saurabhchallenges.akash.repo.DAOLayerRepo;

@Service
public class CRUSDServiceImpl implements CRUDService {

	@Autowired
	DAOLayerRepo daoLayerRepo;
	
	@Override
	public List<User> getAllUsers() {
		List<User> allUsers = daoLayerRepo.findAll();
		
		return allUsers;
	}

	@Override
	public boolean createNewUser(User user) {
		
		return false;
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
