package javabahia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;



@MappedSuperclass
public class Trabalhador implements Serializable {

	private static final long serialVersionUID = -5568409094833637814L;

	@Column(name="name")
	private String nome;
	
	@Column(name="salary")
	private Double salario;
        
         @Embedded
         private Endereco endereco;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
        
        
        

	
	
	
	public Trabalhador(){
        endereco=new Endereco();
        }
}
