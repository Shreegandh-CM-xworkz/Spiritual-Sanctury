package singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmfUtil {
    private static EntityManagerFactory emf;

    public static EntityManagerFactory getEmf() {
        return emf;
    }
    static {
        emf= Persistence.createEntityManagerFactory("x-workz");
    }
}
