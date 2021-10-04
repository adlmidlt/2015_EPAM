package com.epam.hospital.dao.mappers;

import com.epam.hospital.Entity.Personal;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonalMapper implements RowMapper<Personal> {

    @Override
    public Personal mapRow(ResultSet resultSet, int i) throws SQLException {
        Personal personal = new Personal();
        personal.setIdPersonal(resultSet.getLong("id_personal"));
        personal.setSpecialization(resultSet.getString("specialization"));
        personal.setPersonalRole(resultSet.getString("personal_role"));
        personal.setIdUser(resultSet.getLong("user_id"));
        return personal;
    }
}
