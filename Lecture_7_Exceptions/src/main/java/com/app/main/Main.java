package main.java.com.app.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import static main.java.com.app.main.Reader.readFile;

/**
 * Created by Andrey_Vaganov on 12/5/2016.
 */

public class Main {

    /**
     * Точка входа в программу
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


