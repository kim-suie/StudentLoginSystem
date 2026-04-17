<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
<style type="text/css">
#details{
	margin-left:100px;
	margin-top:70px;
}
td{
padding:10px 20px 10px 20px;
font-size:20px;
}
table{
margin-bottom:25px;
}
h1{
color:#0b1f70;
}
button{
color:#fafaf7;
background-color:#0b1f70;
padding:10px;
margin-right:50px;
margin-bottom:20px;
border:2px solid white;
border-radius:5px;
}
</style>
</head>
<body>
<div id="details">
<h1>Your Details</h1>
<table >
  <tr><td>Name</td><td>${student.name}</td></tr>
  <tr><td>Registration No</td><td>${student.regNo}</td></tr>
  <tr><td>Roll No</td><td>${student.rollNo}</td></tr>
  <tr><td>Semester</td><td>${student.sem}</td></tr>
  <tr><td>Date of Birth</td><td>${student.dob}</td></tr>
  <tr><td>Gender</td><td>${student.gender}</td></tr>
  <tr><td>Address</td><td>${student.address}</td></tr>
</table>
<form action="/student-detail/updateProfile" method="post">
    <input type="hidden" name="registration" value="${student.regNo}">
    <input type="hidden" name="password" value="${student.password}">
    <button type="submit">Update Details</button>
</form><br>
<form action="/student-detail/deleteProfile" method="post">
    <input type="hidden" name="registration" value="${student.regNo}">
	<button onclick="return confirm('Are you sure you want to delete your profile?')">Delete Profile</button>
</form>
</div>
</body>
</html>