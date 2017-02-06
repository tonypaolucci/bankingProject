package com.bankOps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileStore;
import java.nio.file.Path;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Login {
	
	public Login()
	{
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

	public User checkUsers(String userN, String pass)
	{
		User u = getUser(userN, pass);
		boolean found = false;
		User inUser = new User();
		Accounts inAccount = new Accounts();
		//file read implementtation
		//ArrayList<User> usrList = new ArrayList();
		
		/*try {
			Scanner info = new Scanner(new File("D://Godfather00//Documents//eclipse_workspace//servletLab//VikingBank//userAccounts.csv"));
			
			while(info.hasNextLine() && !found);
			{
				String data = info.nextLine();
				String[] usrList = data.split(","); 
				
				inUser.setUsername(usrList[0]);
				inUser.setPassword(usrList[1]);
				inUser.setCustNum(usrList[2]);
				inUser.setFirstName(usrList[3]);
				inUser.setLastName(usrList[4]);
				inUser.setAddress(usrList[5]);
				inUser.setPhone(usrList[6]);
				inUser.setEmail(usrList[7]);
				inAccount.setacctNum(usrList[8]);
				inAccount.setcustNum(usrList[9]);
				inAccount.setBalance(Double.parseDouble(usrList[10]));
				inAccount.setAcctOpenDate(Date.valueOf(usrList[11]));
				inAccount.setAcctType(usrList[12]);
				inUser.setAcctList(inAccount);
				
				if(Objects.equals(userN, inUser.getUsername()) && Objects.equals(passW, inUser.getPassword()))
				{
					found = true;
					loggedIn = true;
				}
				else
				{
					
					loggedIn = false;
				}
				
			}
			if(found)
			{
				return inUser;
			}
			else
			{
				return null;
			}
			//usrList.add
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}*/
		
		//TODO check passed parameters with real data. hardcode for now use file later
		if(Objects.equals(userN, "dollabillz45") && Objects.equals(passW, "12345"))
		{
			found = true;
			loggedIn = true;
		}
		else
		{
			
			loggedIn = false;
		}
		return u;
	}
	
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassW() {
		return passW;
	}

	public void setPassW(String passW) {
		this.passW = passW;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser(String firstNm, String lastNm)
	{
		String input = "";
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
	
	private String uName;
	private String fName;
	private String lName;
	private String passW;
	private User user;
	private boolean loggedIn;
}
