package com.controller;
import java.io.IOException;
import java.time.LocalDate;

import com.util.StudentDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/makeChanges")
public class MakeChangesServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
		String name=req.getParameter("name");
		String rollNo=req.getParameter("rollNo");
		int regNo=Integer.parseInt(req.getParameter("registration"));
		int sem=Integer.parseInt(req.getParameter("semester"));
		LocalDate dob=LocalDate.parse(req.getParameter("dob"));
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		String password=req.getParameter("password");
		
		StudentDAO dao=new StudentDAO();
		
		boolean updated=dao.updateStudent(regNo, name, password, rollNo, sem, dob, gender, address);
		
		if(updated){
			req.getRequestDispatcher("/responses/profileUpdated.jsp").forward(req,res);
		}
		else{
			req.getRequestDispatcher("/responses/error.jsp").forward(req,res);
		}
	}
}
