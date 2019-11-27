<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h1 style="color:red;text-align:center;">Teacher Details</h1>

<c:choose>


	<c:when test="${!empty teacherList}">
		<table border="1" align="center">
			<tr bgcolor="cyan"><th>TeacherId</th><th>Class_Id</th><th>FirstName</th><th>MiddleName</th><th>LastName</th><th>Age</th><th>Email_Id</th><th>Contact_No</th><th>Address</th><th>Role</th><th>UserName</th></tr>
		<c:forEach var="teacher" items="${teacherList}">
			<tr style="text-align: center;">
			<td>${teacher.id}</td>
			<td>${teacher.class_Id}</td>
			<td>${teacher.firstName}</td>
			<td>${teacher.middleName}</td>
			<td>${teacher.lastName}</td>
			<td>${teacher.age}</td>
			<td>${teacher.email_Id}</td>
			<td>${teacher.contact_No}</td>
			<td>${teacher.address}</td>
			<td>${teacher.role}</td>
			<td>${teacher.username}</td>
			<td><a href="updateTeacher.htm?id=${teacher.id}"><img src="images/edit1.jpg" width="40" height="40" align="bottom">Edit</a>&nbsp; &nbsp;
						 <a href="deleteTeacher.htm?id=${teacher.id}"  onclick="return confirm('Are u sure!! u want to delete?')"><img src="images/delete1.jpg" width="40" height="40" align="bottom"/>Delete</a></td>
			
			</tr>
		</c:forEach>
		</table>
	</c:when>
	
	<c:otherwise>
              <h1 style="color:red;text-align:center">Records not found </h1>
    </c:otherwise>
</c:choose><br><br><br>
 <br>
 <c:if test="${!empty resMsg}">
     <p style="background:yellow;text-align:center;color:red;font-size:20px">${resMsg } </p>
  </c:if> 
<br>

 <b><a href="principal.htm">Back</a></b>   &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
  <b><a href="JavaScript:showPrint()">Print</a></b>
  
  <script language="JavaScript">
  		function showPrint(){
  			frames.focus();
  			frames.print();
  		}
  </script>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
   <a href="./logout">Logout</a>
  
  
  
  