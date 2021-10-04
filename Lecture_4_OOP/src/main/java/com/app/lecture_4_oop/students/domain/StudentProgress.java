package main.java.com.app.lecture_4_oop.students.domain;

import java.util.Objects;

public class StudentProgress {

    private String object;
    private int mark;

    public StudentProgress(String object, int mark) {
        this.object = object;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentProgress that = (StudentProgress) o;
        return mark == that.mark &&
                Objects.equals(object, that.object);
    }

    @Override
    public int hashCode() {

        return Objects.hash(object, mark);
    }

    @Override
    public String toString() {
        return "StudentProgress{" +
                "object='" + object + '\'' +
                ", mark=" + mark +
                '}';
    }
}
