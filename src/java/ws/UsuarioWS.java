/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import modelo.Usuario;

/**
 * REST Web Service
 *
 * @author max
 */
@Path("usuario")
public class UsuarioWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsuarioWS
     */
    public UsuarioWS() {
    }

    /**
     * Retrieves representation of an instance of ws.UsuarioWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "Ola mundo.......";
    }

    /**
     * Retrieves representation of an instance of ws.UsuarioWS
     * @return an instance of java.lang.String
     */
    @GET
    @Path("get/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsuarios() throws ClassNotFoundException, SQLException{
            Gson g = new Gson();
            UsuarioDAO dao = new UsuarioDAO();
            List<Usuario> usuario = dao.getUsuario();
            return g.toJson(usuario);
            
            
        
    }
    
    /**
     * PUT method for updating or creating an instance of UsuarioWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
