<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>


<h1 style="color:red;text-align:center">Update Customer Info </h1>
<body>
   <form:form action="/MiniProject/updateTeacher.htm" modelAttribute="teacherCmd" method="POST">
         Teacher Id :: <form:input path="id" readonly="true"/> <br>
         Teacher Class_Id :: <form:input path="class_Id"/> <br>
         Teacher FirstName :: <form:input path="firstName"/> <br>
         Teacher MiddleName :: <form:input path="middleName"/> <br>
         Teacher LastName :: <form:input path="lastName"/> <br>
         Teacher Age :: <form:input path="age"/> <br>
         Teacher email_Id :: <form:input path="email_Id"/> <br>
         Teacher contact_No :: <form:input path="contact_No"/> <br>
         Teacher address :: <form:input path="address"/> <br>
         Teacher role :: <form:input path="role"/> <br>
         Teacher username :: <form:input path="username"/> <br>
         
         <input type="submit"  value="modify">
   </form:form>    
   </body>
   <br>
 <c:if test="${!empty resMsg}">
     <p style="background:yellow;text-align:center;color:red;font-size:20px">${resMsg } </p>
  </c:if> 
<br>
</html>


