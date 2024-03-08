package RepositoryImpl;

import Entities.AdminEntity;
import Repository.TempleRepo;
import Entities.TempleEntity;
import com.sun.org.apache.xpath.internal.operations.Bool;
import singleton.EmfUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TempleRepoImpl implements TempleRepo {

    @Override
    public void save(TempleEntity entity) {
        EntityManager em = EmfUtil.getEmf().createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(entity);
            et.commit();
        } catch (PersistenceException e) {
            et.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public List<TempleEntity> getListOfTemples() {
        EntityManager em = EmfUtil.getEmf().createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            Query query = em.createNamedQuery("getAll");
            List<TempleEntity> list = query.getResultList();
            et.commit();
            return list;
        } catch (PersistenceException e) {
            et.rollback();
        } finally {
            em.close();
        }
        return Collections.emptyList();
    }

    @Override
    public TempleEntity getTemple(int id) {
        EntityManager em = EmfUtil.getEmf().createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Query query = em.createNamedQuery("getTemple");
            query.setParameter("id", id);
            Object obj = query.getSingleResult();
            TempleEntity entity = (TempleEntity) obj;
            et.commit();
            return entity;

        } catch (PersistenceException e) {
            et.rollback();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public Boolean update(int id, String name, String location, String vipEntry, String inaguratedDate, String mainGod, String dimension, Double entryFee) {
        Boolean isUpdated = false;
        EntityManager em = EmfUtil.getEmf().createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Query query = em.createNamedQuery("update");
            query.setParameter("name", name);
            query.setParameter("location", location);
            query.setParameter("vipEntry", vipEntry);
            query.setParameter("inaguratedDate", inaguratedDate);
            query.setParameter("mainGod", mainGod);
            query.setParameter("dimension", dimension);
            query.setParameter("entryFee", entryFee);
            query.setParameter("id", id);
            int result = query.executeUpdate();
            et.commit();
            if (result == 1) {
                isUpdated = true;
            }
            return isUpdated;


        } catch (PersistenceException e) {
            et.rollback();
        } finally {
            em.close();

        }
        return false;
    }

    @Override
    public Boolean delete(int id) {
        Boolean isDeleted = false;
        EntityManager em = EmfUtil.getEmf().createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Query query = em.createNamedQuery("delete");
            query.setParameter("id", id);
            int result = query.executeUpdate();
            if (result == 1)
                isDeleted = true;
            else {
                System.out.println("cant delete");
            }
            et.commit();
            return true;
        } catch (PersistenceException e) {
            et.rollback();
        } finally {
            em.close();
        }
        return isDeleted;
    }


}




