package com.bitwise.userProfile;

import java.util.HashMap;

public class UserDetails {
	private static HashMap<String, String> userLoginDatabase = new HashMap<String, String>();
	private static HashMap<String, Profile> userDetails = new HashMap<String, Profile>();
	
	public UserDetails() {
		super();
		userLoginDatabase.put("simar", "simar");
		userLoginDatabase.put("abc", "abc");
		userLoginDatabase.put("anuja", "anuja");
	}
	
	HashMap<String, String> getUserLogin(){
		return userLoginDatabase;
	}
	
	HashMap<String, Profile> getUserDetails(){
		return userDetails;
	}
}
