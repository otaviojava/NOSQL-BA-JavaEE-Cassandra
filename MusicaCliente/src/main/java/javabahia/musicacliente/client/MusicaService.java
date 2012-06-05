
package javabahia.musicacliente.client;

import java.io.Serializable;
import java.util.List;
import javabahia.musicacliente.client.model.Musica;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author otavio
 */

@RequestScoped
public class MusicaService implements Serializable{
    
    @Inject
    private MusicaClient musicaClient;
    
    public Musica[] getMusicas(){
    
        return musicaClient.getMusicas(Musica[].class);
    }
    
    public void inserir(Musica musica){
    
        musicaClient.addAlbum(musica);
        
        
    }
    
    public void atualizar(Musica musica){
    
        musicaClient.updateAlbum(musica.getNomeMusica(), musica.getAlbum(), musica.getLancamento().toString(), musica.getCantor());

    }
    
    public void remover(Musica musica){
        musicaClient.removeAlbum(musica.getNomeMusica());
    }
    
}
