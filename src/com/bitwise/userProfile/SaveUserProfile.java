package com.bitwise.userProfile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SaveUserProfile
 */
@WebServlet("/SaveUserProfile")
public class SaveUserProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaveUserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession ssn=  request.getSession();
		PrintWriter out= response.getWriter();

		String name= (String)ssn.getAttribute("name");
		String agge = request.getParameter("age");
		String mobile =  request.getParameter("mobile");
		String city =  request.getParameter("city");
		String state = request.getParameter("state");
		String pincode = request.getParameter("pincode");
		int age;
		if(name==""||city==""||state==""||pincode==""||agge==""||mobile==""){
			out.print("<font color='red'>Please Fill The Values first</font>");
			request.getRequestDispatcher("/userProfile.jsp").include(request, response);
		}
		else{
			age = Integer.parseInt(agge);
			if(age<0||age>100||!mobile.matches("^[789]\\d{9}$")||!name.matches("[a-zA-Z\\s']+")||!city.matches("[a-zA-Z\\s']+")||!state.matches("[a-zA-Z\\s']+")||!pincode.matches("[0-9]+")){
				System.out.println("error");
				out.print("<font color='red'>Fill The Values correct</font>");
				request.getRequestDispatcher("/userProfile.jsp").include(request, response);
			}
			else{
				Profile profile = new Profile(name, pincode, mobile, city, state, age);
				//ssn.setAttribute("profile", profile);
				//System.out.println("user set in session");
				new UserDetails().getUserDetails().put(name, profile);
				System.out.println(name);
				request.getRequestDispatcher("/ShowUserProfile").include(request, response);
			}
		}
	}

}
