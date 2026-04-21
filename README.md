# 🎓 Student Login System

## 📌 Project Overview

The **Student Login System** is a web-based application that allows students to independently manage their academic profiles.
The system enables users to perform operations such as **registration, login, viewing, updating, and deleting their own data**.

This project is developed using **Java Servlets, JSP, and JDBC**, following a structured approach similar to the **MVC architecture**.

---

## 🚀 Features

* 📝 Student Registration
* 🔐 Login Authentication
* 👤 View Profile
* ✏️ Update Profile
* ❌ Delete Profile
* ✅ Input Validation (Registration No & Password)

---

## 🛠️ Technologies Used

* **Frontend:** HTML, CSS
* **Backend:** Java (Servlets & JSP)
* **Database:** MySQL
* **Server:** Apache Tomcat 10
* **Connectivity:** JDBC

---

## 🧠 Concepts Used

### 🔹 MVC Pattern (Model-View-Controller)

* **Model:** `Student.java` (data representation)
* **View:** JSP pages (UI)
* **Controller:** Servlets handling user requests

This separation improves **code organization and maintainability**.

---

### 🔹 DAO (Data Access Object)

* Implemented using `StudentDAO.java`
* Handles all database operations:

  * Insert
  * Fetch
  * Update
  * Delete

---

### 🔹 Database Connection

* Managed using `DBConnection.java`
* Responsible for establishing connection with MySQL

---

### 🔹 Validation

* **Registration Number:**

  * Must be exactly 10 digits
  * Must start with `1`
  * Only numeric values allowed

* **Password:**

  * Must be 4–6 characters
  * Allows letters and digits

---

### 🔹 Exception Handling

* Implemented using `try-catch` blocks
* Handles SQL and IO exceptions to prevent application crashes

---

## 📂 Project Structure

```text
student-detail
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       ├── controller
│       │       │   ├── DeleteProfileServlet.java
│       │       │   ├── LoginServlet.java
│       │       │   ├── MakeChangesServlet.java
│       │       │   ├── RegisterServlet.java
│       │       │   └── UpdateProfileServlet.java
│       │       │
│       │       ├── model
│       │       │   └── Student.java
│       │       │
│       │       └── util
│       │           ├── DBConnection.java
│       │           └── StudentDAO.java
│       │
│       └── webapp
│           ├── main-frontend
|           |   ├── 1.jpeg
|           │   ├── index.html
|           │   ├── register.html
|           │   └── style.css
│           ├── META-INF
│           ├── responses
│           │   ├── dataAlreadyAvailable.jsp
│           │   ├── denial.jsp
│           │   ├── error.jsp
│           │   ├── profile.jsp
│           │   ├── profileDeleted.jsp
│           │   ├── profileUpdated.jsp
│           │   ├── successfulRegister.jsp
│           │   └── updateYourProfile.jsp
│           │
│           └── WEB-INF
```

---

## 🗄️ Database Setup

```sql
CREATE DATABASE student_db;
USE student_db;

CREATE TABLE student_detail(
    reg_no INT PRIMARY KEY,
    name VARCHAR(50),
    password VARCHAR(10),
    roll_no VARCHAR(13),
    sem INT,
    dob DATE,
    gender VARCHAR(10),
    address VARCHAR(100)
);
```

---

## ⚙️ How to Run the Project

### 1️⃣ Clone Repository

```
git clone https://github.com/kim-suie/StudentLoginSystem.git
```

### 2️⃣ Import in IDE

* Open in Eclipse / IntelliJ
* Configure Apache Tomcat 10

### 3️⃣ Setup Database

* Create database using SQL above
* Update credentials in `DBConnection.java`

### 4️⃣ Add MySQL Connector

* Place JAR inside:

```
WEB-INF/lib
```

### 5️⃣ Run Project

* Right click → Run on Server
* Open:

```
http://localhost:8080/student-detail/
```

---

## 📸 Screenshots

*(Add screenshots here later)*

---

## 👨‍💻 Contributors

* Sahil Sharma
* Kartikey Kumar
* Deekshant Kumar
* Priyanshu Raj
* Sanket Kumar

---

## 🔗 Repository

https://github.com/kim-suie/StudentLoginSystem

---

## 📌 Future Improvements

* Session management for authentication
* Password encryption
* Improved UI design (Bootstrap)
* Search and filter functionality

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!
