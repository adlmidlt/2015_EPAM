package com.epam.hospital_spring_boot.repository.mapper.impl;

import com.epam.hospital_spring_boot.entity.Reception;
import com.epam.hospital_spring_boot.repository.ReceptionRepository;
import com.epam.hospital_spring_boot.repository.mapper.ReceptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("receptionRepository")
public class ReceptionRepositoryImpl implements ReceptionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Reception> displayAll() {
        return jdbcTemplate.query("SELECT * FROM reception", new ReceptionMapper());
    }

    @Override
    public void add(Reception reception) {
        jdbcTemplate.update("INSERT INTO reception(patient_id, preliminary_diagnosis, personal_id) VALUES" +
                "(?, ?, ?)", reception.getPatientId(), reception.getPreliminaryDiagnosis(),
                reception.getPersonalId());
    }

    @Override
    public void deleteById(Long idReception) {
        jdbcTemplate.update("DELETE FROM reception WHERE id_reception = ?", idReception);
    }

    @Override
    public void update(Long idReception, Reception reception) {
        jdbcTemplate.update("UPDATE reception SET discharge_date = ?, final_diagnosis = ?",
                reception.getDischargeDate(), reception.getFinalDiagnosis(), idReception);
    }

    @Override
    public Reception findById(Long idReception) {
        return jdbcTemplate.queryForObject("SELECT * FROM reception WHERE id_reception = ?",
                new Object[]{idReception}, new ReceptionMapper());
    }

    @Override
    public Reception findByIdPatientReception(Long patientId) {
        return jdbcTemplate.queryForObject("SELECT * FROM reception WHERE patient_id",
                new Object[]{patientId}, new ReceptionMapper());
    }

    @Override
    public Reception findByIdPersonalReception(Long personalId) {
        return jdbcTemplate.queryForObject("SELECT * FROM reception WHERE personal_id = ?",
                new Object[]{personalId}, new ReceptionMapper());
    }
}
