package main.java.com.app.service;

import com.app.dao.NumberOfRepetitionsService;
import com.app.dao.impl.NumberOfRepetitionsServiceImpl;
import com.app.dao.impl.NumberOfRepetitionsServiceImplStream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DemoService {

    public static void start() throws IOException {

        NumberOfRepetitionsService numberOfRepetitionsService = new NumberOfRepetitionsServiceImpl();
        NumberOfRepetitionsService numberOfRepetitionsService1 = new NumberOfRepetitionsServiceImplStream();

        // Читаем весь текс, а не по строкам
        StringBuilder s = new StringBuilder();
        try (Scanner in = new Scanner(new File("src\\main\\java\\com\\app\\resources\\text.txt"))) {
            while (in.hasNext()) {
                s.append(in.nextLine()).append("\r\n");
            }

            System.out.println("JAVA 7");
            System.out.println("Вывести все слова: ");
            numberOfRepetitionsService.printAllWords(s.toString());

            System.out.println("\nВывести уникальные слова: ");
            numberOfRepetitionsService.printUniqueWords(s.toString());

            System.out.println("\nОтсортированные слова");
            numberOfRepetitionsService.sortedMap(s.toString());

            System.out.println("\nSTREAM JAVA 8");
            System.out.println("\nВывести все слова: ");
            numberOfRepetitionsService1.printAllWords(s.toString());

            System.out.println("\nУникальные слова");
            numberOfRepetitionsService1.printUniqueWords(s.toString());

            System.out.println("\nОтсортированные слова: ");
            numberOfRepetitionsService1.sortedMap(s.toString());
        }
    }
}
