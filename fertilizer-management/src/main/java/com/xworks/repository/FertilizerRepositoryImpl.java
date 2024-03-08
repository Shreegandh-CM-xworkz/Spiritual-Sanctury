package com.xworks.repository;

import com.xworks.dto.FertilizerEntity;
import com.xworks.singleton.EmfUtil;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.Root;
import java.util.Collections;
import java.util.List;

public class FertilizerRepositoryImpl implements FertilizerRepository {
    EntityManagerFactory emf= EmfUtil.getEmf();

    @Override
    public Integer save(FertilizerEntity entity) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin");
            et.begin();
            System.out.println("persist call");
            em.persist(entity);
            System.out.println("Commiting");
            et.commit();
            return entity.getId();

        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
            et.rollback();
        } finally {//if we use System.exit then finally wil not exit -kills the jvm
            System.out.println("Closing resources");
            em.close();
        }
        return null;
    }

    @Override
    public void saveAll(List<FertilizerEntity> list) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("Begin");
            list.forEach(e -> em.persist(e));
            System.out.println("Saved");
            et.commit();


        } catch (PersistenceException e) {
            System.out.println("PersistenceException " + e.getMessage());
            et.rollback();

        } finally {
            System.out.println("closing");
            em.close();

        }

    }
@Override
    public List<FertilizerEntity> findAllByQuantity(int quantity) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin");
            et.begin();
            Query query=em.createNamedQuery("findAllByQuantity");
            query.setParameter("qt",quantity);
            List<FertilizerEntity> entity=query.getResultList();
            et.commit();
            System.out.println("List saved successfully");
            return entity;


        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
            et.rollback();
        } finally {//if we use System.exit then finally wil not exit -kills the jvm
            System.out.println("Closing resources");
            em.close();
        }
        return Collections.emptyList();
    }

    @Override
    public List<FertilizerEntity> findAllByIdAndMainGod(int id,String god) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin");
            et.begin();
            Query query=em.createNamedQuery("findAllByQuantity");
            query.setParameter("id",id);
            query.setParameter("god",god);
            List<FertilizerEntity> entity=query.getResultList();
            et.commit();
            System.out.println("List saved successfully");
            return entity;


        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
            et.rollback();
        } finally {//if we use System.exit then finally wil not exit -kills the jvm
            System.out.println("Closing resources");
            em.close();
        }
        return Collections.emptyList();
    }
    public FertilizerEntity getByName(String name) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
         try{
             CriteriaBuilder cb =em.getCriteriaBuilder();
            CriteriaQuery<FertilizerEntity> cq = cb.createQuery(FertilizerEntity.class);
            Root<FertilizerEntity>root=cq.from(FertilizerEntity.class);
             cq.where(cb.equal(root.get("name"),name),cb.and(cb.equal(root.get("id"),1)), cb.and(cb.ge(root.get("id"),1)));
             FertilizerEntity fromDb=em.createQuery(cq).getSingleResult();
             System.out.println("fromDb"+fromDb);
             return fromDb;
         }catch (PersistenceException pe){
             System.err.println("Exception "+ pe.getMessage());
             et.rollback();
         }finally{
             em.close();

        return null;
    }
}
}
