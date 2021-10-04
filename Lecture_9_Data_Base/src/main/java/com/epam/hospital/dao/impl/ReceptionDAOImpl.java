package com.epam.hospital.dao.impl;

import com.epam.hospital.dao.ReceptionDAO;
import com.epam.hospital.entity.Reception;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReceptionDAOImpl implements ReceptionDAO {

    @Override
    public List<Reception> findAll() {
        return null;
    }

    @Override
    public Reception getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Reception reception) {

    }

    @Override
    public void create(Reception reception) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
