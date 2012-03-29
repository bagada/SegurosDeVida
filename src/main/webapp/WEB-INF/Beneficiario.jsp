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

<h1> Agrega Beneficiarios </h1>
 <div id="errorDiv">
               <c:if test="${error!=null}">
                     <p>error</p>
               </c:if>
       </div>
	
	<form:form modelAttribute="beneficiarioForm" action="beneficiario" method="POST">
<style type="text/css">
 div.fixedHeaderTable {
     position: relative;
 }
 div.fixedHeaderTable table {
     width:100%;
 }
 div.fixedHeaderTable tbody {
     height: 200px;
     overflow-y: auto;
     overflow-x: hidden;
 }
 div.fixedHeaderTable table th {
     background-color:#CCCCCC;font-weight:bold
 }
 div.fixedHeaderTable table td {
     background-color:#EEEEEE
 }
 div.fixedHeaderTable thead td, div.fixedHeaderTable thead th {
     position:relative;
 }
 
 /* IE7 hacks */
 div.fixedHeaderTable {
     *position: relative;
     *height: 200px;
     *overflow-y: scroll;
     *overflow-x: hidden;
     *padding-right:16px;
 }
 
 div.fixedHeaderTable thead tr {
     *position: relative;
     _position: absolute;
     *top: expression(this.offsetParent.scrollTop-2);
     *background:none;
     background-color:#FFFFFF
 }
  
 div.fixedHeaderTable tbody {
     *height: auto;
     *position:absolute;
     *top:50px;   
 }

 /* IE6 hacks */
 div.fixedHeaderTable {
     _width:expression(this.offsetParent.clientWidth-20);
     _overflow: auto;
     _overflow-y: scroll;
     _overflow-x: hidden;
 }
 div.fixedHeaderTable thead tr {
     _position: relative
 }
 </style>
<FORM ACTION="" METHOD=POST>
<table align="center" border="0">


<tr>
<td align="left" width="5">Nombre:
</td>
<td align="center" width="5"><INPUT NAME="nombre" MAXLENGTH="5" TYPE="TEXT" VALUE="">
</td>
</tr>

<tr>
<td align="left" width="20">Apellido Paterno
</td>
<td align="left" width="70"><INPUT NAME="ApellidoP" MAXLENGTH="25" TYPE="TEXT" VALUE="">
</td>
</tr>

<tr>
<td align="left" width="20">Apellido Materno
</td>
<td align="left" width="70"><INPUT NAME="ApellidoM" MAXLENGTH="25" TYPE="TEXT" VALUE="">
</td>
</tr>

<tr>
<td align="left" width="100">Parentesco:
</td>
<td>
<form id="form1" name="form1" method="post" action="">
<select name="numtexts" id="numtexts" onchange="crear(this.value)">
<option value="1">Padre</option>
<option value="2">Madre</option>
<option value="3">Hijo</option>
</select>
</form>
<div id="contenedor"></div>
</FORM>
</td>
</tr>
<tr>
<td align="left" width="5">No Porcentaje:
</td>
<td align="center" width="5"><INPUT NAME="n°por" MAXLENGTH="5" TYPE="TEXT" VALUE="">
</td>
</tr>
<tr>
<td align="left" width="5">Observaciones:
</td>
<td align="center" width="5"><INPUT NAME="obse" MAXLENGTH="5" TYPE="TEXT" VALUE="">
</td>
</tr>
</TABLE>

<table align="right" border="0">
<tr>
<td align="" width="300"><INPUT NAME="boton" TYPE="button" VALUE="Guardar" >
</td>
</tr>
 </form:form>
</table>

</BODY>
</HTML>