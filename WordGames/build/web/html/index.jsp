<%-- 
    Document   : index
    Created on : 26-oct-2021, 18:52:15
    Author     : gonza
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, charset=iso-8859-1">
    <title>Word-Games</title>
    <link type="img" rel="icon" href="../Logo.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="../css/index.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Graduate&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
</head>
<body>
    <header>

           <nav class="navbar navbar-expand-lg navbar-light " id="cabezera"  >
            <div class="container-fluid">
                <a href="#" class="navbar-brand" style="color: black;">World-Games</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="nav navbar-nav">
                  <li><a class="dropdown-item" href="#" data-bs-toggle="modal" data-bs-target="#modalLogin" style="color: black;">? Contactanos</a></li>
                  <li><a class="dropdown-item" href="#" data-bs-toggle="modal" data-bs-target="#modalSignup" style="color: black;">? Iniciar Sesion</a></li>
                  <li><a class="dropdown-item" href="#" data-bs-toggle="modal" data-bs-target="#modalAdministrador" style="color: black;">?? Administrador</a></li>
                </ul>
              </div>
            </div>
          </nav>
     </header>
   <!--CONTACTANOS-->  
  <div class="modal fade" id="modalLogin" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="staticBackdropLabel">Contactanos:</h5>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
            <div class="modal-header">
              <a href="https://www.facebook.com/"> <i class="fa fa-facebook-f">World-Games</i></a> 
            </div>
            <div class="modal-header">
              <a href="https://twitter.com/?lang=es"> <i class="fa fa-twitter">World-Games</i></a>
            </div>
            <div class="modal-header">
              <a href="https://mail.google.com/"><i class="fa fa-envelope">World-Games@gmail.es</i></a>
            </div>
            <div class="modal-header">
              <a href="https://www.instagram.com/"><i class="fa fa-instagram">World-Games</i></a>            
            </div>
          
        </div>
    </div>
</div>
<!-- FIN CONTACTANOS-->  
<!--USUARIO-->  
<div class="modal fade" id="modalSignup" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-sm">
      <div class="modal-content">
          <div class="modal-header">
              <a href="" class="btn btn-primary btn-block" role="button">
                  <i class="fa fa-facebook">Inicia sesión con Facebook</i>
              </a>
          </div>
          <div class="modal-body">
              <p> o bien</p>
              <form>
                  <div class="form-group">
                      <label for="inputEmail">Email</label>
                      <input type="email" class="form-control" id="inputEmail" placeholder="Escriba tu email..."> <br>
                  </div>
                  <div class="form-group">
                      <label for="inputPassword">Contraseña</label>
                      <input type="password" class="form-control" id="inputPassword" placeholder="Escribe tu contraseña"> <br>
                  </div>
                  <button type="submit" class="btn btn-success btn-block"> <a class="inicio" href="otrasconsolas.html" >Iniciar sesión</a> </button>
                  
              </form>
          </div>
          <div class="modal-footer">
            <p><a href="">¿Has olvidado la contraseña?</a></p>
          </div>
          <div class="modal-footer">
            <p>¿No tienes cuenta?, registrate aquí</p>
            <button type="submit" class="btn btn-success btn-block"> <a class="inicio" href="#" data-bs-toggle="modal" data-bs-target="#modalSorte">Registrate</a> </button>
          </div>

      </div>
  </div>
</div>
 <!--FIN USUARIO-->     
<!--ADMINISTRADOR-->

<div class="modal fade" id="modalAdministrador" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true" action="Login" method="post">
  <div class="modal-dialog modal-sm">
      <div class="modal-content">
          <div class="modal-body">
              <form action="Login" method="post">
                  
                    <label for="NombreUsu">Usuario</label>
                    <input type="text" name="NombreUsu" id="NombreUsu" class="form-control" placeholder="Escriba tu usuario" required> <br>
                  
                 
                    <label for="Contraseña">Contraseña</label>
                    <input type="password" class="form-control" name="Contraseña" id="Contraseña" placeholder="Escribe tu contraseña"> <br>
                
                  <input type="submit" value="Iniciar Sesion">
                  
              </form>
          </div>
      </div>
  </div>
</div>

<c:if test="${!empty error}">
            <br>
            <div class="error">
                ${error}
            </div>
</c:if>

