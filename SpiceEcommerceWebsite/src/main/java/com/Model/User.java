package com.Model;

public class User {
	private String username;
<<<<<<< HEAD
	private String email;
	private String password;
	public User(String username, String email, String password) {
		super();
		this.username = username;
=======
	private String name;
	private String email;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(String username, String name, String email, String password) {
		super();
		this.username = username;
		this.name = name;
>>>>>>> 2c8e4ea5c63bf2d3981c2e9270c169af1ab3771d
		this.email = email;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
}
