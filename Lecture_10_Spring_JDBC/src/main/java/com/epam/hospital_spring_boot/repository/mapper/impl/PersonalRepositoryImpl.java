package com.epam.hospital_spring_boot.repository.mapper.impl;

import com.epam.hospital_spring_boot.entity.Personal;
import com.epam.hospital_spring_boot.repository.PersonalRepository;
import com.epam.hospital_spring_boot.repository.mapper.PersonalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("personalRepository")
public class PersonalRepositoryImpl implements PersonalRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Personal> displayAll() {
        return jdbcTemplate.query("SELECT * FROM personal", new PersonalMapper());
    }

    @Override
    public void add(Personal personal) {
        jdbcTemplate.update("INSERT INTO personal(specialization, personal_role, users_id_personal) " +
                "VALUES (?, ?, ?)", personal.getSpecialization(), personal.getPersonalRole(), personal.getUsersId());
    }

    @Override
    public void deleteById(Long idPersonal) {
        jdbcTemplate.update("DELETE FROM personal WHERE id_personal = ?", idPersonal);
    }

    @Override
    public void update(Long idPersonal, Personal personal) {
        jdbcTemplate.update("UPDATE personal SET specialization = ?, personal_role = ? WHERE id_personal",
                personal.getSpecialization(), personal.getPersonalRole(), idPersonal);
    }

    @Override
    public Personal findById(Long idPersonal) {
        return jdbcTemplate.queryForObject("SELECT specialization, personal_role, users_id_personal FROM personal" +
                "WHERE id_personal = ?", new Object[]{idPersonal}, new PersonalMapper());
    }
}
