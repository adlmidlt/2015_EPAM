package com.epam.hospital_spring_boot.repository.mapper.impl;

import com.epam.hospital_spring_boot.entity.Prescription;
import com.epam.hospital_spring_boot.repository.PrescriptionRepository;
import com.epam.hospital_spring_boot.repository.mapper.PrescriptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("prescriptionRepository")
public class PrescriptionRepositoryImpl implements PrescriptionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Prescription> displayAll() {
        return jdbcTemplate.query("SELECT * FROM prescription", new PrescriptionMapper());
    }

    @Override
    public void add(Prescription prescription) {
        jdbcTemplate.update("INSERT INTO prescription(name_prescription, type_prescription) VALUES (?, ?)",
               prescription.getNamePrescription(), prescription.getTypePrescription());
    }

    @Override
    public void deleteById(Long idPrescription) {
        jdbcTemplate.update("DELETE FROM prescription WHERE id_prescription = ?", idPrescription);
    }

    @Override
    public void update(Long idPrescription, Prescription prescription) {
        jdbcTemplate.update("UPDATE prescription SET description = ?",
                prescription.getDescription(), idPrescription);
    }

    @Override
    public Prescription findById(Long idPrescription) {
        return jdbcTemplate.queryForObject("SELECT * FROM prescription WHERE id_prescription = ?",
                new Object[]{idPrescription}, new PrescriptionMapper());
    }

    @Override
    public Prescription findByIdPersonalPrescription(Long personalId) {
        return jdbcTemplate.queryForObject("SELECT * FROM prescription WHERE personal_id_prescription",
                new Object[]{personalId}, new PrescriptionMapper());
    }
}
