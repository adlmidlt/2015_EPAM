package com.epam.spring_boot;

import com.epam.spring_boot.DTO.Doctor;
import com.epam.spring_boot.DTO.Nurse;
import com.epam.spring_boot.DTO.Patient;
import com.epam.spring_boot.service.DoctorService;
import com.epam.spring_boot.service.NurseService;
import com.epam.spring_boot.service.PatientService;
import com.epam.spring_boot.service.impl.DoctorServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.security.DenyAll;

@Configuration
@SpringBootApplication
public class ExampleApplications {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(ExampleApplications.class, args);

        PatientService patientService = applicationContext.getBean(PatientService.class);
        patientService.add(new Patient(1, "Sidorov", "Ivan", "Petrovich"));
        patientService.add(new Patient(2, "Petrov", "Pety", "Borodach"));
        patientService.add(new Patient(3, "Klinov", "Zheka", "Lomovich"));
        patientService.findAll();
        patientService.deleteById(1);
        patientService.findAll();
        patientService.update(1, new Patient(3, "Klinov", "Zh", "Lomovich"));
        patientService.findAll();
        patientService.findById(1);

        System.out.println();

        DoctorService doctorService = applicationContext.getBean(DoctorService.class);
        doctorService.add(new Doctor(1, "Simkov", "Sim", "Simovich"));
        doctorService.add(new Doctor(2, "Simkova", "Sima", "Simovich"));
        doctorService.findAll();
        doctorService.deleteById(0);
        doctorService.findAll();
        doctorService.update(0, new Doctor(2, "Petrova", "Sima", "Simovich"));
        doctorService.findAll();
        doctorService.findById(0);

        System.out.println();

        NurseService nurseService = applicationContext.getBean(NurseService.class);
        nurseService.add(new Nurse(1, "Simkov", "Sim", "Simovich"));
        nurseService.add(new Nurse(2, "Simkova", "Sima", "Simovich"));
        nurseService.findAll();
        nurseService.deleteById(0);
        nurseService.findAll();
        nurseService.update(0, new Nurse(2, "Petrova", "Sima", "Simovich"));
        nurseService.findAll();
        nurseService.findById(0);
    }
}
