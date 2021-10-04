package com.epam.hospital.service;

import com.epam.hospital.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Date;

@Service
public class DemoService {

    private final UserService userService;

    @Autowired
    public DemoService(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init() {

        System.out.println("Вывести пользвателя что дабавлен");
        userService.addUser(new User("dasads", "dasdsa", "dsadasdas",
                new Date(1994-4-23), "dsa", "das", "dsad@yandex.ru"));
    }
}
