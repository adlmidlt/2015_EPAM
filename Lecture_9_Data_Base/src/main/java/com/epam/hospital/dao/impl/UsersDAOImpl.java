package com.epam.hospital.dao.impl;

import com.epam.hospital.dao.UsersDAO;
import com.epam.hospital.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Users getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Users users) {

    }

    @Override
    public void create(Users users) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
