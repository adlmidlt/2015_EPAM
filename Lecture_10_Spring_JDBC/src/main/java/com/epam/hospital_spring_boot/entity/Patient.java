package com.epam.hospital_spring_boot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_patient")
    private Long idPatient;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "users_id_patient")
    private Long usersId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "users_id_patient", nullable = false, insertable = false, updatable = false)
    private Users user;

    @OneToMany(cascade = CascadeType.ALL,
    fetch = FetchType.LAZY, mappedBy = "patient")
    private List<Reception> receptions = new ArrayList<>();

    public Patient() {
    }

    public Patient(Users user, String address, Integer phoneNumber, Long usersId) {
        this.user = user;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.usersId = usersId;
    }

    public Long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getUsersId() {
        return usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
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
        Patient patient = (Patient) o;
        return Objects.equals(idPatient, patient.idPatient) &&
                Objects.equals(address, patient.address) &&
                Objects.equals(phoneNumber, patient.phoneNumber) &&
                Objects.equals(usersId, patient.usersId) &&
                Objects.equals(user, patient.user) &&
                Objects.equals(receptions, patient.receptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPatient, address, phoneNumber, usersId, user, receptions);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "idPatient=" + idPatient +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", usersId=" + usersId +
                ", user=" + user +
                ", receptions=" + receptions +
                '}';
    }
}
