package com.epam.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "reception")
public class Reception implements Serializable {

    @Id
    @GeneratedValue
    private Long idReception;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Column(name = "reception_date")
    private Date receptionDate;

    @Column(name = "preliminary_diagnosis")
    private String preliminaryDiagnosis;

    @Column(name = "discharge_date")
    private Date dischargeDate;

    @Column(name = "final_diagnosis")
    private String finalDiagnosis;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_id")
    private Personal personal;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "reception_prescription",
        joinColumns = @JoinColumn(name = "reception"),
        inverseJoinColumns = @JoinColumn(name = "prescription")
    )
    private List<Prescription> prescriptions;
}
