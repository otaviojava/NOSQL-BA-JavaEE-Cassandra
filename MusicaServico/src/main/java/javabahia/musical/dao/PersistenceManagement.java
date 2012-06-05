/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabahia.musical.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.easycassandra.persistence.EasyCassandraManager;
import org.easycassandra.persistence.Persistence;

/**
 *
 * @author otavio
 */

@ApplicationScoped
public class PersistenceManagement {
  
   @Produces 
   private Persistence persistence;
      
  @Inject
    public void init(){
    persistence=EasyCassandraManager.getPersistence("javabahia", "localhost", 9160);
    
    
    }     
}
