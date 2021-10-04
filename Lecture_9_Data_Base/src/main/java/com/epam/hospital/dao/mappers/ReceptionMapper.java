package com.epam.hospital.dao.mappers;

import com.epam.hospital.Entity.Reception;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReceptionMapper implements RowMapper<Reception> {

    @Override
    public Reception mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Reception reception = new Reception();
        reception.setIdReception(resultSet.getLong("id_reception"));
        reception.setIdPatient(resultSet.getLong("patient_id"));
        reception.setReceptionDate(resultSet.getDate("reception_date"));
        reception.setPreliminaryDiagnosis(resultSet.getString("preliminary_diagnosis"));
        reception.setDischargeDate(resultSet.getDate("discharge_date"));
        reception.setFinalDiagnosis(resultSet.getString("final_diagnosis"));
        reception.setIdPersonal(resultSet.getLong("personal_id"));
        return reception;
    }
}
