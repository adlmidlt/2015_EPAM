package com.epam.hospital_spring_boot.service;

import com.epam.hospital_spring_boot.entity.Patient;
import com.epam.hospital_spring_boot.entity.Users;
import com.epam.hospital_spring_boot.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service("demoService")
public class DemoService {

    @Autowired
    private UsersService usersService;

    @Autowired
    private PatientService patientService;

    public void start() {

/*        Patient patient = patientService.findPatientById(1L);
        System.out.println("rwqegwqehwqeghwqejhwqe" + patient.getIdPatient());
        System.out.println("rwqegwqehwqeghwqejhwqe" + patient.getAddress());
        System.out.println("rwqegwqehwqeghwqejhwqe" + patient.getPhoneNumber());
        System.out.println("dasdsadasdsads" + patient.getUser().getLastName());*/

/*        patientService.add(new Patient("dsad", 787779, 1L));*/
/*    List<Patient> patients = patientService.displayAll();
        for (Patient pat:patients
             ) {
            System.out.println(pat);
        }*/
/*        Users user1 = new Users();
        user1.setLastName("Lar3i323onov");
        user1.setFirstName("An3at322oly");
        user1.setPatronymic("D3mi32trievich");
        user1.setDateOfBirth(new Date(4-23-1994));
        user1.setLogin("log321");
        user1.setPassword("p32as1");
        user1.setEmail("la3d@3kak.com");

        Users user2 = new Users();
        user2.setLastName("L3a323ionov1");
        user2.setFirstName("An3a2332toly1");
        user2.setPatronymic("D3m3232itrievich1");
        user2.setDateOfBirth(new Date(4-23-1994));
        user2.setLogin("log432311");
        user2.setPassword("p3232as11");
        user2.setEmail("lad3233231@kak.com");

        usersService.add(user1);
        usersService.add(user2);*/

/*        System.out.println("Display all users");
        List<Users> users = usersService.displayAllUsers();
        for (Users user : users) {
            System.out.println(user);
        }*/
    }

}
