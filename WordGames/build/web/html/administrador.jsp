<%-- 
    Document   : administrador
    Created on : 31-oct-2021, 17:39:09
    Author     : gonza
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administracion</title>
    <link type="img" rel="icon" href="../logo-game.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/adminstrador.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Graduate&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
</head>
<body>

<header>

  <nav class="navbar navbar-expand-lg navbar-dark" id="cabezera">
       <div class="container-fluid">
        <a href="#" class="navbar-brand"><img src="../logo-game.png" alt="" class="portada"></a>
         <button class="navbar-toggler bg-dark" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavlightDropdown" aria-controls="navbarNavlightDropdown" aria-expanded="false" aria-label="Toggle navigation">
           <span class="navbar-toggler-icon "></span>
         </button>
         <div class="collapse navbar-collapse " id="navbarNavlightDropdown">
           <ul class="navbar-nav">
             <li class="nav-item dropdown">
               <a class="nav-link dropdown-toggle text-dark" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                 Gonzalo Ignacio
               </a>
               <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarlightDropdownMenuLink">
                 <li><a class="dropdown-item" href="index.html">???? Salir</a></li>
               </ul>
             </li>
           </ul>
         </div>
       </div>
     </nav>
</header>
<div class="wrap" id="curriculo">
  <div class="accordion" id="accordionExample">
      <div class="accordion-item">
        <h2 class="accordion-header" id="headingOne">
          <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
            Seccion 1: Usuarios
          </button>
        </h2>
        <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
          <div class="accordion-body">
            <form>
              <fieldset>
                <legend>Usuario a eliminar:</legend>
                  <select size="3">
                  <option>Luis</option>
                  <option>Amanda</option>
                  <option>Gloria</option>
                  <option>Rafa</option>
                  </select><br><br>
              </fieldset>
           
            <fieldset>
              <legend>Modificar Usuario:</legend>
                DNI: <input type="text" style="position: relative; margin-left: 7.1rem;"> <br><br>
                Nuevo Nombre<input type="text" style="position: relative; margin-left: 2.5rem;"><br><br>
                Nueva contrase??a: <input type="password" style="position: relative; margin-left: 1rem;"><br><br>
                <input type="submit" value="Enviar">
            </fieldset>

          </form>
        </div>
      </div>
      <div class="accordion-item">
        <h2 class="accordion-header" id="headingTwo">
          <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
            Secci??n 2: Cambiar Foto de usuarios
          </button>
        </h2>
        <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
          <div class="accordion-body">
            <label>Foto de perfil *</label> 
            <input type="file" id="inputFile1"><br>
            <img id="img1" src="https://via.placeholder.com/150" alt="Imagen" >
            <br><br>
            <button  class="enviar"><a href="#" class="actualizar">Actualizar perfil</a></button>
          </div>
        </div>
      </div>
      <div class="accordion-item">
        <h2 class="accordion-header" id="headingThree">
          <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
            Secci??n 3: Administrar tienda
          </button>
        </h2>
        <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#accordionExample">
          <div class="accordion-body">
            <form>
              Agregar Juego: <br>
              <select size="3">
              <option>PS5</option>
              <option>Xbox</option>
              <option>Nintendo</option>
              <option>Switch</option>
              </select><br><br>
              Nombre del juego: <input type="text" style="position: relative; margin-left: 1rem;"> <br> <br>
              Precio: <input type="number" style="position: relative; margin-left: 6.4rem;"> <br> <br>
              Codigo: <input type="number" style="position: relative; margin-left: 6rem;"> <br> <br>

              Agregar Complemento: <br>
              <select size="3">
              <option>Raton</option>
              <option>Teclado</option>
              <option>Sillas</option>
              <option>Cascos</option>
              </select><br><br>

              Precio: <input type="number" style="position: relative; margin-left: 6.4rem;"> <br> <br>
              Codigo: <input type="number" style="position: relative; margin-left: 6rem;"> <br> <br>
              <input type="submit" value="Enviar">
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>

 <footer id="footer">
    <div class="container-fluid">
        <p class="text-dark">Aprende sobre videojuegos &copy; 2021 
        by <a href="#">Gonzalo Ignacio Quintero</a></p>
    </div>
</footer>

      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
      <script src="../javascript/js_administrador.js"></script>
</body>
</html>