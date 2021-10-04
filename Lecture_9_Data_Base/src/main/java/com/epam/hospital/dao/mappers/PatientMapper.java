package com.epam.hospital.dao.mappers;

import com.epam.hospital.Entity.Patient;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientMapper implements RowMapper<Patient> {

    @Override
    public Patient mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Patient patient = new Patient();
        patient.setIdPatient(resultSet.getLong("id_patient"));
        patient.setAddress(resultSet.getString("address"));
        patient.setPhoneNumber(resultSet.getInt("phone_number"));
        patient.setIdUser(resultSet.getInt("user_id"));
        return patient;
    }
}
