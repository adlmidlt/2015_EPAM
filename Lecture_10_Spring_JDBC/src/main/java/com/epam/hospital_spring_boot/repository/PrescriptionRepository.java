package com.epam.hospital_spring_boot.repository;

import com.epam.hospital_spring_boot.entity.Prescription;

public interface PrescriptionRepository extends BasicRepository<Prescription> {

    Prescription findByIdPersonalPrescription(Long personalId);
}
