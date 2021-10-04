package com.epam.hospital_spring_boot.repository.mapper;

import com.epam.hospital_spring_boot.entity.Reception;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReceptionMapper implements RowMapper<Reception> {

    @Override
    public Reception mapRow(ResultSet resultSet, int i) throws SQLException {
        Reception reception = new Reception();
        reception.setIdReception(resultSet.getLong("id_reception"));
        reception.setPatientId(resultSet.getLong("patient_id"));
        reception.setReceptionDate(resultSet.getDate("reception_date"));
        reception.setPreliminaryDiagnosis(resultSet.getString("preliminary_diagnosis"));
        reception.setDischargeDate(resultSet.getDate("discharge_date"));
        reception.setFinalDiagnosis(resultSet.getString("final_diagnosis"));
        return reception;
    }
}
