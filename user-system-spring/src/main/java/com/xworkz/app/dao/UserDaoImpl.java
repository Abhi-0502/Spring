package com.xworkz.app.dao;

import com.xworkz.app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@Component
public class UserDaoImpl implements UserDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(UserDto userDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public void UpdateUser(UserDto userDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(userDto);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean deleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from UserDto dto where id = :id");
        query.setParameter("id",id);
        int noOfRowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRowsDeleted > 0)

            return true;
        entityManager.close();
        return false;
    }

    @Override
    public UserDto getUserbyId(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
       UserDto userDto = entityManager.find(UserDto.class,id);
        System.out.println(userDto);
        return userDto;
    }

    @Override
    public UserDto getUserName(String userName) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select user from UserDto user where user.userName =:un");
        query.setParameter("un", userName);
       UserDto userDto = (UserDto) query.getSingleResult();
        entityManager.getTransaction().commit();
        return userDto;
    }

    @Override
    public String getEmailById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("select user.Email from UserDto  user where user.id = :i");
//        query.setParameter("i",id);
//        String email = (String) query.getSingleResult();
//
//        return email;
        return (String) factory.createEntityManager().createNamedQuery("getEmailById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public Object[] getuserNameAndphNoById(int id) {
//        return (Object[]) factory.createEntityManager().createQuery("select user.userName,user.phNo from UserDto user where user.id =:i").
//                setParameter("i",id).getSingleResult();
        return (Object[]) factory.createEntityManager().createNamedQuery("getuserNameAndphNoById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public Object[] fetchUserNameAndAgeByAdhaarNo(long adharNo) {
//        return (Object[]) factory.createEntityManager().createQuery("select user.userName,user.age from UserDto user where user.AddharNo = :aNo").
//                setParameter("aNo",adharNo).getSingleResult();
        return (Object[]) factory.createEntityManager().createNamedQuery("fetchUserNameAndAgeByAdhaarNo").
                setParameter("aNo",adharNo).getSingleResult();
    }


    @Override
    public String getEmailByAdharNo(long adharNo) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select user.Email from UserDto  user where user.AddharNo = :aNo");
        query.setParameter("aNo",adharNo);
        String email = (String) query.getSingleResult();
        return email;
    }

    @Override
    public boolean updateAddressByAdharNo(String address, long adharNo) {
        boolean addressUpdated = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update UserDto dto set dto.address =: address where dto.AddharNo =:aNo");
        query.setParameter("address",address);
        query.setParameter("aNo",adharNo);
        int noOfRowsAffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRowsAffected > 0)
            addressUpdated = true;
        return addressUpdated;
    }

    @Override
    public boolean deleteUserByAdharNo(long adhar) {
        boolean isUserDeleted  = false;
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from UserDto dto  where dto.AddharNo =:aNo");
        query.setParameter("aNo",adhar);
        int noOfRowsAffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (noOfRowsAffected > 0)
            isUserDeleted = true;
        return isUserDeleted;
    }
}
