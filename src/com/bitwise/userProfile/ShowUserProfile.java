package com.bitwise.userProfile;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class ShowUserProfile
 */
@WebServlet("/ShowUserProfile")
public class ShowUserProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUserProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession ssn=  request.getSession();
		PrintWriter out = response.getWriter();
		
		String name = (String) ssn.getAttribute("name");
		HashMap<String, Profile> map = new UserDetails().getUserDetails();
		
		Profile profile = map.get(name);
		out.println("<html><body>");
		out.println("User Name"+profile.getName());
		out.println("<br>Age:"+profile.getAge());
		out.println("<br>State:"+profile.getState());
		out.println("<br>Pin code:"+profile.getPincode());
		out.println("<br>Mobile:"+profile.getMobile());
		out.println("<br>City:"+profile.getCity());
		out.println("<br><form action='Logout' method='post'>");
        out.println("<input type='submit' name='submit' value='Logout'>");
        out.println("</form></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
