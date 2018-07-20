package br.com.model.daos;

import br.com.model.beans.Contato;
import br.com.model.beans.Pessoa;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GenericDao {
    
    private static EntityManagerFactory emf; //factory de conexões
    private ContatoDao cDao;
    
    public GenericDao(){
        emf = Persistence.createEntityManagerFactory("clinicaPU");        
    }
    
    public boolean persist(Object o) {
        if(o instanceof Contato){
            //validação
            cDao = new ContatoDao();
            return cDao.persist(o, emf);
            
        }
        return true;
    }

    public void merge() {

    }

    public void refresh() {

    }

    public void remove() {

    }
    
    public void find(Object o) {
        if(o instanceof Contato){
            //validação
            cDao = new ContatoDao();
            cDao.find(o,emf);
            
        }
    }
}
