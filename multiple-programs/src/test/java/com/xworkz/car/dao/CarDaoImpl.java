package com.xworkz.car.dao;

import com.xworkz.books.dto.Bookdto;
import com.xworkz.car.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao{

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public boolean save(CarDto carDto) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(carDto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public CarDto getUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        CarDto carDto = entityManager.find(CarDto.class,id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return carDto;
    }

    @Override
    public List<CarDto> getAllDetails(CarDto carDto) {
        EntityManager entityManager = factory.createEntityManager();
        Query query = entityManager.createQuery("select user from CarDto user");
        List<CarDto> carDtos = query.getResultList();
        return carDtos;
    }

    @Override
    public void updateUserById(int id, CarDto newUserData) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        CarDto existing = entityManager.find(CarDto.class,id);
        if(existing != null){
            existing.setName(newUserData.getName());
            existing.setModel(newUserData.getModel());
            existing.setPrice(newUserData.getPrice());
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean DeleteUserById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from CarDto dto where dto.id =: id");
        query.setParameter("id",id);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        return rowEffected > 0;
    }

    @Override
    public String getCarNameById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("select car.name from CarDto  car where car.id = :i");
//        query.setParameter("i",id);
//        String carName = (String) query.getSingleResult();
//
//        return carName;
        return (String) factory.createEntityManager().createNamedQuery("getCarNameById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public String getmodelById(int id) {
//        EntityManager entityManager = factory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("select car.model from CarDto  car where car.id = :i");
//        query.setParameter("i",id);
//        String model = (String) query.getSingleResult();
//
//        return model;
        return (String) factory.createEntityManager().createNamedQuery("getmodelById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public Object[] getCarNameAndModelById(int id) {
//        return (Object[]) factory.createEntityManager().createQuery("select car.name,car.model from CarDto car where car.id =:i").
//               setParameter("i",id).getSingleResult();
        return (Object[]) factory.createEntityManager().createNamedQuery("getCarNameAndModelById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public Object[] getModelpriceAndCarNameById(int id) {
//        return (Object[]) factory.createEntityManager().createQuery("select car.model,car.price from CarDto car where car.id =:i").
//               setParameter("i",id).getSingleResult();

        return (Object[]) factory.createEntityManager().createNamedQuery("getModelpriceAndCarNameById").
                setParameter("i",id).getSingleResult();
    }

    @Override
    public double getpriceById(double id) {
        EntityManager entityManager = factory.createEntityManager();
        String hql = "select car.price from CarDto car where car.id = :id"; // Ensure `price` matches the entity's type
        Query query = entityManager.createQuery(hql);
        query.setParameter("id", id); // Use Integer type for `id`
        return (Double) query.getSingleResult();
    }
}
