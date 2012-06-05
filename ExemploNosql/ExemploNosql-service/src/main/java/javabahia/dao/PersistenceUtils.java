
package javabahia.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import org.easycassandra.persistence.EasyCassandraManager;
import org.easycassandra.persistence.Persistence;

/**
 *
 * @author otavio
 */
@ApplicationScoped
public class PersistenceUtils {

    
    
    
    @Produces
    public Persistence getPersistence(){
    return  EasyCassandraManager.getPersistence("javabahia", "localhost", 9160);
    }
}

