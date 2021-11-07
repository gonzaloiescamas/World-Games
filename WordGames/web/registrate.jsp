<%-- 
    Document   : registrate
    Created on : 05-nov-2021, 10:09:06
    Author     : gonza
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/registrate.css">
    <link type="img" rel="icon" href="Logo.png">
    <title>Registrate</title>
</head>
<body>

    
    <div>
        <h1>REGISTRATE</h1>
        <form action="Registrate" method="post">
            <label for="nombre">Primer Nombre</label>
            <input type="text" name="nombre" id="nombre" maxlength="20" value="${nombre}" required style="margin-left: 2.4vw;"> <br>
        
            <label for="apellidos" >Apellidos</label>
            <input type="text" name="apellidos" id="apellidos" maxlength="20" value="${apellidos}" required style="margin-left: 4.7vw;"><br>

            <label for="nombreusu" >Nombre de usuario</label>
            <input type="text" name="nombreusu" id="nombreusu" maxlength="20" value="${nombreusu}" required style="margin-left: 1vw;"><br>

            <label for="ciudad" >Ciudad</label>
            <input type="text" name="ciudad" id="ciudad" maxlength="20" value="${ciudad}" required style="margin-left: 5.5vw;"><br>

            <label for="codigopostal" >Codigo Postal</label>
            <input type="text" name="codigopostal" id="codigopostal" maxlength="5" value="${codigopostal}" required style="margin-left: 3vw;"><br>

            <label for="contraseña" >Contraseña</label>
            <input type="password" name="contraseña" id="contraseña" maxlength="10" value="${contraseña}" required style="margin-left: 3.8vw;"><br>

        
            <input type="submit" value="Iniciar Sesion">
            <button type="button"><a href="index.jsp">Salir</a></button>
        </form>
         
    </div>
       <c:if test="${not empty error}">
            <br>
            <div class="error">
                ${error}
            </div>
        </c:if>     
            
</body>
</html>
