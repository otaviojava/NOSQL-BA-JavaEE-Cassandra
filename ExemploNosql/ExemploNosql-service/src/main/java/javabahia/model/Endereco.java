
package javabahia.model;

import java.io.Serializable;
import javax.persistence.Column;

/**
 *
 * @author otavio
 */
public class Endereco implements  Serializable{
      
    @Column
    private String rua;
    
    @Column
    private String cidade;
    
    @Column
    private String estado;

   
    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
