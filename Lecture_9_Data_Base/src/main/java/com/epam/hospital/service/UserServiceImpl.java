package com.epam.hospital.service;

import com.epam.hospital.Entity.User;
import com.epam.hospital.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(User user) {
        this.userDAO.addUser(user);
    }

    @Override
    public User getUserById(Long idUser) {
        return this.userDAO.getUserById(idUser);
    }

    @Override
    public List<User> findListAllUser() {
        return this.userDAO.findListAllUser();
    }

    @Override
    public void deleteUserById(Long idUser) {
        this.userDAO.deleteUserById(idUser);
    }

    @Override
    public void updateUser(Long idUser, User user) {
        this.userDAO.updateUser(idUser, user);
    }
}
