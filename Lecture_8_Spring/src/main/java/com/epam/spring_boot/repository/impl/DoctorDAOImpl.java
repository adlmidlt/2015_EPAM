package com.epam.spring_boot.repository.impl;

import com.epam.spring_boot.DTO.Doctor;
import com.epam.spring_boot.repository.DoctorDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorDAOImpl implements DoctorDAO {

    private List<Doctor> doctors = new ArrayList<>();
    private Doctor doctor = new Doctor();

    @Override
    public List<Doctor> findAll() {
        System.out.println(doctors);
        return doctors;
    }

    @Override
    public Doctor findById(int idDoctor) {
        System.out.println(doctors.get(doctor.getIdDoctor()));
        return null;
    }

    @Override
    public void add(Doctor doc) {
        doctors.add(new Doctor(doc.getIdDoctor(), doc.getLastName(), doc.getFirstName(),
                doc.getPatronymic()));
    }

    @Override
    public Doctor update(int idDoctor, Doctor doc) {
        doctors.set(idDoctor, doc);
        return null;
    }

    @Override
    public void deleteById(int idDoctor) {
        doctors.remove(doctor.getIdDoctor());
    }
}
