package com.github.devproject.learnjava8.jpa;

import com.github.devproject.learnjava8.Feature;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.stream.IntStream;

public class JpaTester implements Feature {
    @Override
    public void runFeature() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
        EntityManager em = emf.createEntityManager();


        IntStream.range(1,100)
                .forEach(i -> System.out.println(em.find(City.class, i)));



    }
}
