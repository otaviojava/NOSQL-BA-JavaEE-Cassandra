package javabahia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Engineer")
public class Engenheiro extends Trabalhador {

	private static final long serialVersionUID = 6643883283637783076L;

	@Id
	private String nickName;
	
	@Column(name="type")
	private String tipo;
	
	@Column(name="especialization")
	private String especializacao;
        
       

    /**
     * @return the nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName the nickName to set
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the especializacao
     */
    public String getEspecializacao() {
        return especializacao;
    }

    /**
     * @param especializacao the especializacao to set
     */
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

 
	
	
}
