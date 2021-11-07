/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.entidades.Cliente;
import modeloo.Wordgames;

/**
 *
 * @author gonza
 */
@WebServlet(name = "Registrate", urlPatterns = {"/Registrate"})
public class Registrate extends HttpServlet {

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
        String error = null;
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String NombreUsu = request.getParameter("nombreusu");
        String Contraseña = request.getParameter("contraseña");
        String Ciudad = request.getParameter("ciudad");
        int CodigoPostal = Integer.parseInt(request.getParameter("codigopostal"));
        
        Cliente nuevo = new Cliente();
        nuevo.setNombre(nombre);
        nuevo.setApellidos(apellidos);
        nuevo.setNombreusu(NombreUsu);
        nuevo.setContraseña(Contraseña);
        nuevo.setCiudad(Ciudad);
        nuevo.setCodigoPostal(CodigoPostal);
        Wordgames worldgames = (Wordgames)request.getSession().getAttribute("worldgames");
        try {
           worldgames.altaCliente(nuevo);
        } catch (Exception ex) {
            error = "Ya existe un cliente con el usuario " + NombreUsu;
            ex.printStackTrace();
        }
        if (error != null) {
            request.setAttribute("error", error);
            request.setAttribute("nombre", nombre);
            request.setAttribute("apellido", apellidos);
            request.setAttribute("nombreusu", NombreUsu);
            request.setAttribute("contraseña", Contraseña);
            request.setAttribute("ciudad", Ciudad);
            request.setAttribute("codigopostal", CodigoPostal);
            
            getServletContext().getRequestDispatcher("/registrate.jsp").forward(request, response);
        } else {
            String mensaje = "Se ha dado de alta al cliente"; 
           response.sendRedirect(response.encodeRedirectURL("html/otrasconsolas.jsp?mensaje=" + mensaje));
        }
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
