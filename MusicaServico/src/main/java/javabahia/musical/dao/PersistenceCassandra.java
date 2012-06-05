package javabahia.musical.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.easycassandra.persistence.Persistence;

/**
 *
 * @author otavio
 */
@RequestScoped
public class PersistenceCassandra {
    @Inject    
    private Persistence persistence;
    
    
    public List listar(Class baseClass){
    return persistence.findAll(baseClass);
    }
    
    public boolean atualizar(Object bean){
    return persistence.update(bean);
    }
    
    
    public Object recuperar(Object chave,Class baseClass){
    return persistence.findByKey(chave, baseClass);
    }
    public boolean criar(Object bean){
    return persistence.insert(bean);
    }
    
    public boolean  remover(Object bean){
    return persistence.delete(bean);
    }
    public boolean  removerPelaChave(Object chave,Class baseClass){
    return persistence.deleteByKeyValue(chave, baseClass);
    }
}
