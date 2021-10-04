package com.epam.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "prescription")
public class Prescription implements Serializable {

    @Id
    @GeneratedValue
    private Long idPrescription;

    @Column(name = "name_prescription")
    private String namePrescription;

    @Column(name = "type_prescription")
    private String typePrescription;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "prescription")
    private List<Reception> receptions;
}
