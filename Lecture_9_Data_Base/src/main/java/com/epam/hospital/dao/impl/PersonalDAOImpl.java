package com.epam.hospital.dao.impl;

import com.epam.hospital.dao.PersonalDAO;
import com.epam.hospital.entity.Personal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonalDAOImpl implements PersonalDAO {

    @Override
    public List<Personal> findAll() {
        return null;
    }

    @Override
    public Personal getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Personal personal) {

    }

    @Override
    public void create(Personal personal) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
