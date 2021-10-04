package com.epam.hospital.service;

import com.epam.hospital.Entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    User getUserById(Long idUser);
    List<User> findListAllUser();
    void deleteUserById(Long idUser);
    void updateUser(Long idUser, User user);
}
