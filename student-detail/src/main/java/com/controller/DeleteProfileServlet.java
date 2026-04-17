package com.controller;

import java.io.IOException;

import com.util.StudentDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteProfile")
public class DeleteProfileServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
		try {
	        int regNo = Integer.parseInt(req.getParameter("registration"));

	        StudentDAO dao = new StudentDAO();
	        boolean deleted = dao.deleteProfile(regNo);
	        
	        if (deleted) {
	            req.getRequestDispatcher("/responses/profileDeleted.jsp").forward(req, res);
	        } else {
	            req.getRequestDispatcher("/responses/error.jsp").forward(req, res);
	        }

	    } catch (Exception  e) {
	    	req.getRequestDispatcher("/responses/error.jsp").forward(req, res);
	    }
	}
}