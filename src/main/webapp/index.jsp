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

<div align="center">
	<form action="ServletController" method="post">
		
		<label>name</label><br>
		<input type="text" name="name"/>${name} <br>
		<label>surname</label><br>
		<input type="text" name="surname"/>${surname}<br>
		<label>patronymic</label><br>
		<input type="text" name="patronymic"/>${patronymic}<br>
		<label>nickname</label><br>
		<input type="text" name="nickname"/>${nickname}<br>
		<label>skype</label><br>
		<input type="text" name="skype"/>${skype}<br>
		<label>e-mail</label><br>
		<input type="text" name="email"/>${email}<br>
		<label>home phone</label><br>
		<input type="text" name="homephone"/>${homephone}<br>
		<label>mobile phone</label><br>
		<input type="text" name="mobilephone"/>${mobilephone}<br>
		<label>another phone</label><br>
		<input type="text" name="anotherphone"/>${anotherphone}<br>
		<label>comment</label><br>
		<input type="text" name="comment"/>${comment}<br>
		<label>postcode</label><br>
		<input type="text" name="postcode"/>${postcode}<br>
		<label>city</label><br>
		<input type="text" name="city"/>${city}<br>
		<label>street</label><br>
		<input type="text" name="street"/>${street}<br>
		<label>house number</label><br>
		<input type="text" name="housenumber"/>${housenumber}<br>
		<label>flat number</label><br>
		<input type="text" name="flatnumber"/>${flatnumber}<br>
		<label>group</label><br>
		<label>friends</label><input type="radio" name="group" value="FRIENDS"/>
		<label>colleagues</label><input type="radio" name="group" value="COLLEAGUES"/>
		<label>relatives</label><input type="radio" name="group" value="RELATIVES"/> 
		<br>
		<input type="submit" value="add" />
	
	</form>
	
</div>

</body>
</html>