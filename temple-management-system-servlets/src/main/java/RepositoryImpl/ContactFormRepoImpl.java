package RepositoryImpl;

import Entities.ContactFormEntity;
import Entities.TempleEntity;
import Repository.ContactFormRepo;
import singleton.EmfUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

public class ContactFormRepoImpl implements ContactFormRepo {
    @Override
    public void save(ContactFormEntity entity) {
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
    }

