package javabahia.dao;

import java.util.List;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.easycassandra.ConsistencyLevelCQL;
import org.easycassandra.persistence.JCassandra;
import org.easycassandra.persistence.Persistence;

@RequestScoped
public class PersistenceDao {

    @Inject
    private Persistence persistence;
    
    public boolean insert(Object bean) {
        return persistence.insert(bean, ConsistencyLevelCQL.ONE);
    }

    public boolean remove(Object bean) {
        return persistence.delete(bean);
    }

    public boolean removeFromRowKey(Object rowKey,Class baseClass) {
        return persistence.deleteByKeyValue(rowKey, baseClass);
    }

    public boolean update(Object bean) {
        return persistence.update(bean);
    }

    @SuppressWarnings("unchecked")
    public Object retrieve(Object id,Class baseClass) {
        return  persistence.findByKey(id, baseClass);
    }

    @SuppressWarnings("unchecked")
    public List listAll(Class baseClass) {
        return persistence.findAll(baseClass);
    }

    @SuppressWarnings("unchecked")
    public List listByIndex(Object index,Class baseClass) {
        return persistence.findByIndex(index, baseClass);
    }

    public Long count(Class baseClass) {
        return persistence.count(baseClass);
    }

    @SuppressWarnings("unchecked")
    public List findKeyIn(Class baseClass,Object... key) {
        return persistence.findByKeyIn(baseClass, key);
    }

    public boolean executeUpdateCql(String string) {
        return persistence.executeUpdateCql(string);
    }

    public List<Map<String, String>> executeCql(String string) {
        return persistence.executeCql(string);
    }

    public JCassandra createJCassandra(String cql) {
        return persistence.createJCassandra(cql);
    }
}
