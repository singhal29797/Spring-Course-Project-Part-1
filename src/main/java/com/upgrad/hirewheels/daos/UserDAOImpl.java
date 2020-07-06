package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.lang.String;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component(value="userDAO")
public class UserDAOImpl implements UserDAO {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    //@Transactional
    public Users insertUsersDetails(Users users) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(users);
        entityManager.getTransaction().commit();
        entityManager.close();
        return users;
    }

    public Users updatePassword(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Users users = entityManager.find(Users.class,id);
        entityManager.getTransaction().begin();
        entityManager.persist(users);
        entityManager.getTransaction().commit();
        entityManager.close();
        return users;
    }

    public Users fetchUserDetails(int user_id) {
        return entityManagerFactory.createEntityManager().find(Users.class, user_id);
    }

    public List<Users> fetchAllUsersDetails() {
        Query query = entityManagerFactory.createEntityManager().createQuery("from Users m",Users.class);
        return (List<Users>)query.getResultList();
    }

    public boolean deleteUser(int user_id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Users users = entityManager.find(Users.class,user_id);
        entityManager.getTransaction().begin();
        entityManager.remove(users);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}

