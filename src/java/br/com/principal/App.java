package br.com.principal;

import br.com.model.beans.Contato;
import br.com.model.beans.Endereco;
import br.com.model.beans.Paciente;
import br.com.model.daos.GenericDao;
import java.util.Date;


public class App {
       
    public static void main(String[] args) {
        
        GenericDao gDao = new GenericDao();
        
        Contato c = new Contato("999", "Celular");
        gDao.persist(c);
        
        Endereco e = new Endereco("Rua 02", "2", "Casa", "Centro", "56820000", "Carn", "PE");
        gDao.persist(e);
        
        Paciente p = new Paciente("A", true, 2, "Cadeirante", "Espirros", null, true, "mat", "123", "mas", new Date(), e, c);
        gDao.persist(p);

        //System.out.println(p.toString());
        
        System.exit(0);
    }
    
}
