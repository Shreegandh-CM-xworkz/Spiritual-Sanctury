package com.xworks.repository;

import com.xworks.dto.TravelEntity;
import com.xworks.singleton.EmfUtil;

import javax.persistence.*;

public class TravelRepositoryImpl implements TravelRepository{

    EntityManagerFactory emf= EmfUtil.getEmf();
    @Override
    public Integer save(TravelEntity travel) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("ET Begin");
            et.begin();
            em.persist(travel);
            System.out.println("Commiting");
            et.commit();
            return travel.getId();

        }catch (PersistenceException e){
            System.out.println("exception");
            et.rollback();

        }finally {
            System.out.println("closing");
            em.close();
        }
        return null;
    }
}
