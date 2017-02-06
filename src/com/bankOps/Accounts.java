package com.bankOps;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Accounts {

	public Accounts()
	{
		acctNum = "";
		custNum = "";
		balance = 0;
		acctType = "";
		acctOpenDate = new Date();
		isOpen = false;
	}
	
	public String toString()
	{
		return this.acctNum + "," +this.custNum + "," + this.balance + "," + this.acctOpenDate + "," + this.acctType;
	}
	
	public String getAcctNum()
	{return this.acctNum;}
	public void setacctNum(String value)
	{this.acctNum = value;}
	
	public String getCustNum()
	{return this.custNum;}
	public void setcustNum(String value)
	{this.custNum = value;}
	
	public double getBalance()
	{return this.balance;}
	public void setBalance(double value)
	{this.balance = value;}
	
	public Date getAcctOpenDate()
	{return this.acctOpenDate;}
	public void setAcctOpenDate(Date value)
	{this.acctOpenDate = value;}
	
	public boolean getIsOpen()
	{return this.isOpen;}
	public void setIsOpen(boolean value)
	{this.isOpen = value;}
	
	
	
	
	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}




	private String acctNum;
	private String custNum;
	private double balance;
	private Date acctOpenDate;
	private String acctType;
	private boolean isOpen;
	
}
