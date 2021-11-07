<%-- 
    Document   : loginUsuario
    Created on : 05-nov-2021, 10:08:50
    Author     : gonza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/loginUsuario.css">
    <link type="img" rel="icon" href="Logo.png">
    <title>Usuario</title>
</head>
<body>
    <div>
        <h1>Bienvenido Usuario</h1>
        <form action="LoginCliente" method="post">
            <label for="NombreUsu">Usuario</label>
            <input type="text" name="NombreUsu" id="NombreUsu" placeholder="Escribe su usuario" required style="margin-left: 2.5vw;"> <br>
        
            <label for="Contraseña">Contraseña</label>
            <input type="password" name="Contraseña" id="Contraseña" placeholder="Escribe tu contraseña" required style="margin-left: 1vw;"> <br>
        
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