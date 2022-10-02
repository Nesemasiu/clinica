<%-- 
    Document   : hospital
    Created on : 1/10/2022, 05:05:54 PM
    Author     : Usuario
--%>

<%@page import="Sipe.Hospital"%>
<%@page import="Sipe.Controlador"%>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
    <center>
        <h1>Busqueda paciente</h1>
        <form action ="paciente.jsp">
        <h2> Digite el nombre del Hospital: <input type="text" name = "nombre">
            <input type="submit" value="Buscar"></h2>    
        
        
    </center>
    <%
           String nombre ="";
           nombre=request.getParameter("nombre");
           Hospital l1 = new Hospital();
           out.println(l1.registrarHospital(nombre));
           
           
    %>    
    </form>
    </body>

</html>