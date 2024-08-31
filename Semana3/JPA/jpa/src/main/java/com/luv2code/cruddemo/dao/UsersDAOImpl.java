package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public UsersDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Users theUser) {
    	System.out.println("Save User");
        entityManager.persist(theUser); //<==JPA
    }

    @Override
    public Users findById(Integer id) {
        return entityManager.find(Users.class, id);//<==JPA
    }

    @Override
    public List<Users> findAll() {
        // create query
        TypedQuery<Users> theQuery = entityManager.createQuery("FROM Users", Users.class);

        // return query results
        return theQuery.getResultList();//<==JPA
    }

    @Override
    public List<Users> findByLastName(String theLastName) {
        // create query
        TypedQuery<Users> theQuery = entityManager.createQuery(
                                        "FROM Users WHERE lastName=:theData", Users.class);

        // set query parameters
        theQuery.setParameter("theData", theLastName);

        // return query results
        return theQuery.getResultList();
    }
    
    @Override
    public List<Users> findByCellphone(String cellphone) {
        // create query
        TypedQuery<Users> theQuery = entityManager.createQuery(
                                        "FROM Users WHERE cellphone=:thePhone", Users.class);

        // set query parameters
        theQuery.setParameter("thePhone", cellphone);

        // return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Users theStudent) {
        entityManager.merge(theStudent); //<==JPA
    }

    @Override
    @Transactional
    public void delete(Integer id) {

        // retrieve the student
    	Users theStudent = entityManager.find(Users.class, id);

        // delete the student
        entityManager.remove(theStudent);//<==JPA
    }

    @Override
    @Transactional
    public int deleteAll() {

        int numRowsDeleted = entityManager.createQuery("DELETE FROM Users").executeUpdate(); //<==JPA

        return numRowsDeleted;
    }
}










