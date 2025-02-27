package com.xworkz.userapp.reposistory;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {



    @Autowired
    EntityManagerFactory factory;

    @Override
    public boolean save(UserDto userDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userDto);
        entityManager.getTransaction().commit();
        return true;
    }
    @Override
    public List<UserDto> getAllUsers(){
        return factory.createEntityManager().createNamedQuery("getAllUsers").getResultList();
    }

    @Override
    public boolean updateUserById(UserDto userDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public UserDto getById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        UserDto userDto = entityManager.find(UserDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return userDto;
    }

    @Override
    public boolean deleteById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteById");
        query.setParameter("userid",id);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        if(rowEffected > 0)
            return true;
        return true;
    }
}
