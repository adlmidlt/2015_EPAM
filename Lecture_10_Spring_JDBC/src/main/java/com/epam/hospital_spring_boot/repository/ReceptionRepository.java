package com.epam.hospital_spring_boot.repository;

import com.epam.hospital_spring_boot.entity.Reception;

public interface ReceptionRepository extends BasicRepository<Reception> {

    Reception findByIdPatientReception(Long patientId);
    Reception findByIdPersonalReception(Long personalId);
}
