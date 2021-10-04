package main.java.com.app.lecture_4_oop.students.service;

import com.app.lecture_4_oop.students.dao.GroupService;
import com.app.lecture_4_oop.students.dao.MarksCalculationService;
import com.app.lecture_4_oop.students.dao.impl.GroupServiceImpl;
import com.app.lecture_4_oop.students.dao.impl.MarksCalculationServiceImpl;
import com.app.lecture_4_oop.students.domain.Group;
import com.app.lecture_4_oop.students.domain.Student;
import com.app.lecture_4_oop.students.domain.StudentProgress;

public class DemoService {

    public static void main() {

        Student[] students = new Student[3];
        students[0] = new Student(
                new StudentProgress[]{
                        new StudentProgress("Алгебра", 5),
                        new StudentProgress("Химия", 5),
                        new StudentProgress("Мат. Анализ", 5),
                        new StudentProgress("Анализ", 5)
                }, "Анатолий"
        );
        students[1] = new Student(
                new StudentProgress[]{
                        new StudentProgress("Алгебра", 2),
                        new StudentProgress("Химия", 2),
                        new StudentProgress("Мат. Анализ", 2),
                        new StudentProgress("Анализ", 2)
                }, "Евгений"
        );
        students[2] = new Student(
                new StudentProgress[]{
                        new StudentProgress("Алгебра", 2),
                        new StudentProgress("Химия", 2),
                        new StudentProgress("Мат. Анализ", 2),
                        new StudentProgress("Анализ", 2)
                }, "Петр"
        );

        Group group = new Group(students);
        MarksCalculationService marksCalculationService = new MarksCalculationServiceImpl();

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + " : " +
                    marksCalculationService.getAvgStudentMark(students[i]));
        }

        GroupService groupService = new GroupServiceImpl();
        System.out.println("Средняя оценка группы:");
        System.out.println(groupService.getAvgGroupMark(group));

        System.out.println("Количество отличников:");
        System.out.println(groupService.getCountOfHighAchieverStudent(group));

        System.out.println("Количество двоечников:");
        System.out.println(groupService.getCountUnsatisfactoryStudent(group));
    }
}
