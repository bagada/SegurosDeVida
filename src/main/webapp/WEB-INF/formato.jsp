<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<TITLE>FORMATO</TITLE>
</head>
<body BGCOLOR=#99CCFF > 
<form ACTION="" METHOD=POST>
<table align="left" border="0">
<h1> FORMATO EMPLEADO </h1>
<tr>

<td align="left" width="200">Numero De Formato:
</td>
<td align="center"width=200"><input name="mail" maxlength="30" type="TEXT" value="">
</td>
</tr>
<tr>
<td align="left" width="200">Numero De Empleado:
</td>
<td align="center" width="200"><input name="mail" maxlength="30" type="TEXT" value="">
</td>
</tr>
<tr>
<td align="left" width="250">Numero De Potenciacion:
</td>
<td align="center" width="200"><input name="mail" maxlength="30" type="TEXT" value="">
</td>
</tr>
<tr>
</tr>
<td align="left" width="200">Region:
</td>
<td>
<SELECT NAME="region" SIZE=1>
<OPTION VALUE="1">Edo.Mexico
<OPTION VALUE="2">Puebla
<OPTION VALUE="3">Oaxaca
<OPTION VALUE="4">Merida
<OPTION VALUE="5">Chiapas
</SELECT>
</td>
</tr>
<tr>
<td align="left" width="200"><INPUT NAME="boton" TYPE="SUBMIT" VALUE="Buscar"> 
</td>
<tr>
</tr>
</SELECT>
</form>
</body>
</html>
