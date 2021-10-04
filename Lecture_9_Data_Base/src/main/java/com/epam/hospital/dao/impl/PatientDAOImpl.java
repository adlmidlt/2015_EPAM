package com.epam.hospital.dao.impl;

import com.epam.hospital.dao.PatientDAO;
import com.epam.hospital.entity.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDAOImpl implements PatientDAO {

    @Override
    public List<Patient> findAll() {
        return null;
    }

    @Override
    public Patient getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Patient patient) {

    }

    @Override
    public void create(Patient patient) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
