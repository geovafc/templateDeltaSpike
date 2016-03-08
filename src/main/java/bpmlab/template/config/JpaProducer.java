/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpmlab.template.config;

import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bpmlab
 */
public class JpaProducer {
   
    public static final String PU = "bpmlab_template_war_1.0-SNAPSHOTPU";
    
    @Produces
    @ApplicationScoped
    public EntityManagerFactory createEntityMangerFactory() {
        return Persistence.createEntityManagerFactory(PU);
    } 
    
    @Produces
    @RequestScoped
    public EntityManager createEntityManger(EntityManagerFactory entityManagerFactory) {
        return entityManagerFactory.createEntityManager();
    }
    
    public void disposeEntityManagerFactory(@Disposes EntityManagerFactory entityManagerFactory) {
        if (entityManagerFactory.isOpen())
            entityManagerFactory.close();
    }
    
    public void disposeEntityManager(@Disposes EntityManager entityManager) {
        if (entityManager.isOpen())
            entityManager.close();
    }
}
