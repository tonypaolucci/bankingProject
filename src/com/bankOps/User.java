package com.bankOps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class User {

	
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String email;
	private String custNum;
	private String username;
	private String password;
	private ArrayList<Accounts> acctList = new ArrayList<Accounts>();
	
	public User()
	{
		firstName = "bob";
		lastName = "mcgee";
		address = "1313 mockingbird lane";
		phone = "1235556789";
		email = "bob@bob.com";
		password = "12345";
		custNum = "mcgee123";
		username = "dollabillz45";
		password = "12345";
	}
	public Accounts createNew(double startBal)
	{
		Accounts acc = new Accounts();
		
		
		acc.setacctNum(randomNums());
		acc.setAcctOpenDate(new Date());
		acc.setBalance(startBal);
		acc.setcustNum("bob123");
		acc.setIsOpen(true);
		return acc;
	}
	
	public User createNew(String firstName, String lastName, String address, String phone, String email, String password, String userName)
	{
		User u = new User();
		ArrayList<Accounts> acctList = new ArrayList<>();
		u.setFirstName(firstName);
		u.setLastName(lastName);
		u.setAddress(address);
		u.setPhone(phone);
		u.setEmail(email);
		u.setUsername(userName);
		u.setPassword(password);
		u.setCustNum(randomNums());
		u.setAcctList(acctList);
		return this;
	}
	
	public String randomNums()
	{
		Random rand = new Random();
		String out = "";
		 ArrayList<Integer> list = new ArrayList<Integer>();
	        for (int i=0; i < 7; i++) {
	            list.add(rand.nextInt(9));
	        }
	        Collections.shuffle(list);
//	        for (int i=0; i<3; i++) {
//	            System.out.println(list.get(i));
//	        }
	        for (int j = 0; j < list.toArray().length; j++)
	        {
	        	out += list.toArray()[j];
	        }
	        return out;
	}
	public String toString()
	{
		return this.username + "," + this.password + "," + this.custNum + "," + this.firstName + "," + this.lastName + "," + this.address + "," + this.phone + "," + this.email + "," + this.acctList.get(0).toString() + "\r\n";
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
	public void setAcctList(Accounts account) {
		this.acctList.add(account);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
}
