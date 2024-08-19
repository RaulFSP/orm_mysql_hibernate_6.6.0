/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.desempregado.projeto_orm;

import com.desempregado.classes.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



/**
 *
 * @author raul
 */
public class Projeto_orm {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoJanela");
        EntityManager em = emf.createEntityManager();
        Pessoa pessoa = new Pessoa("fulano", "fulano@mail.com");
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
