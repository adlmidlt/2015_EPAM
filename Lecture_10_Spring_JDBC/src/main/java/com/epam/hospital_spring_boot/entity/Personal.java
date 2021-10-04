package com.epam.hospital_spring_boot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "personal")
public class Personal implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_personal")
    private Long idPersonal;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "personal_role")
    private String personalRole;

    @Column(name = "users_id_personal")
    private Long usersId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "users_id_personal", nullable = false, insertable = false, updatable = false)
    private Users user;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, mappedBy = "personal")
    private List<Reception> receptions = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, mappedBy = "personal")
    private List<Prescription> prescriptions = new ArrayList<>();

    public Personal() {
    }

    public Long getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Long idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPersonalRole() {
        return personalRole;
    }

    public void setPersonalRole(String personalRole) {
        this.personalRole = personalRole;
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
        Personal personal = (Personal) o;
        return Objects.equals(idPersonal, personal.idPersonal) &&
                Objects.equals(specialization, personal.specialization) &&
                Objects.equals(personalRole, personal.personalRole) &&
                Objects.equals(usersId, personal.usersId) &&
                Objects.equals(user, personal.user) &&
                Objects.equals(receptions, personal.receptions) &&
                Objects.equals(prescriptions, personal.prescriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersonal, specialization, personalRole, usersId, user, receptions, prescriptions);
    }

    @Override
    public String toString() {
        return "Personal{" +
                "idPersonal=" + idPersonal +
                ", specialization='" + specialization + '\'' +
                ", personalRole='" + personalRole + '\'' +
                ", usersId='" + usersId + '\'' +
                ", user=" + user +
                ", receptions=" + receptions +
                ", prescriptions=" + prescriptions +
                '}';
    }
}
