
package javabahia.musicacliente.client.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
public class Musica implements Serializable{
    

    
    @Id
    private String nomeMusica;
    
    @Column
    private String cantor;
    
    @Column
    private String album;
    
    @Column
    private Integer lancamento;

    /**
     * @return the nomeMusica
     */
    public String getNomeMusica() {
        return nomeMusica;
    }

    /**
     * @param nomeMusica the nomeMusica to set
     */
    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    /**
     * @return the cantor
     */
    public String getCantor() {
        return cantor;
    }

    /**
     * @param cantor the cantor to set
     */
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    /**
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @param album the album to set
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * @return the lancamento
     */
    public Integer getLancamento() {
        return lancamento;
    }

    /**
     * @param lancamento the lancamento to set
     */
    public void setLancamento(Integer lancamento) {
        this.lancamento = lancamento;
    }

 
    
    
    
}
