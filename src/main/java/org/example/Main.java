package org.example;

import org.example.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main{

private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progetto8DB");
private static  EntityManager em = emf.createEntityManager();

    public static void main( String[] args ) {
        Evento evento = new Evento("Concerto Pino Danile","Album Nero a metà",2014-12-17,"Concerto",10000);



        emf.close();
        em.close();
    }

    public static void save(Evento e){
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }


}
