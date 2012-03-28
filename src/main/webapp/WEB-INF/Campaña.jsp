<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
    <title>Probando el plugin jQuery de calendario_dw</title>
	<link href="calendario_dw/calendario_dw-estilos.css" type="text/css" rel="STYLESHEET">
	<style type="text/css">
	body{
		font-family: tahoma, verdana, sans-serif;
	}
	</style>
	<script type="text/javascript" src="calendario_dw/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="calendario_dw/calendario_dw.js"></script>
	
	<script type="text/javascript">
	$(document).ready(function(){
		$(".campofecha").calendarioDW();
	})
	</script>
	
</head>
<body BGCOLOR=#99CCFF>
    <h1>Apertura Campaña</h1>
	
<table align="center" border="0">
<tr>
	<td align= "left"> Fecha Inicio: <input type="text" name="fecha" class="campofecha" size="12">
	</td>
</tr>
<tr>
	<td align= "left"> Fecha  Final: <input type="text" name="fecha" class="campofecha" size="12">
	</td>
</tr>
</table>
	
</body>
</html>