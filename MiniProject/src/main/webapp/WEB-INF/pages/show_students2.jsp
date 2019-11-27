<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h1 style="color:red;text-align:center;">Student Details</h1>

<c:choose>


	<c:when test="${!empty studentList}">
		<table border="1" align="center">
			<tr bgcolor="cyan"><th>TeacherId</th><th>Class_Id</th><th>FirstName</th><th>MiddleName</th><th>LastName</th><th>Age</th><th>Email_Id</th><th>Contact_No</th><th>Address</th><th>Role</th><th>UserName</th></tr>
		<c:forEach var="student" items="${studentList}">
			<tr style="text-align: center;">
			<td>${student.id}</td>
			<td>${student.class_Id}</td>
			<td>${student.firstName}</td>
			<td>${student.middleName}</td>
			<td>${student.lastName}</td>
			<td>${student.age}</td>
			<td>${student.email_Id}</td>
			<td>${student.contact_No}</td>
			<td>${student.address}</td>
			<td>${student.role}</td>
			<td>${student.username}</td>
					</tr>
		</c:forEach>
		</table>
	</c:when>
	
	<c:otherwise>
              <h1 style="color:red;text-align:center">Records not found </h1>
    </c:otherwise>
    </c:choose><br><br><br>
    <a href="principal.htm">Back</a>