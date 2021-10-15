package com.main.services;

public class LoginService {
	public boolean login(String username, String password) {
		if(username.equals("username") && password.equals("password")) {
			return true;
		}
		
		return false;
	}
}
