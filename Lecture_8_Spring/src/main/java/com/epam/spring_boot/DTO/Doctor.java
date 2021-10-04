package com.epam.spring_boot.DTO;

import java.util.Objects;

public class Doctor extends Person {

    private int idDoctor;

    public Doctor() {
    }

    public Doctor(int idDoctor, String lastName, String firstName, String patronymic) {
        super(lastName, firstName, patronymic);
        this.idDoctor = idDoctor;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return idDoctor == doctor.idDoctor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idDoctor);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "idDoctor=" + idDoctor +
                ", lastName='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", patronymic='" + getPatronymic() +
                '}';
    }
}
