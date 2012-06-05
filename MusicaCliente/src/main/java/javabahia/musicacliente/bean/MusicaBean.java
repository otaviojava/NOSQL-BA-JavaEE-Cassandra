package javabahia.musicacliente.bean;

import java.io.Serializable;
import javabahia.musicacliente.client.MusicaService;
import javabahia.musicacliente.client.model.Musica;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author otavio
 */

@ViewScoped
@ManagedBean
public class MusicaBean implements Serializable{
    
    @Inject
    private MusicaService musicaService;
    
    @Inject
    private Musica musica;
    
     private boolean novoBean;
    
    public Musica[] getMusicas(){
    return musicaService.getMusicas();
    }
    
      /**
     * Criar um nova Musica
     */
    public void novaMusica(){
    novoBean=true;
    musica=new Musica();
        
    }
    /**
     * Editar musica
     */
    public void editaMusica(){
      novoBean=false;
    }
    
        /**
     * salva ou edita música
     */
    public void salvar() {
        if(novoBean){
        musicaService.inserir(musica);
        }else{
        musicaService.atualizar(musica);
        }
    }
    
    
    @Inject
    public void init(){
      
    }

    /**
     * @return the musica
     */
    public Musica getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
    public void setMusica(Musica musica) {
        this.musica = musica;
    }
}
