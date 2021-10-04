package com.epam.spring_boot.DTO;

import java.util.Objects;

public class Nurse extends Person {

    private int idNurse;

    public Nurse() {
    }

    public Nurse(int idNurse, String lastName, String firstName, String patronymic) {
        super(lastName, firstName, patronymic);
        this.idNurse = idNurse;
    }

    public int getIdNurse() {
        return idNurse;
    }

    public void setIdNurse(int idPerson) {
        this.idNurse = idNurse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Nurse nurse = (Nurse) o;
        return idNurse == nurse.idNurse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idNurse);
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "idNurse=" + idNurse +
                ", lastName='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", patronymic='" + getPatronymic() +
                '}';
    }
}
