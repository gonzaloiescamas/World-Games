<%-- 
    Document   : index
    Created on : 05-nov-2021, 10:38:30
    Author     : gonza
--%>

<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, charset=iso-8859-1">
    <title>Word-Games</title>
    <link type="img" rel="icon" href="Logo.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Graduate&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
</head>
<body>

  <!--CABECERA-->
    <header>

           <nav class="navbar navbar-expand-lg navbar-light " id="cabezera"  >
            <div class="container-fluid">
                <a href="#" class="navbar-brand, white">World Games</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="nav navbar-nav">
                  <li><a class="dropdown-item white" href="#" data-bs-toggle="modal" data-bs-target="#modalLogin">Contactanos</a></li>
                  <li><a class="dropdown-item white" href="loginUsuario.jsp" >Iniciar sesión</a></li>
                  <li><a class="dropdown-item white" href="loginAdmin.jsp" >Administrador</a></li>
                 
                </ul>
              </div>
            </div>
          </nav>
     </header>
  <!--FIN CABECERA-->
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
          <img src="img_index/aventura1.jpg" class="d-block w-100" alt="..." id="carousel">
          <div class="carousel-caption d-none d-md-block">
            
            <p>Batman estará disponible el 23/Jun/2022</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="img_index/aventura.jpg" class="d-block w-100" alt="..." id="carousel">
          <div class="carousel-caption d-none d-md-block">
            
            <p>Este es el juego de aventura mas vendido</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="img_index/accion1.jpg" class="d-block w-100" alt="..." id="carousel">
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
    <div class="inscribirse">
      <p class="animate__animated animate__heartBeat">Registrate ya para poder comprar tus juegos
        <button class="col-md-3, registrate" data-bs-toggle="modal" data-bs-target="#modalSorte"> <a href="registrate.jsp">¡Quiero inscribirme!</a> </button></p>  
    </div>
    <!--FIN REGISTRATE-->
  
  <footer id="footer">
      <div class="container-fluid">
          <p class="text-dark, white">Aprende sobre videojuegos &copy; 2021
          by <a href="#" class="white">Gonzalo Ignacio Quintero</a></p>
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
