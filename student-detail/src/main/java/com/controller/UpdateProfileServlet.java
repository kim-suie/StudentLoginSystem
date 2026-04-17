package com.controller;      

import java.io.IOException;

import com.util.StudentDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateProfile")
public class UpdateProfileServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
		try {
	        int regNo = Integer.parseInt(req.getParameter("registration"));
	        String password = req.getParameter("password");

	        StudentDAO dao = new StudentDAO();
	        req.setAttribute("student", dao.getStudentByReg(regNo));
	        
	        req.getRequestDispatcher("/responses/updateYourProfile.jsp").forward(req, res);

	    } catch (Exception  e) {
	    	req.getRequestDispatcher("/responses/error.jsp").forward(req, res);
	    }
	}
}

