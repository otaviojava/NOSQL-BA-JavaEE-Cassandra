/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabahia.service;

import java.util.List;
import javabahia.dao.PersistenceDao;
import javabahia.model.Engenheiro;
import javax.ejb.Stateless;
import javax.inject.Inject;


/**
 *
 * @author otavio
 */
@Stateless
public class EngenheiroService {
    
   @Inject
    private PersistenceDao persistence;
    
    
    public List<Engenheiro> getEngineers(){
        
        return persistence.listAll(Engenheiro.class);
    }
    
    /**
     * Salvar o engenheiro
     * @param engenheiro 
     */
    public void salvar(Engenheiro engenheiro){
    
        persistence.insert(engenheiro);
    }
    public void editar(Engenheiro engenheiro){
    
        persistence.update(engenheiro);
    }
    
    
    
}
