package com.xworks.repository;

import com.xworks.dto.FertilizerEntity;
import com.xworks.dto.TempleEntity;
import com.xworks.singleton.EmfUtil;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TempleRepositoryImpl implements TempleRepository {

    EntityManagerFactory emf= EmfUtil.getEmf();

    @Override
    public void save(TempleEntity entity) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin");
            et.begin();
            System.out.println("persist call");
            em.persist(entity);
            System.out.println("Commiting");
            et.commit();

        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
            et.rollback();
        } finally {//if we use System.exit then finally wil not exit -kills the jvm
            System.out.println("Closing resources");
            em.close();
        }
    }

    @Override
    public void saveAll(List<TempleEntity> list) {
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
    public List<TempleEntity> findAllByLocation(String location) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin");
            et.begin();
            Query query = em.createNamedQuery("findAllByLocation");
            query.setParameter("l", location);
            List<TempleEntity> entity = query.getResultList();
            et.commit();
            System.out.println("List saved successfully");
            return entity;
        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return Collections.emptyList();
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThan(Double fee) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin");
            et.begin();
            Query query = em.createNamedQuery("findAllByEntryFeeGreaterThan");
            query.setParameter("fee", fee);
            List<TempleEntity> entity = query.getResultList();
            et.commit();
            System.out.println("List saved successfully");
            return entity;
        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return Collections.emptyList();
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(Double f1, Double f2) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin");
            et.begin();
            Query query = em.createNamedQuery("findAllByEntryFeeBetween");
            query.setParameter("fee1", f1);
            query.setParameter("fee2", f2);
            List<TempleEntity> entity = query.getResultList();
            et.commit();
            System.out.println("List saved successfully");
            return entity;
        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return Collections.emptyList();
    }

    public List<TempleEntity> findAllByInaguratedDateGreaterThan(LocalDate date) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin");
            et.begin();
            Query query = em.createNamedQuery("findAllByInaguratedDateGreaterThan");
            query.setParameter("date", date);
            List<TempleEntity> entity = query.getResultList();
            et.commit();
            System.out.println("List saved successfully");
            return entity;
        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return Collections.emptyList();
    }

    @Override
    public List<TempleEntity> findAllByMainGodAndLocation(String god, String location) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            System.out.println("Begin");
            et.begin();
            Query query = em.createNamedQuery("findAllByMainGodAndLocation");
            query.setParameter("god", god);
            query.setParameter("location", location);
            List<TempleEntity> entity = query.getResultList();
            et.commit();
            System.out.println("List saved successfully");
            return entity;
        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return Collections.emptyList();
    }

    @Override
    public TempleEntity findAllById(int id) {
        EntityManager em = this.emf.createEntityManager();
        try {
            System.out.println("Begin");
            Query query = em.createNamedQuery("findAllById");
            query.setParameter("id", id);
            Object object = query.getSingleResult();
            TempleEntity templeEntity = (TempleEntity) object;

            System.out.println(templeEntity);
            return templeEntity;

        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
        } finally {
            System.out.println("Closing resources");
            em.close();

        }
        return null;
    }

    @Override
    public TempleEntity findAllByIdAndMainGod(int id, String god) {
        EntityManager em = this.emf.createEntityManager();
        try {
            System.out.println("Begin");
            Query query = em.createNamedQuery("findAllByIdAndMainGod");
            query.setParameter("id", id);
            query.setParameter("god", god);
            Object object = query.getSingleResult();
            TempleEntity templeEntity = (TempleEntity) object;
            System.out.println(templeEntity);
            return templeEntity;

        } catch (PersistenceException e) {
            System.err.println("PersistenceException in save method of fertilize" + e.getMessage());
        } finally {
            System.out.println("Closing resources");
            em.close();

        }
        return null;
    }

    public TempleEntity findTempleWithMaxEntryFee() {
        EntityManager em = this.emf.createEntityManager();
        try {
            System.out.println("Begin");
            Query query = em.createNamedQuery("findTempleWithMaxEntryFee");
            query.setMaxResults(1);
            List<TempleEntity> resultList = query.getResultList();

            if (!resultList.isEmpty()) {
                TempleEntity templeEntity = resultList.get(0);
                System.out.println("Entity with max entry fee found: " + templeEntity);
                return templeEntity;
            } else {
                System.err.println("No entity found with max entry fee");
            }
        } catch (PersistenceException e) {
            System.err.println("PersistenceException in findTempleWithMaxEntryFee method: " + e.getMessage());
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return null;
    }
    @Override
    public Long findTotal(){
        EntityManager em = this.emf.createEntityManager();
        try {
            Query query=em.createNamedQuery("findTotal");
            return (Long) query.getSingleResult();
        } catch (PersistenceException e) {
            System.err.println("PersistenceException in findTempleWithMaxEntryFee method: " + e.getMessage());
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
        return null;
    }
    @Override
    public void updateLocationByName(String name,String location){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
          Query query =em.createNamedQuery("updateLocationByName");
          query.setParameter("l",location);
          query.setParameter("name",name);
          int result=query.executeUpdate();
          if (result==1) System.out.println("Updated");
            else System.out.println("not updated");
            et.commit();
        }catch (PersistenceException e){
            System.err.println("PersistenceException in findTempleWithMaxEntryFee method: " + e.getMessage());
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
    }
    @Override
    public void updateEntryFeeByName(Double fee,String name){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query =em.createNamedQuery("updateEntryFeeByName");
            query.setParameter("fee",fee);
            query.setParameter("name",name);
            int result=query.executeUpdate();
            if (result==1) System.out.println("Updated");
            else System.out.println("not updated");
            et.commit();
        }catch (PersistenceException e){
            System.err.println("PersistenceException in findTempleWithMaxEntryFee method: " + e.getMessage());
        } finally {
            System.out.println("Closing resources");
            em.close();
        }

    }
    @Override
    public void updateLocationAndDimensionById(String location,String dimension,int id){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query =em.createNamedQuery("updateLocationAndDimensionById");
            query.setParameter("location",location);
            query.setParameter("dimension",dimension);
            query.setParameter("id",id);
            int result=query.executeUpdate();
            if (result==1) System.out.println("Updated");
            else System.out.println("not updated");
            et.commit();
        }catch (PersistenceException e){
            System.err.println("PersistenceException in findTempleWithMaxEntryFee method: " + e.getMessage());
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
    }
    @Override
    public void updateAllVipEntry(String entry,List<Integer> ids){
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query =em.createNamedQuery("updateAllVipEntry");
            query.setParameter("entry",entry);
                query.setParameter("id", ids);
            int result=query.executeUpdate();
            if (result==1) System.out.println("Updated");
            else System.out.println("not updated");
            et.commit();
        }catch (PersistenceException e){
            System.err.println("PersistenceException in findTempleWithMaxEntryFee method: " + e.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
    }@Override
    public void deleteByName(String name){
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query =em.createNamedQuery("deleteByName");
            query.setParameter("name",name);

            int result=query.executeUpdate();
            if (result==1) System.out.println("Updated");
            else System.out.println("not updated");
            et.commit();
        }catch (PersistenceException e){
            System.err.println("PersistenceException in findTempleWithMaxEntryFee method: " + e.getMessage());
            et.rollback();
        } finally {
            System.out.println("Closing resources");
            em.close();
        }
    }
}

