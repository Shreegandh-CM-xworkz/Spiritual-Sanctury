package RepositoryImpl;

import Entities.AdminEntity;
import Repository.AdminRepo;
import singleton.EmfUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class AdminRepoImpl implements AdminRepo {
    @Override
    public Boolean login(String userName, String password) {
        Boolean isFound = false;
        EntityManager em = EmfUtil.getEmf().createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Query query = em.createNamedQuery("getAdmin");
            query.setParameter("userName",userName);
            query.setParameter("password",password);
            Object obj = query.getSingleResult();
            AdminEntity entity = (AdminEntity) obj;
            if (entity!=null)
            {
                isFound=true;
            }
            return isFound;
        } catch (PersistenceException e) {
            et.rollback();
        } finally {
            em.close();
        }
        return false;
    }
}
