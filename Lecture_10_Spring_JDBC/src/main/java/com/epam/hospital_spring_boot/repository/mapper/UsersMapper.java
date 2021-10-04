package com.epam.hospital_spring_boot.repository.mapper;

import com.epam.hospital_spring_boot.entity.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersMapper implements RowMapper<Users> {

    @Override
    public Users mapRow(ResultSet resultSet, int i) throws SQLException {
        Users user = new Users();
        user.setIdUsers(resultSet.getLong("id_users"));
        user.setLastName(resultSet.getString("last_name"));
        user.setFirstName(resultSet.getString("first_name"));
        user.setPatronymic(resultSet.getString("patronymic"));
        user.setDateOfBirth(resultSet.getDate("date_of_birth"));
        user.setLogin(resultSet.getString("login"));
        user.setPassword(resultSet.getString("password"));
        user.setEmail(resultSet.getString("email"));
        return user;
    }
}
