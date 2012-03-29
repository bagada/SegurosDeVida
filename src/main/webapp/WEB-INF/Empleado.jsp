<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>FORMULARIOS</TITLE>
</HEAD>
<BODY BGCOLOR=#99CCFF>
<h1> Agrega Empleado </h1>
 <div id="errorDiv">
               <c:if test="${error!=null}">
                     <p>error</p>
               </c:if>
       </div>
<form:form modelAttribute="empleadoForm" action="empleado" method="POST">

<table align="center" border="0">


<tr>
<td align="left" width="20">Nombre:

<form:input path=nombre  type="TEXT" name ="nombre" class="camponombre" size="12"/>
 
</td>
</tr>


<tr>
<td align="left" width="20">Apellido Paterno:
<form:input path=apellidoPaterno type="TEXT"name="apellidoP" class="campoapellidoP" size ="12"/>
</td>
<tr>
<td align="left" width="20">Apellido Materno:
<form:input path="apellidoMaterno" type="TEXT"name="apellidoM" class="campoapellidoM" Size="12"/>
</td>
</tr>
<tr>
<td align="left" width="100">RFC:
<form:input path="rfc"type="TEXT"name="rfc" class="camporfc" Size="12"/>
</td>
<td align="center" width="100">Mail
<form:input path="mail" type="TEXT"name="mail" class="campomail"Size="12"/>
</td>
</tr>

<tr>
<td align="left" width="100">Estado:
</td>
<td>
<form id="form1" name="form1" method="post" action="">
<select name="numtexts" id="numtexts" onchange="crear(this.value)">
<option value="1">Activo</option>
<option value="2">Inactivo</option>
</select>
</form>
<div id="contenedor"></div>
</td>
</tr>

<tr>
<td align="left" width="100">Region:
</td>
<td>
<form id="form1" name="form1" method="post" action="">
<select name="numtexts" id="numtexts" onchange="crear(this.value)">
<option value="1">Edo. Mexico</option>
<option value="2">DF</option>
<option value="3">Guadalajara</option>
<option value="4">Monterrey</option>
</select>
</form>
<div id="contenedor"></div>

</td>
</tr>
<tr>
<td align="left" width="100"><INPUT NAME="boton" TYPE="button" VALUE="Guardar" >
</td>
</tr>
 </form:form>
</TABLE>
</BODY>
</HTML>