package main.java.com.app.lecture_4_oop.students.dao;

import main.java.com.app.lecture_4_oop.students.domain.Group;

public interface GroupService {

    double getAvgGroupMark(Group group);
    int getCountOfHighAchieverStudent(Group group);
    int getCountUnsatisfactoryStudent(Group group);
}
