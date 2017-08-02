<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<div align="left">
	
		<label>name :</label>
			${record.name} <br><br><br>
		<label>surname :</label>
			${record.surname}<br><br><br>
		<label>patronymic :</label>
			${record.patronymic}<br><br><br>
		<label>nickname :</label>
			${record.nickName}<br><br><br>
		<label>skype :</label>
			${record.skype}<br><br><br>
		<label>e-mail :</label>
			${record.email}<br><br><br>
		<label>home phone :</label>
			${record.homePhoneNumber}<br><br><br>
		<label>mobile phone :</label>
			${record.mobilePhone}<br><br><br>
		<label>another phone :</label>
			${record.anotherPhone}<br><br><br>
		<label>comment :</label>
			${record.comment}<br><br><br>
		<label>postcode :</label>
			${record.address.postcode}<br><br><br>
		<label>city :</label>
			${record.address.city}<br><br><br>
		<label>street :</label>
			${record.address.street}<br><br><br>
		<label>house number :</label>
			${record.address.houseNumber}<br><br><br>
		<label>flat number :</label>
			${record.address.flatNumber}<br><br><br>
		
	
		
	
	
</div>
	


</body>
</html>