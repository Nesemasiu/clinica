<%-- 
    Document   : paciente
    Created on : 1/10/2022, 05:05:35 PM
    Author     : Usuario
--%>

<%@page import="Sipe.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
    <center>
        <h1>Busqueda paciente</h1>
        <form action ="paciente.jsp">
        <h2> Digite el nombre del paciente: <input type="text" name = "nombre">
            <input type="submit" value="Buscar"></h2>    
        
        
    </center>
    <%
           String nombre ="";
           nombre=request.getParameter("nombre");
           Paciente l1 = new Paciente();
           out.println(l1.registroPaciente(nombre));   
           
           
    %>    
    </form>
    </body>

</html>
    