package com.epam.hospital_spring_boot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "reception")
public class Reception implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_reception")
    private Long idReception;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "reception_date")
    private Date receptionDate;

    @Column(name = "preliminary_diagnosis")
    private String preliminaryDiagnosis;

    @Column(name = "discharge_date")
    private Date dischargeDate;

    @Column(name = "final_diagnosis")
    private String finalDiagnosis;

    @Column(name = "personal_id")
    private Long personalId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patient_id", nullable = false, insertable = false, updatable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personal_id", nullable = false, insertable = false, updatable = false)
    private Personal personal;

    @ManyToMany(fetch = FetchType.LAZY,
    cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "reception_and_prescription",
    joinColumns = {@JoinColumn(name = "reception_id")},
    inverseJoinColumns = {@JoinColumn(name = "prescription_id")})
    private List<Prescription> prescriptions = new ArrayList<>();

    public Reception() {
    }

    public Long getIdReception() {
        return idReception;
    }

    public void setIdReception(Long idReception) {
        this.idReception = idReception;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Date getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(Date receptionDate) {
        this.receptionDate = receptionDate;
    }

    public String getPreliminaryDiagnosis() {
        return preliminaryDiagnosis;
    }

    public void setPreliminaryDiagnosis(String preliminaryDiagnosis) {
        this.preliminaryDiagnosis = preliminaryDiagnosis;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getFinalDiagnosis() {
        return finalDiagnosis;
    }

    public void setFinalDiagnosis(String finalDiagnosis) {
        this.finalDiagnosis = finalDiagnosis;
    }

    public Long getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Long personalId) {
        this.personalId = personalId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reception reception = (Reception) o;
        return Objects.equals(idReception, reception.idReception) &&
                Objects.equals(patientId, reception.patientId) &&
                Objects.equals(receptionDate, reception.receptionDate) &&
                Objects.equals(preliminaryDiagnosis, reception.preliminaryDiagnosis) &&
                Objects.equals(dischargeDate, reception.dischargeDate) &&
                Objects.equals(finalDiagnosis, reception.finalDiagnosis) &&
                Objects.equals(personalId, reception.personalId) &&
                Objects.equals(patient, reception.patient) &&
                Objects.equals(personal, reception.personal) &&
                Objects.equals(prescriptions, reception.prescriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReception, patientId, receptionDate, preliminaryDiagnosis, dischargeDate, finalDiagnosis, personalId, patient, personal, prescriptions);
    }

    @Override
    public String toString() {
        return "Reception{" +
                "idReception='" + idReception + '\'' +
                ", patientId='" + patientId + '\'' +
                ", receptionDate=" + receptionDate +
                ", preliminaryDiagnosis='" + preliminaryDiagnosis + '\'' +
                ", dischargeDate=" + dischargeDate +
                ", finalDiagnosis='" + finalDiagnosis + '\'' +
                ", personalId=" + personalId +
                ", patient=" + patient +
                ", personal=" + personal +
                ", prescriptions=" + prescriptions +
                '}';
    }
}
