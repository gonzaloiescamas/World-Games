/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.dao.ClienteJpaController;
import modelo.entidades.Cliente;
import modeloo.Wordgames;


/**
 *
 * @author gonza
 */
@WebServlet(name = "LoginAdmin", urlPatterns = {"/LoginAdmin"})
public class LoginAdmin extends HttpServlet {

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
        String login = request.getParameter("NombreUsu");
        String password = request.getParameter("Contraseña");
        String error = null;
        
       if (login == null || password == null) {
            error = "Debe acceder por la página de login";
        } else {
            if (login.isEmpty() || password.isEmpty()) {
                error = "Se deben rellenar los campos usuario y contraseña";
                
            } else {
                ClienteJpaController ejc = new 
                    ClienteJpaController(Persistence.createEntityManagerFactory("WordgamesPU"));
                List<Cliente> clientes = ejc.findClienteEntities();
                for (Cliente cliente : clientes) {
                    System.out.println(cliente.getContraseña()+ " " + password);
                    System.out.println(password.equals(cliente.getContraseña()));
                    if (cliente.getNombreusu().equals(login) && cliente.getContraseña().equals(password)) {
                        // Login correcto
                        System.out.println("usuario correcto");
                        HttpSession sesion = request.getSession();
                        sesion.setAttribute("usuario", cliente);
                        sesion.setAttribute("worldgames", new Wordgames());
                        response.sendRedirect("html/administrador.jsp");
                        return;
                    }
                }
                error = "Usuario o contraseña incorrectos";
            }
            
        }
        // Guardar el error y saltar a la vista de login
        request.setAttribute("error", error);
        getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
