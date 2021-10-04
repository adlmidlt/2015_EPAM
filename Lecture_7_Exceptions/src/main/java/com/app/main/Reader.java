package main.java.com.app.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reader {

    /**
     * Формат даты
     */
    private static final String DATE_FORMAT_PATTERN = "dd.MM.yyyy";

    /**
     * Форматтер, используется для преобразования строк в даты и обратно
     */
    private static SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT_PATTERN);

    /**
     * Метод для чтения дат из файла
     */
    public static void readFile() throws IOException {
        //Открываем потоки на чтение из файла
        try (
                FileReader reader = new FileReader("src\\main\\java\\com\\app\\resources\\file.txt");
                BufferedReader byfReader = new BufferedReader(reader)) {

            //Читаем первую строку из файла
            try {
                String strDate = byfReader.readLine();

                while (strDate != null) {
                    //Преобразуем строку в дату
                    Date date = null;
                    try {
                        date = parseDate(strDate);
                    } catch (ParseException e) {
                        System.out.println("Неверный формат даты!");
                    }

                    //Выводим дату в консоль в формате dd-mm-yy
                    if (date != null)
                        System.out.printf("%1$td-%1$tm-%1$ty %n", date);

                    //Читаем следующую строку из файла
                    strDate = byfReader.readLine();
                }
            }catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /**
     * Метод преобразует строковое представление даты в класс Date
     * @param strDate строковое представление даты
     * @return
     */
    public static Date parseDate (String strDate) throws ParseException {
        return dateFormatter.parse(strDate);
    }
}
