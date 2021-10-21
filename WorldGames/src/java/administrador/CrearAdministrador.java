/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

/**
 *
 * @author gonza
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.UsuarioJpaController;
import modelo.entidades.Usuario;


/**
 *
 * @author jose
 */
@WebServlet(name = "CrearAdministrador", urlPatterns = "/CrearAdministrador")
public class CrearAdministrador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Usuario usuario = new Usuario();
            usuario.setNombre("Administrador");
            usuario.setApellidos("");
            usuario.getCiudad("");
            usuario.getCodigoPostal("");
            
          //  pac.setDni("");
          //  pac.setAdministrador(true);
            String mensaje = "Se ha creado el Administrador";
            UsuarioJpaController ejc = 
                    new UsuarioJpaController(Persistence.createEntityManagerFactory("WorldgamesPU"));
            try {
                ejc.create(usuario);
            } catch (Exception ex) {
                mensaje = "Se ha producido un error al crear el Administrador";
                System.err.println(ex.getClass().getName() + ":" + ex.getMessage());
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CrearAdministrador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + mensaje + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }  
}
