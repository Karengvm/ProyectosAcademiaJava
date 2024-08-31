package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Users;

import java.util.List;

public interface UsersDAO {

    void save(Users theUser);

    Users findById(Integer id);

    List<Users> findAll();

    List<Users> findByLastName(String theLastName);
    
    List<Users> findByCellphone(String cellphone);

    void update(Users theUser);

    void delete(Integer id);

    int deleteAll();

}
