package main.java.com.app.lecture_4_oop.students.domain;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private StudentProgress[] studentProgresses;
    private String name;

    public Student(StudentProgress[] studentProgresses, String name) {
        this.studentProgresses = studentProgresses;
        this.name = name;
    }

    public StudentProgress[] getStudentProgresses() {
        return studentProgresses;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Arrays.equals(studentProgresses, student.studentProgresses) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(studentProgresses);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentProgresses=" + Arrays.toString(studentProgresses) +
                ", name='" + name + '\'' +
                '}';
    }
}
