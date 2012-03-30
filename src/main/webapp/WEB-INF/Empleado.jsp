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
	<h1>Agrega Empleado</h1>
	<div id="errorDiv">
		<c:if test="${error!=null}">
			<p>error</p>
		</c:if>
	</div>
	<form:form modelAttribute="empleadoForm" action="empleado"
		method="POST">

		<table align="center" border="0">


			<tr>
				<td align="left" width="20">Nombre: <form:input path="nomEmp"
						type="TEXT" name="nombre" class="camponombre" size="12" />

				</td>
			</tr>


			<tr>
				<td align="left" width="20">Apellido Paterno: <form:input
						path="apePEmp" type="TEXT" name="apellidoP" class="campoapellidoP"
						size="12" />
				</td>
			<tr>
				<td align="left" width="20">Apellido Materno: <form:input
						path="apeMEmp" type="TEXT" name="apellidoM" class="campoapellidoM"
						Size="12" />
				</td>
			</tr>
			<tr>
				<td align="left" width="100">RFC: <form:input path="rFCEmp"
						type="TEXT" name="rfc" class="camporfc" Size="12" />
				</td>
				<td align="center" width="100">Mail <form:input path=""
						type="TEXT" name="mail" class="campomail" Size="12" />
				</td>
			</tr>

			<tr>

			</tr>

			<tr>
				<td><form:select path="nomEstado">
						<form:option value="Activo"></form:option>
						<form:option value="Inactivo"></form:option>
					</form:select></td>
				<td>
				<td><form:select path="nomRegion">
						<form:option value="Edo. Mexico"></form:option>
						<form:option value="DF"></form:option>
						<form:option value="Guadalajara"></form:option>
						<form:option value="Monterrey"></form:option>
					</form:select></td>

				</td>
			</tr>
			<tr>
				<td align="left" width="100"><INPUT NAME="boton" TYPE="submit"
					VALUE="Guardar"></td>
			</tr>
			</form:form>
		</TABLE>
</BODY>
</HTML>