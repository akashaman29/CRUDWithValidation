package com.saurabhchallenges.akash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern.Flag;

@Entity
@Table(name="user_Details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name should not be blank")
	private String first_name;
	
	@NotBlank(message = "Name should not be blank")
	private String last_name;
	
	@Email(flags = Flag.CASE_INSENSITIVE, regexp = "*.@*.com")
	private String email;

	public User(@NotBlank(message = "Name should not be blank") String first_name,
			@NotBlank(message = "Name should not be blank") String last_name,
			@Email(flags = Flag.CASE_INSENSITIVE, regexp = "*.@*.com") String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
