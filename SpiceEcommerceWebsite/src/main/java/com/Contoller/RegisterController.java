package com.Contoller;
<<<<<<< HEAD
<<<<<<< HEAD

=======
import com.Model.*;
>>>>>>> 2c8e4ea5c63bf2d3981c2e9270c169af1ab3771d
=======
import com.Model.*;
>>>>>>> 8a774f8c22274af4ff5d8105df46c4372f979e79
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
<<<<<<< HEAD

=======
import javax.servlet.http.HttpSession;

import com.Dao.*;
>>>>>>> 2c8e4ea5c63bf2d3981c2e9270c169af1ab3771d
=======
import javax.servlet.http.HttpSession;

import com.Dao.*;
>>>>>>> 8a774f8c22274af4ff5d8105df46c4372f979e79
/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 8a774f8c22274af4ff5d8105df46c4372f979e79
		String username=request.getParameter("username");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		User u=new User(username,name,email,password);
		u.setUsername(username);
		u.setEmail(email);
		u.setPassword(password);
		System.out.println(u.toString());
		LoginDao e=new LoginDao();
		int j=e.checkRegister(u);
		
		if(j>0) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("message2", "User Already Registered!: "+username);
			System.out.println("User Already Registered!"+u);
			response.sendRedirect("Register.jsp");
//			response.sendRedirect("Login.jsp");
		}
		else {
			
			int i=e.insertUser(u);
			if(i>0) {
				HttpSession httpSession2 = request.getSession();
				httpSession2.setAttribute("message", "User successfully Registered!: "+username);
				System.out.println("User successfully registered"+u);
				response.sendRedirect("Register.jsp");
			}else {
				System.out.println("User Not Registered!");
			}
			
		}
		
		
		
		
		
//		if(i>0) {
//			System.out.println("User inserted");
//			response.sendRedirect("Login.jsp");
//		}
//		else {
//			System.out.println("User has not inserted");
//		}
<<<<<<< HEAD
>>>>>>> 2c8e4ea5c63bf2d3981c2e9270c169af1ab3771d
=======
>>>>>>> 8a774f8c22274af4ff5d8105df46c4372f979e79
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
