package com.epam.spring_boot.DTO;

import java.util.Objects;

public class Patient extends Person {

    private int idPatient;

    public Patient() {
    }

    public Patient(int idPatient, String lastName, String firstName, String patronymic) {
        super(lastName, firstName, patronymic);
        this.idPatient = idPatient;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return idPatient == patient.idPatient;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idPatient);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "idPatient=" + idPatient +
                ", lastName='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", patronymic='" + getPatronymic() +
                '}';
    }
}
