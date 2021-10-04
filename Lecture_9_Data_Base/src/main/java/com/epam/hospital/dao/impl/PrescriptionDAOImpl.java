package com.epam.hospital.dao.impl;

import com.epam.hospital.dao.PrescriptionDAO;
import com.epam.hospital.entity.Prescription;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrescriptionDAOImpl implements PrescriptionDAO {

    @Override
    public List<Prescription> findAll() {
        return null;
    }

    @Override
    public Prescription getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Prescription prescription) {

    }

    @Override
    public void create(Prescription prescription) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
