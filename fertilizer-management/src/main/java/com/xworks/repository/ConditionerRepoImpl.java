package com.xworks.repository;

import com.xworks.dto.ConditionerEntity;
import com.xworks.singleton.EmfUtil;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class ConditionerRepoImpl implements ConditionerRepo{
    EntityManagerFactory emf= EmfUtil.getEmf();

    @Override
    public void save(ConditionerEntity entity) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            em.persist(entity);
            et.commit();
            System.out.println("Saved");

        }catch (PersistenceException e){
            System.err.println("Persistence ecxeption"+ e.getMessage());
            et.rollback();


        }finally {
            em.close();

        }
    }

    @Override
    public void saveAll(List<ConditionerEntity> entity) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            entity.forEach(e-> em.persist(e));
            et.commit();
            System.out.println("Saved all");

        }catch (PersistenceException e){
            System.err.println("Persistence ecxeption"+ e.getMessage());
            et.rollback();


        }finally {
            em.close();

        }

    }
    @Override
    public Boolean updateNetQuantityByBrand(String brand,String quantity){
        Boolean isUpdated=false;
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query=em.createNamedQuery("updateNetQuantityByBrand");
            query.setParameter("quantity",quantity);
            query.setParameter("brand",brand);
            int result =query.executeUpdate();
            if (result==1) {
                System.out.println("Updated");
                isUpdated=true;
            }
            else System.out.println("No Updated");
            et.commit();

        }catch (PersistenceException e){
            System.err.println("Exception "+e.getMessage());
            et.rollback();

        }finally {
            em.close();

        }

        return isUpdated;
    }


    @Override
    public List<ConditionerEntity> findAllByBrand(String brand){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query = em.createNamedQuery("findAllByBrand");
            query.setParameter("brand",brand);
            List<ConditionerEntity> list=query.getResultList();
            et.commit();
            return list;
        }catch (PersistenceException e){
            System.out.println("Exception"+e.getMessage());
        }finally {
            em.close();
            System.out.println("closing resources");
        }
        return Collections.emptyList();
    }

    @Override
    public List<ConditionerEntity> findAllByHairType(String hairType){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query = em.createNamedQuery("findAllByHairType");
            query.setParameter("hairType",hairType);
            List<ConditionerEntity> list=query.getResultList();
            et.commit();
            return list;
        }catch (PersistenceException e){
            System.out.println("Exception"+e.getMessage());
        }finally {
            em.close();
            System.out.println("closing resources");
        }
        return Collections.emptyList();
    }

    @Override
   public String findScentById(int id){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
           Query query= em.createNamedQuery("findScentById");
            query.setParameter("id",id);
           Object object=query.getSingleResult();
           String value=(String) object;
           return value;
        }catch (PersistenceException e){
            System.err.println("Exception"+e.getMessage());
            et.rollback();
        }finally {
            em.close();
            System.out.println("Closing resources");
        }
        return null;
   }
    @Override
    public List<String> getAllBrand(){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query=em.createNamedQuery("getAllBrand");
            List<String> list=query.getResultList();
            return list;

        }catch (PersistenceException e){
            System.out.println("Exception"+e.getMessage());

        }finally {
            em.close();
            System.out.println("Closing resources");
        }
        return Collections.emptyList();
    }

}
