<%-- 
    Document   : otrasconsolas
    Created on : 05-nov-2021, 10:39:53
    Author     : gonza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/otrasconsolas.css">
    <link type="img" rel="icon" href="../Logo.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Graduate&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Consolas</title>
</head>
<body>

    <header>

        <nav class="navbar navbar-expand-lg navbar-light " id="cabezera"  >
         <div class="container-fluid">
             <a href="#" class="navbar-brand"><img src="../logo-game.png" alt="" class="portada"></a>
           <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
             <span class="navbar-toggler-icon"></span>
           </button>
           <div class="collapse navbar-collapse" id="navbarNav">
             <ul class="nav navbar-nav">
               <li><a class="dropdown-item, white" href="ps4.html">🕹️ Juegos PS5</a></li>
               <li><a class="dropdown-item, white" href="xbox.html">🎮 Juegos Xbox</a></li>
               <li><a class="dropdown-item, white" href="complementos.html">🖥️ Complementos Gamer</a></li>
               
               <li><a class="dropdown-item, white" href="../index.jsp">🔙 Salir</a></li>
             </ul>
           </div>
         </div>
       </nav>
  </header>


<section id="title-enroll">
  <div class="jumbotron">
      <div class="container-fluid">
        <h1>Aqui podemos observar otras consolas</h1>
        <p>Podemos ver que hay cuatro tipos de consolas, 2 ninendo de diferente modelo y dos wii de diferentes modelos,
          las nintendos están hechas para poder llevarsela a los sitios y poder utilizarlas sin la necesidad de estas enchufadas
          a alguna corriente
        </p>
      
      </div>
  </div>
</section>

    <div id="tipos">
        <a href="#" id="consolas" class="atipos" onclick="menu('consolas')">Consolas</a>
        <a href="#" id="logo" class="atipos" onclick="menu('logo')">Logos</a>
    </div>


    <div id="caja1">
        <img src="../img_otrasconsolas/nintendo2.png" alt="nintendo" id="imgtipos">
        <img src="../img_otrasconsolas/switch.jpg" alt="switch" id="imgtipos">
        <img src="../img_otrasconsolas/wii.jpg" alt="wii" id="imgtipos">
        <img src="../img_otrasconsolas/wii_u.jpg" alt="wii_u" id="imgtipos">
    </div>

    <div id="caja2">
        <img src="../img_otrasconsolas/logo_nintengo2.png" alt="nintendo" id="imgtipos">
        <img src="../img_otrasconsolas/logo_switch.jpg" alt="switch" id="imgtipos">
        <img src="../img_otrasconsolas/logo_wii.png" alt="wii" id="imgtipos">
        <img src="../img_otrasconsolas/Wii-U-logo.png" alt="wii_u" id="imgtipos">
    </div>
    <footer id="footer">
      <div class="container-fluid">
          <p class="text-dark, white">Aprende sobre videojuegos &copy; 2021
          by <a href="#">Gonzalo Ignacio Quintero</a></p>
      </div>
  </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <script>
    function menu(id) {
    if(id=="consolas"){
        document.getElementById("caja1").style.display="block";
        document.getElementById("caja2").style.display="none";
    } else{
        document.getElementById("caja1").style.display="none";
        document.getElementById("caja2").style.display="block";
    }
    }
    </script>
</body>
</html>