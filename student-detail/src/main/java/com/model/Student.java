package com.model;

import java.time.LocalDate;

public class Student {
	private String name, password, rollNo, gender, address;
	private int regNo, sem;
	private LocalDate dob;

	public void setDetails(int regNo, String name, String password, String rollNo, int sem, LocalDate dob, String gender, String address){
		this.regNo=regNo;
		this.name=name;
		this.password=password;
		this.rollNo=rollNo;
		this.sem=sem;
		this.dob=dob;
		this.gender=gender;
		this.address=address;
	}

	public int getRegNo(){
		return regNo;
	}

	public String getName(){
		return  name;
	}
	public String getPassword(){
		return  password;
	}
	public String getRollNo(){
		return  rollNo;
	}
	public int getSem(){
		return sem;
	}
	public LocalDate getDob(){
		return dob;
	}
	public String getGender(){
		return  gender;
	}
	public String getAddress(){
		return  address;
	}
}
