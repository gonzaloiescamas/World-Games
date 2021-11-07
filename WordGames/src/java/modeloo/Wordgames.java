/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloo;

/**
 *
 * @author gonza
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelo.dao.ClienteJpaController;
import modelo.dao.exceptions.NonexistentEntityException;
import modelo.entidades.Cliente;


/**
 *
 * @author gonza
 */
public class Wordgames implements Serializable {
    
    // Unidad de Persistencia
    public static final String PERSISTENCIA = "WordgamesPU";
    
    /*Clientes*/
    
    public List<Cliente> getCliente() {
        ClienteJpaController ejc = new 
        ClienteJpaController(Persistence.createEntityManagerFactory(PERSISTENCIA));
        return ejc.findClienteEntities();
    }
    
    public List<Cliente> getClienteAlfabeticamente() {
        List<Cliente> cliente = getCliente();
        Collections.sort(cliente, (e1, e2) ->
                (e1.getApellidos() + e1.getNombre()).compareTo(e2.getApellidos() + e2.getNombre()));
        return cliente;
    }
    
    public void altaCliente(Cliente cliente) throws Exception {
        ClienteJpaController ejc = new 
            ClienteJpaController(Persistence.createEntityManagerFactory(PERSISTENCIA));
            ejc.create(cliente);
    }
    
    public Cliente buscarCliente(Long id) {
        ClienteJpaController ejc = new 
            ClienteJpaController(Persistence.createEntityManagerFactory(PERSISTENCIA));
        return ejc.findCliente(id);
    }
    
    public void actualizarCliente(Cliente cliente) throws Exception {
        ClienteJpaController ejc = new 
        ClienteJpaController(Persistence.createEntityManagerFactory(PERSISTENCIA));
        ejc.edit(cliente);
    }
    
    public void eliminarCliente(Long id) throws Exception {
        ClienteJpaController ejc = new 
        ClienteJpaController(Persistence.createEntityManagerFactory(PERSISTENCIA));
        ejc.destroy(id);        
    }
   

}
