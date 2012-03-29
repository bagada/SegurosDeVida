<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
    <title>Probando el plugin jQuery de calendario_dw</title>
	<link href="resources/calendario_dw/calendario_dw-estilos.css" type="text/css" rel="STYLESHEET">
	<style type="text/css">
	body{
		font-family: tahoma, verdana, sans-serif;
	}
	</style>
	<script type="text/javascript" src="resources/calendario_dw/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="resources/calendario_dw/calendario_dw.js"></script>
	
	<script type="text/javascript">
	$(document).ready(function(){
		$(".campofecha").calendarioDW();
	})
	</script>
	
</head>
<body BGCOLOR=#99CCFF>
    <h1>Apertura Campana</h1>
    
       <div id="errorDiv">
               <c:if test="${error!=null}">
                     <p>error</p>
               </c:if>
       </div>
	
	<form:form modelAttribute="campanaForm" action="campana" method="POST">
<table align="center" border="0">
<tr>
	<td align= "left"> Fecha Inicio:
	
	 <form:input path="fechaInicioCampaña" type="text" name="fecha" class="campofecha" size="12"/>
	</td>
</tr>
<tr>
	<td align= "left"> Fecha  Final:
	 <form:input path="fechaTerminoCampaña" type="text" name="fecha" class="campofecha" size="12"/>
	</td>
</tr>
</table>
<table align="right" border="0">
<tr>
<td align="" width="300"><INPUT NAME="boton" TYPE="button" VALUE="Guardar" >
</td>
</tr>
</table>

  </form:form>
</body>
</html>