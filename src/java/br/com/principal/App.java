package br.com.principal;

import br.com.model.beans.Contato;
import br.com.model.daos.GenericDao;


public class App {
       
    public static void main(String[] args) {
        
    //    Endereco e = new Endereco("Rua", "1", "casa", "Cen", "111", "car", "pe");
        Contato c = new Contato("999", "Celular");
        GenericDao gDao = new GenericDao();
        gDao.persist(c);
     //   Paciente p = new Paciente("A", true, 2, "Cadeirante", "Espirros", null, true, "mat", "123", "mas", new Date(), e, c);
    //    System.out.println(p.toString() + p.toString());
        
    }
    
}
