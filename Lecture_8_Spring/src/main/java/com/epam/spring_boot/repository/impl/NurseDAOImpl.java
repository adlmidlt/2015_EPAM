package com.epam.spring_boot.repository.impl;

import com.epam.spring_boot.DTO.Nurse;
import com.epam.spring_boot.repository.NurseDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NurseDAOImpl implements NurseDAO {

    private List<Nurse> nurses = new ArrayList<>();
    private Nurse nurse = new Nurse();

    @Override
    public List<Nurse> findAll() {
        System.out.println(nurses);
        return nurses;
    }

    @Override
    public Nurse findById(int idNurse) {
        System.out.println(nurses.get(nurse.getIdNurse()));
        return nurse;
    }

    @Override
    public void add(Nurse nur) {
        nurses.add(new Nurse(nur.getIdNurse(), nur.getLastName(), nur.getFirstName(), nur.getPatronymic()));
    }

    @Override
    public Nurse update(int idNurse, Nurse nur) {
        nurses.set(idNurse, nur);
        return nurse;
    }

    @Override
    public void deleteById(int idNurse) {
        nurses.remove(nurse.getIdNurse());
    }
}
