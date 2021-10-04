package main.java.com.app.lecture_4_oop.students.dao.impl;

import main.java.com.app.lecture_4_oop.students.dao.MarksCalculationService;
import main.java.com.app.lecture_4_oop.students.domain.Student;
import main.java.com.app.lecture_4_oop.students.domain.StudentProgress;

public class MarksCalculationServiceImpl implements MarksCalculationService {

    @Override
    public double getAvgStudentMark(Student student) {
        double sum = 0;
        double count = 0;

        for (StudentProgress progress : student.getStudentProgresses()) {
            sum += progress.getMark();
            count++;
        }

        return count == 0 ? 0 : sum / count;
    }
}
