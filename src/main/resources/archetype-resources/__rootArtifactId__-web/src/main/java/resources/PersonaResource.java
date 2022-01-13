package ${package}.resources;

//import org.keycloak.representations.AccessToken;
import ${package}.repositories.PersonaRepository;
import  ${package}.entities.Persona;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@ApplicationScoped
@Path("persona")
@Produces(MediaType.APPLICATION_JSON)
public class PersonaResource {

    //@Inject
    //AccessToken accessToken;

    //public String getCurrentUser() {        return accessToken.getPreferredUsername();    }

    @Inject
    PersonaRepository personaRepository;

    @GET
    public List<Persona> findAll(){
        return personaRepository.findAll();
    }

    @GET
    @Path("/{id}")
    public Persona findById(@PathParam("id") Long id){
        return personaRepository.find(id);
    }
}
