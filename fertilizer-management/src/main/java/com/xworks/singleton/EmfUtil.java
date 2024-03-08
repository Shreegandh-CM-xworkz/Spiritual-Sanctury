package com.xworks.singleton;

import lombok.Getter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Persistence;


public class EmfUtil {


    private static EntityManagerFactory emf;
    public static EntityManagerFactory getEmf(){
        return emf;
    }

    static{
        System.out.println("Initialising emf in static block so that instance is created only once");
        emf= Persistence.createEntityManagerFactory("x-workz");
        System.out.println("init done");
    }
}
