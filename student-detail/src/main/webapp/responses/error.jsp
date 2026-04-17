<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
    alert("An Error occured!");
    window.location.href = "${pageContext.request.contextPath}/main-frontend/index.html";
</script>
</body>
</html>