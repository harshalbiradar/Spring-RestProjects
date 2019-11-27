<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="text-align: center; color: red"> Registration Form</h1><br><br>
<form:form method="POST" modelAttribute="registerCommand">
	<table align="center">
		<tr>
			<td>Select Role::<form:select path="role" items="${rolesList}" /></td>
			
		</tr>

		<tr>
			<td>Class_Id::<form:select path="class_Id" items="${classId}" /></td>
			
		</tr>
		<tr>
			<td>First Name::</td>
			<td><form:input path="firstName" /></td>
			
		</tr>
		<tr>
			<td>Middle Name::</td>
			<td><form:input path="middleName" /></td>
			
		</tr>
		<tr>
			<td>Last Name::</td>
			<td><form:input path="lastName" /></td>
			
		</tr>
		<tr>
			<td>Age::</td>
			<td><form:input path="age" /></td>
			
		</tr>
		<tr>
			<td>Email Address::</td>
			<td><form:input path="email_Id" /></td>
			
		</tr>
		<tr>
			<td>Contact No::</td>
			<td><form:input path="contact_No" /></td>
			
		</tr>


		<tr>
			<td>Address::</td>
			<td><form:textarea path="address" rows="5" /></td>
			
		</tr>
		<tr>
			<td>Username::</td>
			<td><form:input path="username" /></td>
			
		</tr>

		<tr>
			<td>Password::</td>
			<td><form:input path="password" /></td>
			
		</tr>

		<tr>
			<td>Conform_Password::</td>
			<td><form:input path="conformPassword" /></td>
			
		</tr>
		<tr>
			<td align="center"><input type="submit" value="Register"></td>
		</tr>
	</table>
</form:form>
