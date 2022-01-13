package  ${package}.repositories;

import  ${package}.entities.Persona;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@ApplicationScoped
public class PersonaRepository extends GenericRepository<Persona>{
    @PersistenceContext(unitName = GenericRepository.PU)
    private EntityManager em;
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaRepository(){
        super(Persona.class);
    }


}
