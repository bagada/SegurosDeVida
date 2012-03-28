<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>FORMULARIOS</TITLE>
</HEAD>
<BODY BGCOLOR=#99CCFF>
<h1> Agrega Empleado </h1>
<FORM ACTION="" METHOD=POST>
<table align="center" border="0">

<tr>
<td align="left" width="5">Num. Empleado:
</td>
<td align="center" width="5"><INPUT NAME="nombre" MAXLENGTH="5" TYPE="TEXT" VALUE="">
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
</FORM>
</td>
</tr>
<tr>
<td align="left" width="100"><INPUT NAME="boton" TYPE="button" VALUE="Guardar" >
</td>
</tr>
</TABLE>
</FORM>
</BODY>
</HTML>