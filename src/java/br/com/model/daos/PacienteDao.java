/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.daos;

import br.com.model.beans.Contato;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author matheus
 */
public class PacienteDao {
    private EntityManager em;
    
    public boolean persist(Object o, EntityManagerFactory emf) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin(); //abre a transação com BD
            em.persist(o);  //diz ao framework o que vai ser feito: o que vai ser feito
            em.getTransaction().commit();//framework executa
            return true;
        } catch (Exception e) {  //criar as propprias exceções
            System.out.println("Erro no método Contato.persist()");
            e.printStackTrace();
            return false;
        } finally {
            em.close(); //fecha a transação
        }
    }

    public void merge() {

    }

    public void refresh() {

    }

    public void remove() {

    }

    public void find(Object o, EntityManagerFactory emf) {
        em = emf.createEntityManager();
        Contato c1 = (Contato) em.find(Contato.class, new Integer("1"));
        System.out.println("c.contato: " + c1.getContato());

    }

    public void getReference() {

    }
}
