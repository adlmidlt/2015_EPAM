package com.epam.spring_boot.service.impl;

import com.epam.spring_boot.DTO.Patient;
import com.epam.spring_boot.repository.PatientDao;
import com.epam.spring_boot.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDao patientDao;


    @Override
    public List<Patient> findAll() {
        return this.patientDao.findAll();
    }

    @Override
    public Patient findById(int idPatient) {
        return this.patientDao.findById(idPatient);
    }

    @Override
    public void add(Patient pat) {
        this.patientDao.add(pat);
    }

    @Override
    public Patient update(int idPatient, Patient pat) {
        return this.patientDao.update(idPatient, pat);
    }

    @Override
    public void deleteById(int idPatient) {
        this.patientDao.deleteById(idPatient);
    }
}
