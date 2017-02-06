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
 * Servlet implementation class NewUserServlet
 */
@WebServlet("/NewUserServlet")
public class NewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//Login log = new Login();
		User user = new User();
		//User u = new User();
		// TODO login only needs to check the typed paarameter with data from elsewhere.
		
//		log.setuName(request.getParameter("userName"));
//		log.setPassW(request.getParameter("password"));
//		user.setFirstName(request.getParameter("firstName"));
//		user.setLastName(request.getParameter("lastName"));
//		user.setPassword(request.getParameter("password"));
//		user.setUsername(request.getParameter("userName"));
		//user.set
		//user = log.checkUsers(log.getuName(), log.getPassW());
		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		user.setAddress(request.getParameter("address"));
		user.setPhone(request.getParameter("phone"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setUsername(request.getParameter("userName"));
		user.setCustNum(user.randomNums());
		
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			RequestDispatcher rs = request.getRequestDispatcher("acctOpen.jsp");
			rs.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
