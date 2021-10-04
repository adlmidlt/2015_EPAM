package com.epam.hospital_spring_boot.repository.mapper;

import com.epam.hospital_spring_boot.entity.Personal;
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
        personal.setUsersId(resultSet.getLong("users_id_personal"));
        return personal;
    }
}
