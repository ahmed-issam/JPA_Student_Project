import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            for (int i = 5; i <= 12; i++) {
                DeptDataLayer dept1 = entityManager.find(DeptDataLayer.class, i);
                entityManager.remove(dept1);
                transaction.commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
