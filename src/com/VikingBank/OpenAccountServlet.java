package com.VikingBank;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bankOps.Accounts;
import com.bankOps.User;


/**
 * Servlet implementation class OpenAccountServlet
 */
@WebServlet("/OpenAccountServlet")
public class OpenAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OpenAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Accounts account = new Accounts();
		String data = "";
		double balance = Double.parseDouble(request.getParameter("startBal"));
		//account = user.createNew(balance);
		HttpSession session = request.getSession(true);
		User user = (User)session.getAttribute("user");	
		account = user.createNew(balance);//.setcustNum(user.getCustNum()));
		account.setcustNum(user.getCustNum());
		account.setAcctType(request.getParameter("accountType"));// TODO how do i get the dropdown value
		user.setAcctList(account);
		
		data = user.toString();
		try {
			FileOutputStream s = new FileOutputStream("D://Godfather00//Documents//eclipse_workspace//servletLab//VikingBank//userAccounts.csv", true);
			PrintWriter bw = new PrintWriter(s);
			for(char item : data.toCharArray())
			{
				bw.append(item);
			}
			//bw.a(data);
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("name" + user.getFirstName() + " " + user.getLastName());
		System.out.println("type " + user.getAcctList().get(0).getAcctType());
		System.out.println("Account number " + user.getAcctList().get(0).getAcctNum());
		System.out.println("balance " + user.getAcctList().get(0).getBalance());
		System.out.println("user number " + user.getAcctList().get(0).getCustNum());
		
		session.setAttribute("user", user);
		RequestDispatcher rs = request.getRequestDispatcher("index2.jsp");
		rs.forward(request, response);
		//User user = session.getAttribute("user");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
