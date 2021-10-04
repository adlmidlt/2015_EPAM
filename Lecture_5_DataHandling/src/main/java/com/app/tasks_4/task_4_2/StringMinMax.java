package main.java.com.app.tasks_4.task_4_2;

/*
* 4.2. В предыдущей задаче (4.1) найти самое короткое слово, самое длинное слово*/

public class StringMinMax {

    public static void main(String[] args) {

        String str = "\"Ребе, Ви случайно не знаете, сколько тогда Иуда получил по нынешнему курсу?\"";
        String tmp = "";
        String maxLength = "";
        String minLength = str;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                maxLength = maxLength.length() < tmp.length() ? tmp : maxLength;
                minLength = minLength.length() > tmp.length() ? tmp : minLength;
                tmp = "";
            } else tmp += str.charAt(i);
        }
        System.out.print("Длинное слово \"" + maxLength + "\"\nКороткое слово \"" + minLength + "\"");
    }
}
