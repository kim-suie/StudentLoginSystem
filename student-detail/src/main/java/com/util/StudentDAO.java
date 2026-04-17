package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import com.model.Student;

public class StudentDAO {
	Student s;
	public boolean checkLogin(int regNo, String password){
		boolean status=false;
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps= con.prepareStatement("SELECT * FROM student_detail WHERE reg_no=? AND password=?");
			ps.setInt(1,regNo);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				status=true;
				s=new Student();
				s.setDetails(rs.getInt("reg_no") , rs.getString ("name"), rs.getString ("password"), rs.getString ("roll_no"), rs.getInt ("sem"), rs.getObject("dob", LocalDate.class) , rs.getString ("gender"), rs.getString ("address"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}


	public Student getStudent(){
		return s;
	}


	public boolean checkUniqueness(int regNo){
		boolean status=false;
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM student_detail WHERE reg_no=?;");
			ps.setInt(1,regNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				status=true;
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return status;
	}


	public boolean registerStudent(int regNo, String name, String password, String rollNo, int sem, LocalDate dob, String gender, String address){
		boolean registered=false;
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO student_detail VALUES(?, ?, ?, ?, ?, ?, ?, ?);");
			ps.setInt(1,regNo);
			ps.setString(2,name);
			ps.setString(3,password);
			ps.setString(4,rollNo);
			ps.setInt(5,sem);
			ps.setObject(6, dob);
			ps.setString(7,gender);
			ps.setString(8,address);
			int rows = ps.executeUpdate();
		        
			registered=true;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return registered;
	}


	public boolean deleteProfile(int regNo) {
		boolean deleted=false;
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("DELETE FROM student_detail WHERE reg_no=?;");
			ps.setInt(1,regNo);
			int rows=ps.executeUpdate();
			deleted=true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return deleted;
	}


	public Student getStudentByReg(int regNo) {
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM student_detail WHERE reg_no=?;");
			ps.setInt(1,regNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				s=new Student();
				s.setDetails(rs.getInt("reg_no") , rs.getString ("name"), rs.getString ("password"), rs.getString ("roll_no"), rs.getInt ("sem"), rs.getObject("dob", LocalDate.class) , rs.getString ("gender"), rs.getString ("address")); 
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return s;
	}



	public boolean updateStudent(int regNo, String name, String password, String rollNo, int sem, LocalDate dob, String gender, String address){
		boolean updated=false;
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("UPDATE student_detail SET name=?, password=?, roll_no=?, sem=?, dob=?, gender=?, address=? WHERE reg_no=?;");
			
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,rollNo);
			ps.setInt(4,sem);
			ps.setObject(5, dob);
			ps.setString(6,gender);
			ps.setString(7,address);
			ps.setInt(8,regNo);
			int rows = ps.executeUpdate();
	        
			updated=true;
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return updated;
	}
}

