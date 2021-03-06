package com.VikingBank;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bankOps.Login;
import com.bankOps.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Login log = new Login();
		User user = new User();
		// TODO login only needs to check the typed paarameter with data from elsewhere.
//		log.setfName(request.getParameter("firstName"));
//		log.setlName(request.getParameter("lastName"));
		log.setPassW(request.getParameter("password"));
		log.setuName(request.getParameter("userName"));
		user = log.checkUsers(log.getuName(), log.getPassW());
		if(log.isLoggedIn())
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			RequestDispatcher rs = request.getRequestDispatcher("index2.jsp");
			rs.forward(request, response);
		}
		else
		{
			//ned somethoong to display user entered wrong info.
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
			rs.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
