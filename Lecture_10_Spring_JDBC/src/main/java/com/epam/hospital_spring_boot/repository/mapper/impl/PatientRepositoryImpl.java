package com.epam.hospital_spring_boot.repository.mapper.impl;

import com.epam.hospital_spring_boot.entity.Patient;
import com.epam.hospital_spring_boot.repository.PatientRepository;
import com.epam.hospital_spring_boot.repository.mapper.PatientMapper;
import com.epam.hospital_spring_boot.repository.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("patientRepository")
public class PatientRepositoryImpl implements PatientRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Patient> displayAll() {
        return jdbcTemplate.query("SELECT * FROM patient", new PatientMapper());
    }

    @Override
    public void add(Patient patient) {
        jdbcTemplate.update("INSERT INTO patient(address, phone_number, users_id_patient) VALUES" +
                "(?, ?, ?)", patient.getAddress(), patient.getPhoneNumber(), patient.getUsersId());
    }

    @Override
    public void deleteById(Long idPatient) {
        jdbcTemplate.update("DELETE FROM patient WHERE id_patient = ?", idPatient);
    }

    @Override
    public void update(Long idPatient, Patient patient) {
        jdbcTemplate.update("UPDATE patient SET address = ?, phone_number = ? WHERE id_patient",
                patient.getAddress(), patient.getPhoneNumber(), idPatient);
    }

    @Override
    public Patient findById(Long idPatient) {
        return jdbcTemplate.queryForObject("SELECT id_patient, address, phone_number,  users_id_patient " +
                        "FROM patient WHERE id_patient = ?", new Object[]{idPatient},
                new PatientMapper());
    }
}
