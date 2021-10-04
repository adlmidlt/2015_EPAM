package com.epam.hospital_spring_boot.service.impl;

import com.epam.hospital_spring_boot.entity.Personal;
import com.epam.hospital_spring_boot.repository.PersonalRepository;
import com.epam.hospital_spring_boot.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personalService")
public class PersonalServiceIml implements PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    @Override
    public List<Personal> displayAll() {
        return this.personalRepository.displayAll();
    }

    @Override
    public void add(Personal personal) {
        this.personalRepository.add(personal);    }

    @Override
    public void deleteById(Long idPersonal) {
        this.personalRepository.deleteById(idPersonal);
    }

    @Override
    public void update(Long idPersonal, Personal personal) {
        this.personalRepository.update(idPersonal, personal);
    }

    @Override
    public Personal findById(Long idPersonal) {
        return this.personalRepository.findById(idPersonal);
    }
}
