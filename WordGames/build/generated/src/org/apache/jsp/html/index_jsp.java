package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=iso-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, charset=iso-8859-1\">\n");
      out.write("    <title>Word-Games</title>\n");
      out.write("    <link type=\"img\" rel=\"icon\" href=\"../Logo.png\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/index.css\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Graduate&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("\n");
      out.write("           <nav class=\"navbar navbar-expand-lg navbar-light \" id=\"cabezera\"  >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a href=\"#\" class=\"navbar-brand\" style=\"color: black;\">World-Games</a>\n");
      out.write("              <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("              </button>\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                  <li><a class=\"dropdown-item\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#modalLogin\" style=\"color: black;\">? Contactanos</a></li>\n");
      out.write("                  <li><a class=\"dropdown-item\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#modalSignup\" style=\"color: black;\">? Iniciar Sesion</a></li>\n");
      out.write("                  <li><a class=\"dropdown-item\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#modalAdministrador\" style=\"color: black;\">?? Administrador</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("     </header>\n");
      out.write("   <!--CONTACTANOS-->  \n");
      out.write("  <div class=\"modal fade\" id=\"modalLogin\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-sm\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <h5 class=\"modal-title\" id=\"staticBackdropLabel\">Contactanos:</h5>\n");
      out.write("            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <a href=\"https://www.facebook.com/\"> <i class=\"fa fa-facebook-f\">World-Games</i></a> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <a href=\"https://twitter.com/?lang=es\"> <i class=\"fa fa-twitter\">World-Games</i></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <a href=\"https://mail.google.com/\"><i class=\"fa fa-envelope\">World-Games@gmail.es</i></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <a href=\"https://www.instagram.com/\"><i class=\"fa fa-instagram\">World-Games</i></a>            \n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- FIN CONTACTANOS-->  \n");
      out.write("<!--USUARIO-->  \n");
      out.write("<div class=\"modal fade\" id=\"modalSignup\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-sm\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("              <a href=\"\" class=\"btn btn-primary btn-block\" role=\"button\">\n");
      out.write("                  <i class=\"fa fa-facebook\">Inicia sesión con Facebook</i>\n");
      out.write("              </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-body\">\n");
      out.write("              <p> o bien</p>\n");
      out.write("              <form>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <label for=\"inputEmail\">Email</label>\n");
      out.write("                      <input type=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Escriba tu email...\"> <br>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <label for=\"inputPassword\">Contraseña</label>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Escribe tu contraseña\"> <br>\n");
      out.write("                  </div>\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-success btn-block\"> <a class=\"inicio\" href=\"otrasconsolas.html\" >Iniciar sesión</a> </button>\n");
      out.write("                  \n");
      out.write("              </form>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <p><a href=\"\">¿Has olvidado la contraseña?</a></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <p>¿No tienes cuenta?, registrate aquí</p>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success btn-block\"> <a class=\"inicio\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#modalSorte\">Registrate</a> </button>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" <!--FIN USUARIO-->     \n");
      out.write("<!--ADMINISTRADOR-->\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"modalAdministrador\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\" action=\"Login\" method=\"post\">\n");
      out.write("  <div class=\"modal-dialog modal-sm\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-body\">\n");
      out.write("              <form action=\"Login\" method=\"post\">\n");
      out.write("                  \n");
      out.write("                    <label for=\"NombreUsu\">Usuario</label>\n");
      out.write("                    <input type=\"text\" name=\"NombreUsu\" id=\"NombreUsu\" class=\"form-control\" placeholder=\"Escriba tu usuario\" required> <br>\n");
      out.write("                  \n");
      out.write("                 \n");
      out.write("                    <label for=\"Contraseña\">Contraseña</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"Contraseña\" id=\"Contraseña\" placeholder=\"Escribe tu contraseña\"> <br>\n");
      out.write("                \n");
      out.write("                  <input type=\"submit\" value=\"Iniciar Sesion\">\n");
      out.write("                  \n");
      out.write("              </form>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!--FIN ADMINISTRADOR-->\n");
      out.write("\n");
      out.write("     <section id=\"title-enroll\">\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <h1>El mejor sitio para comprar tus juegos o consolas. Inviten a sus amigos<strong>CORRAN!!!!</strong></p>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <div class=\"container text-center\" id=\"container\">\n");
      out.write("        <h2>¿Qué podemos encontrar?</h2>\n");
      out.write("            <p class=\"lead\">En esta tienda podemos encontrar desde juegos hasta muchos tipos de consolas o \n");
      out.write("            accesorios de ordenador. \n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <div class=\"row justify-content-md-center\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                \n");
      out.write("                    <h3>Juegos</h3>\n");
      out.write("                    <p><strong>Juegos</strong>de: Aventuras, accion, misterio, miedo...</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    \n");
      out.write("                    <h3>Consolas</h3>\n");
      out.write("                    <p><strong>Tipos:</strong> PS5, Xbox Serie X, Xbox Serie S, Nintendo, Switch</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    \n");
      out.write("                  <h3>Accesorios</h3>\n");
      out.write("                  <p>Ratones, alfombrilla, sillas, teclados, luces led.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("      <ol class=\"carousel-indicators\">\n");
      out.write("        <li data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("        <li data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\"></li>\n");
      out.write("        <li data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\"></li>\n");
      out.write("      </ol>\n");
      out.write("      <div class=\"carousel-inner\">\n");
      out.write("        <div class=\"carousel-item active\">\n");
      out.write("          <img src=\"../img_index/aventura1.jpg\" class=\"d-block w-100\" alt=\"...\" id=\"carousel\">\n");
      out.write("          <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("            \n");
      out.write("            <p>Batman estará disponible el 18/Feb/2021</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"carousel-item\">\n");
      out.write("          <img src=\"../img_index/aventura.jpg\" class=\"d-block w-100\" alt=\"...\" id=\"carousel\">\n");
      out.write("          <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("            \n");
      out.write("            <p>Este es el juego de aventura mas vendido</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"carousel-item\">\n");
      out.write("          <img src=\"../img_index/accion1.jpg\" class=\"d-block w-100\" alt=\"...\" id=\"carousel\">\n");
      out.write("          <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("            \n");
      out.write("            <p>Variedad de juego de accion</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <a class=\"carousel-control-prev\" href=\"#carouselExampleCaptions\" role=\"button\" data-bs-slide=\"prev\">\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"visually-hidden\">Previous</span>\n");
      out.write("      </a>\n");
      out.write("      <a class=\"carousel-control-next\" href=\"#carouselExampleCaptions\" role=\"button\" data-bs-slide=\"next\">\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"visually-hidden\">Next</span>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("<!--REGISTRATE-->\n");
      out.write("    <div class=\"modal fade\" id=\"modalSorte\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"modal-dialog modal-lg\">\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                  <a href=\"\" class=\"btn btn-primary btn-block\" role=\"button\">\n");
      out.write("                      <i class=\"fa fa-facebook\">Registrate sesión con Facebook</i>\n");
      out.write("                  </a>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("                  <p> o bien</p>\n");
      out.write("                  <form class=\"row g-3 needs-validation\" novalidate action=\"Index\" method=\"POST\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                      <label for=\"validationCustom01\" class=\"form-label\">Primer Nombre</label>\n");
      out.write("                       <input type=\"text\" name=\"nombre\" id=\"nombre\" maxlength=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                      <div class=\"valid-feedback\">\n");
      out.write("                        Bonito Nombre!\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                      <label for=\"validationCustom02\" class=\"form-label\">Apellidos</label>\n");
      out.write("                      <input type=\"text\" name=\"apellidos\" id=\"apellidos\" maxlength=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${apellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                      <div class=\"valid-feedback\">\n");
      out.write("                        Boninto Apellido!\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                      <label for=\"validationCustomUsername\" class=\"form-label\">Nombre de usuario</label>\n");
      out.write("                      <input type=\"text\" name=\"NombreUsu\" id=\"NombreUsu\" maxlength=\"10\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${NombreUsu}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                      <label for=\"validationCustom03\" class=\"form-label\">Ciudad</label>\n");
      out.write("                      <input type=\"text\" name=\"Ciudad\" id=\"Ciudad\" maxlength=\"10\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Ciudad}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                      <div class=\"invalid-feedback\">\n");
      out.write("                        Porfavor ponga una ciudad.\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                      <label for=\"validationCustom05\" class=\"form-label\">Codigo Postal</label>\n");
      out.write("                       <input type=\"text\" name=\"codigoPostal\" id=\"codigoPostal\" maxlength=\"10\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${codigoPostal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                      <div class=\"invalid-feedback\">\n");
      out.write("                       Porfavor ponga un codigo postal.\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                      <label for=\"validationCustom05\" class=\"form-label\">Contraseña</label>\n");
      out.write("                       <input type=\"text\" name=\"Contraseña\" id=\"Contraseña\" maxlength=\"10\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Contraseña}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                      <div class=\"form-check\">\n");
      out.write("                        <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"invalidCheck\" required>\n");
      out.write("                        <label class=\"form-check-label\" for=\"invalidCheck\">\n");
      out.write("                          Accepto los terminos\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"invalid-feedback\">\n");
      out.write("                          Debes estar de acuerdo antes de enviar.\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                      <input type=\"submit\" value=\"Registrar\">\n");
      out.write("                    </div>\n");
      out.write("                  </form>\n");
      out.write("              </div>\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("<!--FIN REGISTRATE-->\n");
      out.write("    <div class=\"inscribirse\">\n");
      out.write("      <p class=\"animate__animated animate__heartBeat\">Quieres conseguir un juego gratis <strong>inscribete ya aqui</strong> \n");
      out.write("          <button class=\"col-md-3\" data-bs-toggle=\"modal\" data-bs-target=\"#modalSorte\">¡Quiero inscribirme!</button></p>  \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <footer id=\"footer\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("          <p class=\"text-dark\">Aprende sobre videojuegos &copy; 2021\n");
      out.write("          by <a href=\"#\">Gonzalo Ignacio Quintero</a></p>\n");
      out.write("      </div>\n");
      out.write("  </footer>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>\n");
      out.write("      (function () {\n");
      out.write("  'use strict'\n");
      out.write("\n");
      out.write(" \n");
      out.write("  var forms = document.querySelectorAll('.needs-validation')\n");
      out.write("\n");
      out.write("  Array.prototype.slice.call(forms)\n");
      out.write("    .forEach(function (form) {\n");
      out.write("      form.addEventListener('submit', function (event) {\n");
      out.write("        if (!form.checkValidity()) {\n");
      out.write("          event.preventDefault()\n");
      out.write("          event.stopPropagation()\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form.classList.add('was-validated')\n");
      out.write("      }, false)\n");
      out.write("    })\n");
      out.write("  })()\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <br>\n");
        out.write("            <div class=\"error\">\n");
        out.write("                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("            </div>\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <br>\n");
        out.write("            <div class=\"error\">\n");
        out.write("                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
