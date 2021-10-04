package com.epam.hospital_spring_boot.repository.mapper.impl;

import com.epam.hospital_spring_boot.entity.Users;
import com.epam.hospital_spring_boot.repository.UsersRepository;
import com.epam.hospital_spring_boot.repository.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Users> displayAll() {
        return jdbcTemplate.query("SELECT * FROM users", new UsersMapper());
    }

    @Override
    public void add(Users user) {
        jdbcTemplate.update("INSERT INTO users(last_name, first_name, patronymic, date_of_birth," +
                        "login, password, email) VALUES (?, ?, ?, ?, ?, ?, ?)", user.getLastName(), user.getFirstName(),
                user.getPatronymic(), user.getDateOfBirth(), user.getLogin(), user.getPassword(), user.getEmail());
    }

    @Override
    public void deleteById(Long idUser) {
        jdbcTemplate.update("DELETE FROM users WHERE id_users = ?", idUser);
    }

    @Override
    public void update(Long idUser, Users user) {
        jdbcTemplate.update("UPDATE users SET last_name = ?, email = ? WHERE id_users = ?", user.getLastName(),
                user.getEmail(), idUser);
    }

    @Override
    public Users findById(Long idUser) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id_users = ?", new Object[]{idUser},
                new UsersMapper());
    }
}
