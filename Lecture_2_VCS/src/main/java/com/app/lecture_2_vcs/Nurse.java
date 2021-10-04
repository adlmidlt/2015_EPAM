package main.java.com.app.lecture_2_vcs;

import java.util.Objects;

public class Nurse {

    private String diagnosis;

    public Nurse() {
    }

    public Nurse(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nurse nurse = (Nurse) o;
        return Objects.equals(diagnosis, nurse.diagnosis);
    }

    @Override
    public int hashCode() {

        return Objects.hash(diagnosis);
    }
}
