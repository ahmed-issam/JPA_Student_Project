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
          DeptDataLayer mechanicalDept = entityManager.find(DeptDataLayer.class , 5);
          entityManager.remove(mechanicalDept);
            DeptDataLayer electricalDept =  entityManager.find(DeptDataLayer.class , 6);
            entityManager.remove(electricalDept);
            DeptDataLayer civilDept =  entityManager.find(DeptDataLayer.class , 7);
            entityManager.remove(civilDept);
            DeptDataLayer chemicalDept = entityManager.find(DeptDataLayer.class , 8);
            entityManager.remove(chemicalDept);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
