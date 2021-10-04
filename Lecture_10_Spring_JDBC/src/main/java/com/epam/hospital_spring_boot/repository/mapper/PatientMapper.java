package com.epam.hospital_spring_boot.repository.mapper;

import com.epam.hospital_spring_boot.entity.Patient;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientMapper implements RowMapper<Patient> {

    @Override
    public Patient mapRow(ResultSet resultSet, int i) throws SQLException {
        Patient patient = new Patient();
        patient.setIdPatient(resultSet.getLong("id_patient"));
        patient.setAddress(resultSet.getString("address"));
        patient.setPhoneNumber(resultSet.getInt("phone_number"));
        patient.setUsersId(resultSet.getLong("users_id_patient"));
        return patient;
    }
}
