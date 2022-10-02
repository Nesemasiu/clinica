<%-- 
    Document   : medico
    Created on : 1/10/2022, 05:05:43 PM
    Author     : Usuario
--%>

<%@page import="Sipe.Medico"%>
<%@page import="Sipe.Controlador"%>
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
        <h2> Digite el nombre del medico: <input type="text" name = "nombre">
            <input type="submit" value="Buscar"></h2>    
        
        
    </center>
    <%
           String nombre ="";
           nombre=request.getParameter("nombre");
           Medico l1 = new Medico();
           out.println(l1.registroMedico(nombre));
           
    %>    
    </form>
    </body>

</html>