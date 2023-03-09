<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
	<h1>Student Admission Form</h1>
	<form action="/inputMVC/submitAdmissionForm.html" method ="POST">
		<p>
			Students Name : <input type="text" name="studentName"/>
		</p>
		<p>
			Students Hobby : <input type="text" name="studentHobby"/>
		</p>
		<input type="submit" value="Click here to submit form"/>
	</form>
	
</body>
</html>