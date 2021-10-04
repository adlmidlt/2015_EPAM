package com.epam.hospital_spring_boot.service.impl;

import com.epam.hospital_spring_boot.entity.Patient;
import com.epam.hospital_spring_boot.repository.PatientRepository;
import com.epam.hospital_spring_boot.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("patientService")
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;


    @Override
    public List<Patient> displayAll() {
        return this.patientRepository.displayAll();
    }

    @Override
    public void add(Patient patient) {
        this.patientRepository.add(patient);
    }

    @Override
    public void deleteById(Long idPatient) {
        this.patientRepository.deleteById(idPatient);
    }

    @Override
    public void update(Long idPatient, Patient patient) {
        this.patientRepository.update(idPatient, patient);
    }

    @Override
    public Patient findById(Long idPatient) {
        return this.patientRepository.findById(idPatient);
    }
}
