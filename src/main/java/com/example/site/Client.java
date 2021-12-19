package com.example.site;

public class Client {
	
	private String username;
	private String password;
	
	public Client() {
		super();
	}
	
	public Client(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Client [username=" + username + ", password=" + password + "]";
	}
	
}
