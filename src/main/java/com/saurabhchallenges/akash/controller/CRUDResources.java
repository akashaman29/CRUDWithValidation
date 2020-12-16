package com.saurabhchallenges.akash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurabhchallenges.akash.entity.User;
import com.saurabhchallenges.akash.service.CRUDService;

@RestController
@RequestMapping("/takraoge")
public class CRUDResources {
	
	@Autowired
	CRUDService crudService;
	
	@GetMapping("/saareUsers")
	public List<User> getUserDetails(){
		
		List<User> listUsers = crudService.getAllUsers();
		
		return listUsers;
	}
	
	@PostMapping("/createuser")
	public ResponseEntity<String> createNewUser(@RequestBody(required = true) User user){
		boolean creation = crudService.createNewUser(user);
		if(creation)
			return new ResponseEntity<>(HttpStatus.CREATED);
	return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}
	
	@GetMapping("/getoneuser/{id}")
	public User getUserById(@PathVariable Long id){
		User oneUser = crudService.getUser(id);
		if(oneUser!=null)
			return oneUser;
	return null;
	}

}
