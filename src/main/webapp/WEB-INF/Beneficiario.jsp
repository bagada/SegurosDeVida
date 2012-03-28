<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>FORMULARIOS</TITLE>
</HEAD>
<BODY BGCOLOR=#99CCFF>

<h1> Agrega Beneficiarios </h1>
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
<td align="left" width="5">Num. Empleado:
</td>
<td align="center" width="5"><INPUT NAME="nombre" MAXLENGTH="5" TYPE="TEXT" VALUE="">
</td>
<td align="right" width="100"><INPUT NAME="boton" TYPE="button" VALUE="Buscar" >
</td>
</tr>

<tr>
<td align="left" width="20">Nombre:
</td>
<td align="center" width="20">Apellido Paterno
</td>
<td align="right" width="20">Apellido Materno
</td>
</tr>

<tr>
<td align="left" width="70"><INPUT NAME="nombre" MAXLENGTH="25" TYPE="TEXT" VALUE="">
</td>
<td align="left" width="70"><INPUT NAME="nombre" MAXLENGTH="25" TYPE="TEXT" VALUE="">
</td>
<td align="left" width="70"><INPUT NAME="nombre" MAXLENGTH="25" TYPE="TEXT" VALUE="">
</td>
</tr>

<tr>
<td align="left" width="100">RFC:
</td>
<td align="center" width="100"><INPUT NAME="mail" MAXLENGTH="25" TYPE="TEXT" VALUE="">
</td>
</tr>

<tr>
<td align="left" width="100">Estado:
</td>
<td align="center" width="100"><INPUT NAME="mail" MAXLENGTH="25" TYPE="TEXT" VALUE="">
</td>
</tr>

<tr>
<td align="left" width="100">Region:
</td>
<td align="center" width="100"><INPUT NAME="mail" MAXLENGTH="25" TYPE="TEXT" VALUE="">
</td>
</tr>
<tr>
<td align="left" width="100">Estado de Capana:
</td>
<td>
<form id="form1" name="form1" method="post" action="">
<select name="numtexts" id="numtexts" onchange="crear(this.value)">
<option value="1">Activo</option>
<option value="2">Inactivo</option>
</select>
</form>
<div id="contenedor"></div>
</FORM>
</td>
<td>
<form id="form1" name="form1" method="post" action="">
<select name="numtexts" id="numtexts" onchange="crear(this.value)">
<option value="1">40</option>
<option value="2">74</option>
<option value="3">91</option>
<option value="4">108</option>
</select>
</form>
<div id="contenedor"></div>
</FORM>
</td>
</tr>
</TABLE>
<tr>
<div class="fixedHeaderTable">
   <table>
      <thead>
      	<tr><th>Num. Beneficiario</th><th>Nombre</th><th>Apellido Paterno</th><th>Apellido Materno</th><th>Parentesco</th><th>Num. Porcentaje</th><th>Observaciones</th></tr>
      </thead>
      <tbody>
         <tr><td></td><td>bbbb</td><td>cccc</td><td>aaaa</td><td>bbbb</td><td>cccc</td><td>aaaa</td></tr>
         <tr><td>aaaa</td><td>bbbb</td><td>cccc</td><td>aaaa</td><td>bbbb</td><td>cccc</td><td>aaaa</td></tr>
         <tr><td>aaaa</td><td>bbbb</td><td>cccc</td><td>aaaa</td><td>bbbb</td><td>cccc</td><td>aaaa</td></tr>
         <tr><td>aaaa</td><td>bbbb</td><td>cccc</td><td>aaaa</td><td>bbbb</td><td>cccc</td><td>aaaa</td></tr>

      </tbody>
   </table>       
</div>
</tr>
<tr>
<td align="left" width="100"><INPUT NAME="boton" TYPE="button" VALUE="Guardar" >
</td>
<td align="right" width="5000"><INPUT NAME="boton" TYPE="button" VALUE="Imprimir" >
</td>
</tr>
</BODY>
</HTML>