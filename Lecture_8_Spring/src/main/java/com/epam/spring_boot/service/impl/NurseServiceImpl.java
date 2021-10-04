package com.epam.spring_boot.service.impl;

import com.epam.spring_boot.DTO.Nurse;
import com.epam.spring_boot.repository.NurseDAO;
import com.epam.spring_boot.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseServiceImpl implements NurseService {

    @Autowired
    NurseDAO nurseDAO;

    @Override
    public List<Nurse> findAll() {
        return this.nurseDAO.findAll();
    }

    @Override
    public Nurse findById(int idNurse) {
        return this.nurseDAO.findById(idNurse);
    }

    @Override
    public void add(Nurse nur) {
        this.nurseDAO.add(nur);
    }

    @Override
    public Nurse update(int idNurse, Nurse nur) {
        return this.nurseDAO.update(idNurse, nur);
    }

    @Override
    public void deleteById(int idNurse) {
        this.nurseDAO.deleteById(idNurse);
    }
}
