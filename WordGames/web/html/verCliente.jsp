<%-- 
    Document   : verCliente
    Created on : 07-nov-2021, 11:12:07
    Author     : gonza
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="worldgames" class="modeloo.Wordgames"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Word Games</title>
        
    </head>
    <body>
       
        <div>
            <table border="1">
                <tr>
                    <th>Nombre</th><th>Apellido</th><th>Codigo Postal</th><th>Nombre Usuario</th><th>Ciudad</th>
                    <c:forEach var="cliente" items="${worldgames.cliente}">
                        <tr>
                            <td>${cliente.nombre}</td>
                            <td>${cliente.apellidos}</td>
                          <td><fmt:formatNumber value="${vac.numeroDosi}"/></td>
                            <td>${cliente.nombreusu}</td>
                            <td>${cliente.ciudad}</td>
                           
                            <td>
                                <form action="EditarSanitario" method="POST">
                                    <input type="hidden" name="id" value="${cliente.id}">
                                    <input type="submit" value="Editar">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tr>
            </table>
            <br>
            <c:if test="${not empty error}">
                <br>
                <div class="error">
                    ${error}
                </div>
            </c:if>

            <br>
            <a href="administrador.jsp">Volver</a>
        </div>
    </body>
</html>
