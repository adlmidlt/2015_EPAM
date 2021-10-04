package com.epam.hospital_spring_boot.repository.mapper;

import com.epam.hospital_spring_boot.entity.Prescription;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PrescriptionMapper implements RowMapper<Prescription> {

    @Override
    public Prescription mapRow(ResultSet resultSet, int i) throws SQLException {
        Prescription prescription = new Prescription();
        prescription.setIdPrescription(resultSet.getLong("id_prescription"));
        prescription.setNamePrescription(resultSet.getString("name_prescription"));
        prescription.setTypePrescription(resultSet.getString("type_prescription"));
        prescription.setDescription(resultSet.getString("description"));
        prescription.setPersonalId(resultSet.getLong("personal_id_prescription"));
        return prescription;
    }
}
