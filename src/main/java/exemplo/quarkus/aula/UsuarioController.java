package exemplo.quarkus.aula;


import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioController {

    @POST
    @Transactional
    public Usuario salvar(Usuario usuario){
        usuario.persist();
        return usuario;
    }

    @GET
    public List<Usuario> listUsuario(){
        return Usuario.listAll();
    }

}
