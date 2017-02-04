package com.bankOps;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class User {

	
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String custNum;
	private ArrayList<Accounts> acctList = new ArrayList<Accounts>();
	
	public Accounts createNew(String custName, String custNum, double startBal)
	{
		Accounts acc = new Accounts();
		Random rand = new Random();

		int  n = rand.nextInt(10000) + 1;
		//50 is the maximum and the 1 is our minimum 
		/*
		 * account num generation will be done here
		 */Date d = new Date();
		
		acc.setacctNum(Long.toString(d.getTime()));
		acc.setAcctOpenDate(new Date());
		acc.setBalance(startBal);
		acc.setcustNum("bob123");
		acc.setIsOpen(true);
		return acc;
	}
	
	public User createNew(String firstName, String lastName)
	{
		User u = new User();
		return this;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustNum() {
		return custNum;
	}
	public void setCustNum(String custNum) {
		this.custNum = custNum;
	}
	public ArrayList<Accounts> getAcctList() {
		return acctList;
	}
	public void setAcctList(ArrayList<Accounts> acctList) {
		this.acctList = acctList;
	}
}
