package main.java.com.app.lecture_4_oop.students.dao.impl;

import main.java.com.app.lecture_4_oop.students.dao.GroupService;
import main.java.com.app.lecture_4_oop.students.domain.Group;
import main.java.com.app.lecture_4_oop.students.domain.Student;
import main.java.com.app.lecture_4_oop.students.domain.StudentProgress;

public class GroupServiceImpl implements GroupService {

    @Override
    public double getAvgGroupMark(Group group) {

        double sumStudent = 0;
        double countStudent = 0;
        for (Student student : group.getStudents()) {
            for (StudentProgress progress : student.getStudentProgresses()) {
                sumStudent += progress.getMark();
                countStudent++;
            }
        }
        return countStudent == 0 ? 0 : sumStudent / countStudent;
    }

    @Override
    public int getCountOfHighAchieverStudent(Group group) {

        int countStudent = 0;
        boolean highMark = true;

        for (Student student : group.getStudents()) {
            for (StudentProgress progress : student.getStudentProgresses()) {
                if (progress.getMark() < 5) {
                    highMark = false;
                    break;
                }
            }
            if (highMark) {
                countStudent++;
            }
        }
        return countStudent;
    }

    @Override
    public int getCountUnsatisfactoryStudent(Group group) {

        int countStudents = 0;

        for (Student student : group.getStudents()) {
            for (StudentProgress progress : student.getStudentProgresses()) {
                if (progress.getMark() <= 2) {
                    countStudents++;
                    break;
                }
            }
        }
        return countStudents;
    }
}
