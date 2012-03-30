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

<script src="resources/js/jquery.js"></script>
<script type="text/javascript">
function doAjaxPost(id) {  
	  // get the form values  
	  var name = $('#name').val();
	  var postData = new Object();
	  postData.id = name ;
	  $.ajax({  
	    type: "POST",  
	    url: "/SeguroDeVida/busqueda",  
	    data: postData,  
	    success: function(response){  
	      // we have the response  
	      $('#info').html(response);
	      $('#name').val('');
	    },  
	    error: function(e){  
	      alert('Error: ' + e);  
	      $('#name').val('');
	    }  
	  });  
	}  
</script>

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

<h1> Busca Empleado </h1>
<div id="errorDiv">
               <c:if test="${error!=null}">
                     <p>error</p>
               </c:if>
       </div>

 
<table align="center" border="0">

<tr>
<td align="left" width="5">Nombre de empleado:
</td>
<td align="center" width="5"><INPUT id="name" NAME="nombre" MAXLENGTH="5" TYPE="TEXT" VALUE="">
</td>
<td align="right" width="100"><INPUT NAME="boton" TYPE="button" VALUE="Buscar"  onclick="doAjaxPost(1)"  >
</td>
</tr>
</TABLE>

<tr>
<div class="fixedHeaderTable">
   <table>
      <thead>
      	<tr><th>Num. Empleado</th><th>Nombre</th><th>Apellido Paterno</th><th>Apellido Materno</th><th>RFC</th><th>Estado</th><th>Region</th></tr>
      </thead>
      <tbody>

      </tbody>
      
   </table>       
</div>
</tr>
<h1>Beneficiarios</h1>
<tr>
<div class="fixedHeaderTable">
   <table>
      <thead>
      	<tr><th>Num. Beneficiario</th><th>Nombre</th><th>Apellido Paterno</th><th>Apellido Materno</th><th>Parentesco</th><th>Num. Porcentaje</th><th>Observaciones</th></tr>
      </thead>
      <tbody>

      </tbody>
   </table>       
</div>
</tr>
<tr>
<td align="right" width="5000"><INPUT NAME="boton" TYPE="button" VALUE="Buscar">
</td>
</tr>
<tr><td colspan="2"><div id="info" style="color: green;"></div></td></tr>

</BODY>
</HTML>