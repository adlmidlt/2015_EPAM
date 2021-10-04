package com.epam.spring_boot.repository.impl;

import com.epam.spring_boot.DTO.Patient;
import com.epam.spring_boot.repository.PatientDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientDaoImpl implements PatientDao {

    private List<Patient> patients = new ArrayList<>();
    private Patient patient = new Patient();

    @Override
    public List<Patient> findAll() {
        System.out.println(patients);
        return patients;
    }

    @Override
    public Patient findById(int idPatient) {
        System.out.println(patients.get(patient.getIdPatient()));
        return patient;
    }

    @Override
    public void add(Patient pat) {
        patients.add(new Patient(pat.getIdPatient(), pat.getLastName(), pat.getFirstName(), pat.getPatronymic()));
    }

    @Override
    public Patient update(int idPatient, Patient pat) {
        patients.set(idPatient, pat);
        return pat;
    }

    @Override
    public void deleteById(int idPatient) {
        patients.remove(patient.getIdPatient());
    }
}
