package com.bankOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileStore;
import java.nio.file.Path;

public class Login {
	
	public Login()
	{
		fName = "bob";
		lName = "mcgee";
		passW = "2345";
		user = new User();
		loggedIn = false;
	}
	
	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPassword() {
		return passW;
	}

	public void setPassword(String password) {
		this.passW = password;
	}

	public User checkUsers(String firstNm, String lastNm, String pass)
	{
		User u = getUser(firstNm, lastNm);
		if(firstNm == fName && lastNm == lName && pass == passW)
		{
			
			loggedIn = true;
		}
		else
		{
			loggedIn = false;
		}
		return u;
	}
	
	public User getUser(String firstNm, String lastNm)
	{
//		String input = "";
//		try {
//			FileSystems fs;
//			FileInputStream inFile; 
//			//fs = new FileSystems();
//			inFile = new FileInputStream("./userData.csv");
//			for(;inFile.available() > 0;)
//			{
//				//input = inFile.
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		User u = new User();
		
		
		return u;
	}
	
	
	private String fName;
	private String lName;
	private String passW;
	private User user;
	private boolean loggedIn;
}
