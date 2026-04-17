<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">  
    <title>Update profile</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/main-frontend/style.css"> 
</head>
<body id="register-page">
    <div class="form-area">
        <div class="wrapper" id="wrapper2">
            <h2>Update Your Profile</h2>       
            <form action="/student-detail/makeChanges" method="post">             
                <div class="box">
                  <p>Enter your name</p>
                    <input type="text" placeholder="Name" value="${student.name}" name="name" required>
                </div>
                <div class="box">
                  <p>Enter your Roll no.</p>
                    <input type="text" placeholder="Roll no." value="${student.rollNo}"name="rollNo" required>
                </div>
                <input type="hidden" value="${student.regNo}" name="registration" >
              
                <div class="radio-group">
                  <p>Your semester</p>
                  <label>
                    <input type="radio" name="semester" value="1" required> 1st
                  </label>
                  <label>
                    <input type="radio" name="semester" value="2"> 2nd
                  </label>
                  <label>
                    <input type="radio" name="semester" value="3"> 3rd
                  </label>
                  <label>
                    <input type="radio" name="semester" value="4"> 4th
                  </label>
                  <label>
                    <input type="radio" name="semester" value="5"> 5th
                  </label>
                  <label>
                    <input type="radio" name="semester" value="6"> 6th
                  </label>
                </div>
                <div class="box">
                  <p>Your Date of Birth</p>
                    <input type="date" name="dob" required>
                </div>
                <div class="radio-group">
                  <p>Your Gender</p>
                  <label>
                    <input type="radio" name="gender" value="male" required> Male
                  </label>
                  <label>
                    <input type="radio" name="gender" value="female"> Female
                  </label>
                  <label>
                    <input type="radio" name="gender" value="other"> Other
                  </label>
                </div>
                <div class="box">
                  <p>Your address</p>
                    <input type="text" placeholder="Address" value="${student.address}" name="address" required>
                </div>
                <div class="box">
                  <p>Password</p>
                    <input type="password" placeholder="Password" value="${student.password}" name="password" minlength="4" maxlength="6" required>
                </div>
                <button type="submit" id="register">Update</button>
            </form>
        </div>
    </div>
    
    
    
</body>
</html>