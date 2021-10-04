package main.java.com.app.dao.impl;

import main.java.com.app.dao.CommonMethodsService;
import main.java.com.app.dao.NumberOfRepetitionsService;

import java.util.*;

public class NumberOfRepetitionsServiceImpl implements NumberOfRepetitionsService {

    @Override
    public Map<String, Long> printAllWords(String words) {

        List<String> list = Arrays.asList(words.split("[()—,;:.!?\\s]+"));
        Map<String, Long> map = new HashMap<>();

        CommonMethodsService.commonMethod(list, map);

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println("Слово = " + entry.getKey() + " : " + "Повторений = " + entry.getValue());
        }
        return map;
    }

    @Override
    public Map<String, Long> printUniqueWords(String words) {

        List<String> list = Arrays.asList(words.split("[()—,;:.!?\\s]+"));
        Map<String, Long> map = new HashMap<>();

        CommonMethodsService.commonMethod(list, map);

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Слово = " + entry.getKey() + " : " + "Повторений = " + entry.getValue());
            }
        }
        return map;
    }

    // сортировка по алфавиту по ключу
    @Override
    public List<String> sortedMap(String words) {

        List<String> list = Arrays.asList(words.split("[()—,;:.!?\\s]+"));
        Map<String, Long> map = new HashMap<>();

        CommonMethodsService.commonMethod(list, map);

        List<Map.Entry<String, Long>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Long>>() {

            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for (Map.Entry<String, Long> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.println("Слово = " + entry.getKey() + " : " + "Повторений = " + entry.getValue());
            }
        }
        return list;
    }
}


