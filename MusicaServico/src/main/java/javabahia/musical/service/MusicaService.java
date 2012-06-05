
package javabahia.musical.service;

import java.io.Serializable;
import java.util.List;
import javabahia.musical.dao.PersistenceCassandra;
import javabahia.musical.model.Musica;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author otavio
 */

@RequestScoped
public class MusicaService implements Serializable{
    @Inject
    private PersistenceCassandra persistenceCassandra;
    
    
    public List<Musica> listar(){
    
        return persistenceCassandra.listar(Musica.class);
    }
    
    public Musica recuperar(String nomeMusica){
    
    return (Musica) persistenceCassandra.recuperar(nomeMusica, Musica.class);
    }
    
    
    public boolean criar(Musica musica){
    return persistenceCassandra.criar(musica);
    }
    
    public boolean removerChave(String nomeMusica){
    return persistenceCassandra.removerPelaChave(nomeMusica, Musica.class);
    }
}
