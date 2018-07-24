package br.com.model.daos;

import br.com.model.beans.Contato;
import br.com.model.beans.Endereco;
import br.com.model.beans.Paciente;
import br.com.model.beans.Pessoa;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GenericDao {
    
    private static EntityManagerFactory emf; //factory de conexões
    private ContatoDao cDao;
    private EnderecoDao eDao;
    private PacienteDao pDao;
    
    public GenericDao(){
        emf = Persistence.createEntityManagerFactory("clinicaPU");        
    }
    
    public boolean persist(Object o) {
        if(o instanceof Contato){
            //validação
            cDao = new ContatoDao();
            return cDao.persist(o, emf);  
        }
        if(o instanceof Endereco){
            //validação
            eDao = new EnderecoDao();
            return eDao.persist(o, emf);  
        }
        if(o instanceof Paciente){
            //validação
            pDao = new PacienteDao();
            return pDao.persist(o, emf);  
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
