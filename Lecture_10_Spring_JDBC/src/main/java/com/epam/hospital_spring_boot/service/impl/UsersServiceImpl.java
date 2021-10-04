package com.epam.hospital_spring_boot.service.impl;

import com.epam.hospital_spring_boot.entity.Users;
import com.epam.hospital_spring_boot.repository.UsersRepository;
import com.epam.hospital_spring_boot.service.UsersService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    private UsersRepository usersRepository;


    @Override
    public List<Users> displayAll() {
        return this.usersRepository.displayAll();
    }

    @Override
    public void add(Users user) {
        this.usersRepository.add(user);
    }

    @Override
    public void deleteById(Long idUsers) {
        this.usersRepository.deleteById(idUsers);
    }

    @Override
    public void update(Long idUsers, Users user) {
        this.usersRepository.update(idUsers, user);
    }

    @Override
    public Users findById(Long idUsers) {
        return this.usersRepository.findById(idUsers);
    }
}