<!--FIN ADMINISTRADOR-->

     <section id="title-enroll">
        <div class="jumbotron">
            <div class="container-fluid">
                <h1>El mejor sitio para comprar tus juegos o consolas. Inviten a sus amigos<strong>CORRAN!!!!</strong></p>
            
            </div>
        </div>
    </section>
    <div class="container text-center" id="container">
        <h2>¿Qué podemos encontrar?</h2>
            <p class="lead">En esta tienda podemos encontrar desde juegos hasta muchos tipos de consolas o 
            accesorios de ordenador. 
            </p>

            <div class="row justify-content-md-center">
                <div class="col-md-4">
                
                    <h3>Juegos</h3>
                    <p><strong>Juegos</strong>de: Aventuras, accion, misterio, miedo...</p>
                </div>
                <div class="col-md-4">
                    
                    <h3>Consolas</h3>
                    <p><strong>Tipos:</strong> PS5, Xbox Serie X, Xbox Serie S, Nintendo, Switch</p>
                </div>

                <div class="col-md-4">
                    
                  <h3>Accesorios</h3>
                  <p>Ratones, alfombrilla, sillas, teclados, luces led.</p>
              </div>
            </div>
    </div>

    <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
      <ol class="carousel-indicators">
        <li data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"></li>
        <li data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"></li>
        <li data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"></li>
      </ol>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="../img_index/aventura1.jpg" class="d-block w-100" alt="..." id="carousel">
          <div class="carousel-caption d-none d-md-block">
            
            <p>Batman estará disponible el 18/Feb/2021</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="../img_index/aventura.jpg" class="d-block w-100" alt="..." id="carousel">
          <div class="carousel-caption d-none d-md-block">
            
            <p>Este es el juego de aventura mas vendido</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="../img_index/accion1.jpg" class="d-block w-100" alt="..." id="carousel">
          <div class="carousel-caption d-none d-md-block">
            
            <p>Variedad de juego de accion</p>
          </div>
        </div>
      </div>
      <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </a>
      <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </a>
    </div>
<!--REGISTRATE-->
    <div class="modal fade" id="modalSorte" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog modal-lg">
          <div class="modal-content">
              <div class="modal-header">
                  <a href="" class="btn btn-primary btn-block" role="button">
                      <i class="fa fa-facebook">Registrate sesión con Facebook</i>
                  </a>
              </div>
              
              <div class="modal-body">
                  <p> o bien</p>
                  <form class="row g-3 needs-validation" novalidate action="Index" method="POST">
                    <div class="col-md-4">
                      <label for="validationCustom01" class="form-label">Primer Nombre</label>
                       <input type="text" name="nombre" id="nombre" maxlength="20" value="${nombre}" required>
                      <div class="valid-feedback">
                        Bonito Nombre!
                      </div>
                    </div>
                    <div class="col-md-4">
                      <label for="validationCustom02" class="form-label">Apellidos</label>
                      <input type="text" name="apellidos" id="apellidos" maxlength="20" value="${apellidos}" required>
                      <div class="valid-feedback">
                        Boninto Apellido!
                      </div>
                    </div>
                    <div class="col-md-4">
                      <label for="validationCustomUsername" class="form-label">Nombre de usuario</label>
                      <input type="text" name="NombreUsu" id="NombreUsu" maxlength="10" value="${NombreUsu}" required>
                      
                    </div>
                    <div class="col-md-6">
                      <label for="validationCustom03" class="form-label">Ciudad</label>
                      <input type="text" name="Ciudad" id="Ciudad" maxlength="10" value="${Ciudad}" required>
                      <div class="invalid-feedback">
                        Porfavor ponga una ciudad.
                      </div>
                    </div>
                    <div class="col-md-3">
                      <label for="validationCustom05" class="form-label">Codigo Postal</label>
                       <input type="text" name="codigoPostal" id="codigoPostal" maxlength="10" value="${codigoPostal}" required>
                      <div class="invalid-feedback">
                       Porfavor ponga un codigo postal.
                      </div>
                    </div>
                    <div class="col-md-3">
                      <label for="validationCustom05" class="form-label">Contraseña</label>
                       <input type="text" name="Contraseña" id="Contraseña" maxlength="10" value="${Contraseña}" required>
                    </div>
                    <div class="col-12">
                      <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
                        <label class="form-check-label" for="invalidCheck">
                          Accepto los terminos
                        </label>
                        <div class="invalid-feedback">
                          Debes estar de acuerdo antes de enviar.
                        </div>
                      </div>
                    </div>
                    <div class="col-12">
                      <input type="submit" value="Registrar">
                    </div>
                  </form>
              </div>
        
          </div>
      </div>
  </div>
<!--FIN REGISTRATE-->
    <div class="inscribirse">
      <p class="animate__animated animate__heartBeat">Quieres conseguir un juego gratis <strong>inscribete ya aqui</strong> 
          <button class="col-md-3" data-bs-toggle="modal" data-bs-target="#modalSorte">¡Quiero inscribirme!</button></p>  
    </div>
  
  
  <footer id="footer">
      <div class="container-fluid">
          <p class="text-dark">Aprende sobre videojuegos &copy; 2021
          by <a href="#">Gonzalo Ignacio Quintero</a></p>
      </div>
  </footer>
  


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <script>
      (function () {
  'use strict'

 
  var forms = document.querySelectorAll('.needs-validation')

  Array.prototype.slice.call(forms)
    .forEach(function (form) {
      form.addEventListener('submit', function (event) {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }

        form.classList.add('was-validated')
      }, false)
    })
  })()
    </script>
</body>
</html>