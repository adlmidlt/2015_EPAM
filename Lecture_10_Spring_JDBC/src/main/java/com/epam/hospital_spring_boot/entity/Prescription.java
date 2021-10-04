package com.epam.hospital_spring_boot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "prescription")
public class Prescription implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_prescription")
    private Long idPrescription;

    @Column(name = "name_prescription")
    private String namePrescription;

    @Column(name = "type_prescription")
    private String typePrescription;

    @Column(name = "description")
    private String description;

    @Column(name = "personal_id_prescription")
    private Long personalId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personal_id_prescription", nullable = false, insertable = false, updatable = false)
    private Personal personal;

    @ManyToMany(fetch = FetchType.LAZY,
    cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }, mappedBy = "prescriptions")
    private List<Reception> receptions = new ArrayList<>();

    public Prescription() {
    }

    public Long getIdPrescription() {
        return idPrescription;
    }

    public void setIdPrescription(Long idPrescription) {
        this.idPrescription = idPrescription;
    }

    public String getNamePrescription() {
        return namePrescription;
    }

    public void setNamePrescription(String namePrescription) {
        this.namePrescription = namePrescription;
    }

    public String getTypePrescription() {
        return typePrescription;
    }

    public void setTypePrescription(String typePrescription) {
        this.typePrescription = typePrescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Long personalId) {
        this.personalId = personalId;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<Reception> getReceptions() {
        return receptions;
    }

    public void setReceptions(List<Reception> receptions) {
        this.receptions = receptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return Objects.equals(idPrescription, that.idPrescription) &&
                Objects.equals(namePrescription, that.namePrescription) &&
                Objects.equals(typePrescription, that.typePrescription) &&
                Objects.equals(description, that.description) &&
                Objects.equals(personalId, that.personalId) &&
                Objects.equals(personal, that.personal) &&
                Objects.equals(receptions, that.receptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrescription, namePrescription, typePrescription, description, personalId, personal, receptions);
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "idPrescription=" + idPrescription +
                ", namePrescription='" + namePrescription + '\'' +
                ", typePrescription='" + typePrescription + '\'' +
                ", description='" + description + '\'' +
                ", personalId=" + personalId +
                ", personal=" + personal +
                ", receptions=" + receptions +
                '}';
    }
}
