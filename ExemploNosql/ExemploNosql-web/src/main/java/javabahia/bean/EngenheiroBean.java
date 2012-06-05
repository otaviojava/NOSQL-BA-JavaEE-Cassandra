package javabahia.bean;

import java.util.List;
import javabahia.service.EngenheiroService;
import javabahia.model.Engenheiro;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author otavio
 */
@ViewScoped
@ManagedBean
public class EngenheiroBean {
    
    @Inject
    private EngenheiroService engenheiroService;
    
    private boolean novoBean;
    
    private Engenheiro engenheiro;
    
    public List<Engenheiro> getEngenheiros(){
    return engenheiroService.getEngineers();
    }
    
    
    /**
     * Criar um novo  engenheiro
     */
    public void novoEngenheiro(){
    novoBean=true;
    engenheiro=new Engenheiro();
        
    }
    /**
     * Editar engenheiro
     */
    public void editarEngenheiro(){
      novoBean=false;
    }
    /**
     * salvar mais um engenheiro
     */
    public void salvar() {
        if(novoBean){
        engenheiroService.salvar(engenheiro);
        }else{
        engenheiroService.editar(engenheiro);
        }
    }
    
  
    
    @Inject
    public void init(){
        setEngenheiro(new Engenheiro());
    }

    /**
     * @return the engenheiro
     */
    public Engenheiro getEngenheiro() {
        return engenheiro;
    }

    /**
     * @param engenheiro the engenheiro to set
     */
    public void setEngenheiro(Engenheiro engenheiro) {
      
        this.engenheiro = engenheiro;
    }
    
    
    
    
}
