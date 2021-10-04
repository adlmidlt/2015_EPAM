package com.epam.spring_boot.service.impl;


import com.epam.spring_boot.DTO.Doctor;
import com.epam.spring_boot.repository.DoctorDAO;
import com.epam.spring_boot.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorDAO doctorDAO;

    @Override
    public List<Doctor> findAll() {
        return this.doctorDAO.findAll();
    }

    @Override
    public Doctor findById(int idDoctor) {
        return this.doctorDAO.findById(idDoctor);
    }

    @Override
    public void add(Doctor doc) {
        this.doctorDAO.add(doc);
    }

    @Override
    public Doctor update(int idDoctor, Doctor doc) {
        return this.doctorDAO.update(idDoctor, doc);
    }

    @Override
    public void deleteById(int idDoctor) {
        this.doctorDAO.deleteById(idDoctor);
    }
}
