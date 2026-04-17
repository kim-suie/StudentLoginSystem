package com.controller;

import java.io.IOException;

import com.util.StudentDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
		try {
	        int regNo = Integer.parseInt(req.getParameter("username"));
	        String password = req.getParameter("password");

	        StudentDAO dao = new StudentDAO();
	        boolean status = dao.checkLogin(regNo, password);
	        
	        if (status) {
	            req.setAttribute("student", dao.getStudent());
	            req.getRequestDispatcher("/responses/profile.jsp").forward(req, res);
	        } else {
	            req.getRequestDispatcher("/responses/denial.jsp").forward(req, res);
	        }

	    } catch (NumberFormatException  e) {
	    	req.getRequestDispatcher("/responses/denial.jsp").forward(req, res);
	    }
	}
}