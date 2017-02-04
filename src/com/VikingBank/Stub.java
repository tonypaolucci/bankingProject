package com.VikingBank;

import java.util.Scanner;

//import org.apache.tomcat.jni.User;

import com.bankOps.Login;
import com.bankOps.User;

public class Stub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fn = "" , ln = "", p = "";
		Scanner input = new Scanner(System.in);
		Login l = new Login();
		User u = new User();
		System.out.println("first name:");
		fn = input.nextLine();
		System.out.println("last name:");
		ln = input.nextLine();
		System.out.println("password:");
		p =  input.nextLine();
		
		u = l.checkUsers(fn, ln, p);
	}

}
