package main.java.com.app.tasks_4.task_4_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* 4.3. Дана строка, содержащая в себе, помимо прочего, номера телефонов.
* Необходимо удалить из этой строки префиксы локальных номеров,
* соответствующих Ижевску. Например, из "+7 (3412) 517-647" получить "517-647";
* "8 (3412) 4997-12" > "4997-12"; "+7 3412 90-41-90" > "90-41-90"
 */

public class StringNumber {

    public static void main(String[] args) {

        String phone1 = "+7(3412)517-647"; //517-647
        String phone2 = "8(3412)4997-12";  //4997-12
        String phone3 = "+7 3412 90-41-90";//90-41-90

        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}");
        Matcher matcher = pattern.matcher(phone1);

        Pattern pattern1 = Pattern.compile("\\d{4}-\\d{2}");
        Matcher matcher1 = pattern1.matcher(phone2);

        Pattern pattern2 = Pattern.compile("\\d{2}-\\d{2}-\\d{2}");
        Matcher matcher2 = pattern2.matcher(phone3);

        if(matcher.find() && matcher1.find() && matcher2.find()) {
            System.out.println(matcher.group(0) + "\n" + matcher1.group(0) +
                    "\n" + matcher2.group(0));

        }
    }
}
